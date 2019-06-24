package app.entity;


import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.Immutable;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * Журнал записей.
 */
@Entity
@Data
@Table(name = "journal")
@Immutable
public class Journal implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private long id;

    @ManyToOne
    @JoinColumn(name = "eye_lash_service_id",nullable = false)
    private EyeLashService eyeLashService;

    @ManyToOne
    @JoinColumn(name = "client_id",nullable = false)
    private Customer customer;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false,updatable = false)
    private Date date;

}
