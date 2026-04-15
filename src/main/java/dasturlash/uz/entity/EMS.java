package dasturlash.uz.entity;

import dasturlash.uz.enums.TriangleCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter

@Entity
public class EMS {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String code;
    @Column
    private LocalDateTime date;
    @Column(name = "triangle_code")
    @Enumerated(EnumType.STRING)
    private TriangleCode triangleCode;
    @Column(name = "patient_name")
    private String patientName;
    @Column(name = "hospital_id")
    private Integer hospitalId;
    @JoinColumn(name = "hospital_id", insertable = false, updatable = false)
    @ManyToOne
    private Hospital hospital;

    @Column(name = "transport_id")
    private Integer transportId;
    @JoinColumn(name = "transport_id", insertable = false, updatable = false)
    @ManyToOne
    private Transport transport;

    @Column(name = "driver_id")
    private Integer driverId;
    @JoinColumn(name = "driver_id", insertable = false, updatable = false)
    @ManyToOne
    private Employee driver;
    @Column(name = "employee1_id")
    private Integer employee1Id;
    @JoinColumn(name = "employee1_id", insertable = false, updatable = false)
    @ManyToOne
    private Employee employee1;
    @Column(name = "employee2_id")
    private Integer employee2Id;
    @JoinColumn(name = "employee2_id", insertable = false, updatable = false)
    @ManyToOne
    private Employee employee2;
}
