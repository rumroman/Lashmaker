package app.entity;


import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

import javax.persistence.*;

/**
 *
 *  Услуги по наращиванию ресниц
 */
@Entity
@Data
@Table(name = "eye_lash_price")
public class EyeLashService {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private long id;

    @ManyToOne( cascade = CascadeType.MERGE)
    @JoinColumn(name = "master_id",nullable = false)
    private Master serviceMaster;

    @Column(name = "eyelash_service_name")
    private String eyeLashServiceName;

    @Column(nullable = false)
    private String price;

    @Column(name = "description")
    private String description;

}
