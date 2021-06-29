package bcc.kz.legasy.schoolmiras.model;

import lombok.*;

import javax.persistence.*;

@Builder(toBuilder = true)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "dn_room", schema = "public")
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @Column(name = "floor")
    private int floor;

    @Column(name = "code")
    private String code;

}
