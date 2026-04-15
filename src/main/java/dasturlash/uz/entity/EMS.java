package dasturlash.uz.entity;

import javax.persistence.*;

@Entity
public class EMS {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String code;

}
