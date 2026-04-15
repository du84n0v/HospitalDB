package dasturlash.uz.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter

@Entity
@Table(name = "phone_number")
public class PhoneNumber {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String phoneNumber;
    @Column(name = "hospital_id")
    private Integer hospitalId;
    @JoinColumn(name = "hospital_id", insertable = false, updatable = false)
    @ManyToOne
    private Hospital hospital;
}
