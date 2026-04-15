package dasturlash.uz.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter

@Entity
@Table(name = "emergency_room")
public class EmergencyRoom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String name;
    @Column(name = "hospital_id")
    private Integer hospitalId;
    @JoinColumn(name = "hospital_id", insertable = false, updatable = false)
    @OneToOne
    private Hospital hospital;
}
