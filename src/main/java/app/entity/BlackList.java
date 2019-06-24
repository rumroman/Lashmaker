package app.entity;


import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

import javax.persistence.*;

/**
 *
 * Черный список клиентов
 */
@Entity
@Data
@Table(name = "black_list")
public class BlackList {

    @Id
    @Column(nullable = false)
    @Setter(AccessLevel.NONE)
    private long id;

    @Column(nullable = false, unique = true, name = "customer_id")
    private long customerId;

    /**
     * Причина
     */
    @Column(nullable = false)
    private String description;

    /**
     * Дата , когда был помещен в чс
     */
    @Column(nullable = false)
    private String date;

}
