package dasturlash.uz.entity;

import dasturlash.uz.enums.TransportType;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter

@Entity
public class Transport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String code;
    @Enumerated(EnumType.STRING)
    private TransportType type;
    @Column(name = "hospital_id")
    private Integer hospitalId;
    @JoinColumn(name = "hospital_id", insertable = false, updatable = false)
    @ManyToOne
    private Hospital hospital;
}
