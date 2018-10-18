package app.model;


import javax.persistence.*;

/**
 *
 *  Услуги по наращиванию ресниц
 */
@Entity
@Table(name = "eye_lash_price")
public class EyeLashService {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "master_id",nullable = false)
    private Master serviceMaster;

    @Column(name = "service_name")
    private String eyeLashServiceName;

    @Column(nullable = false)
    private String price;



    public String getEyeLashServiceName() {
        return eyeLashServiceName;
    }

    public void setEyeLashServiceName(String eyeLashServiceName) {
        this.eyeLashServiceName = eyeLashServiceName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Master getServiceMaster() {
        return serviceMaster;
    }

    public void setServiceMaster(Master serviceMaster) {
        this.serviceMaster = serviceMaster;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }


}
