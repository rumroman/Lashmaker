package app.entity;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Data
@Table(name = "address")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private long id;

    @Column(name = "city", nullable = false, length = 30)
    private String city;

    @Column(name = "street", nullable = false, length = 50)
    private String street;

    @Column(name = "home", nullable = false)
    private int home;

    @Column(name = "apartment", nullable = false)
    private int apartment;

    @Column(name = "build")
    private String build;

}
