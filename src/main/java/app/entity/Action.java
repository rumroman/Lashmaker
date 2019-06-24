package app.entity;


import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

import javax.persistence.*;

/**
 * Акции
 *
 */
@Entity
@Data
@Table(name = "action")
public class Action {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private long id;

//    @Column(nullable = false, name = "master_id")
//    private long masterId;
    @OneToOne
    @JoinColumn(name = "master_id",nullable = false)
    private Master master;

    @Column(nullable = false,unique = true,name = "name")
    private String name;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false, name = "enable")
    private boolean enable;

}
