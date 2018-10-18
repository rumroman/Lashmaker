package app.model;


import javax.persistence.*;
import java.io.Serializable;

/**
 * Клиенты
 *
 */
@Entity
@Table(name = "client")
public class  Customer implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false,name = "customer_name")
    private String customerName;

    @Column(name = "number_phone",nullable = false,unique = true)
    private String numberPhone;


    @Column(name = "bonus_count")
    private int bonusCount;

    @Column(name = "visit_count")
    private int visitCount;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public int getBonusCount() {
        return bonusCount;
    }

    public void setBonusCount(int bonusCount) {
        this.bonusCount = bonusCount;
    }

    public int getVisitCount() {
        return visitCount;
    }

    public void setVisitCount(int visitCount) {
        this.visitCount = visitCount;
    }


}
