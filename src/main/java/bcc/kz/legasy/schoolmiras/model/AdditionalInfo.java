package bcc.kz.legasy.schoolmiras.model;

import lombok.*;

import javax.persistence.*;

@Builder(toBuilder = true)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "dn_additional_info", schema = "public")
public class AdditionalInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "homework", length = 512)
    private String homework;

    @Column(name = "title", length = 512)
    private String title;

}
