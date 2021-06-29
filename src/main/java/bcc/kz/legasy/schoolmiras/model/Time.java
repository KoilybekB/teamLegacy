package bcc.kz.legasy.schoolmiras.model;

import lombok.*;

import javax.persistence.*;
import java.time.DayOfWeek;

@Builder(toBuilder = true)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "dn_time", schema = "public")
public class Time {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @Column(name = "t_day")
    private DayOfWeek day;

    @Column(name = "t_start")
    private String start;

    @Column(name = "t_end")
    private String end;

}
