package app.model;


import javax.persistence.*;
import java.io.Serializable;

/**
 *
 * Журнал записей.
 */
@Entity
@Table(name = "journal")
public class Journal implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "eye_lash_service_id",nullable = false)
    private EyeLashService eyeLashService;

    @ManyToOne
    @JoinColumn(name = "client_id",nullable = false)
    private Customer customer;


    @Column(nullable = false)
    private String date;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public EyeLashService getEyeLashService() {
        return eyeLashService;
    }

    public void setEyeLashService(EyeLashService eyeLashService) {
        this.eyeLashService = eyeLashService;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
