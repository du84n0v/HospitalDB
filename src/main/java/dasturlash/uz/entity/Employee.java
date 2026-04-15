package dasturlash.uz.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String snn;
    @Column
    private String name;
    @Column
    private String surname;
    @Column
    private String address;
    @Column
    private String phone;
}
