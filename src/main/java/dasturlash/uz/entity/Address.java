package dasturlash.uz.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter

@Entity
@Table(name = "address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String city;
    @Column
    private String street;
    @Column(name = "hospital_id")
    private Integer hospitalId;
    @JoinColumn(name = "hospital_id", insertable = false, updatable = false)
    @OneToOne
    private Hospital hospital;
}
