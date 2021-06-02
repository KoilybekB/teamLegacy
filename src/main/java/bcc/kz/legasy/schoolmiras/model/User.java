package bcc.kz.legasy.schoolmiras.model;

import lombok.*;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.Arrays;
import java.util.Collection;

@Table(name = "users", schema = "public")
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Setter
@Getter
public class User implements UserDetails{
    @Id
    @SequenceGenerator(name = "users_id_seq",
            sequenceName = "users_id_seq",
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "users_id_seq")

    @Column(name = "id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name="role_id")
    private Role roles;

    @Column(name = "login")
    private String login;
    @Column(name = "passwd")
    private String passwd;
    @Column(name = "status")
    private Integer status;


    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return Arrays.asList(roles);
    }

    @Override
    public String getPassword() {
        return passwd;
    }

    @Override
    public String getUsername() {
        return login;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

}
