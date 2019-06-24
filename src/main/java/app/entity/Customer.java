package app.entity;


import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Клиенты
 *
 */
@Entity
@Data
@Table(name = "client")
public class  Customer implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private long id;

    @Column(nullable = false,name = "customer_name", length = 30)
    private String customerName;

    @Column(name = "phone",nullable = false,unique = true, length = 11)
    private String phone;


    @Column(name = "bonus_count")
    private int bonusCount;

    @Column(name = "visit_count")
    private int visitCount;

    @Column(name = "vk_id", length = 100)
    private String vkId;

    @Column(name = "additional_info")
    private String additionalInfo;

}
