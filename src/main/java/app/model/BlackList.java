package app.model;


import javax.persistence.*;

/**
 *
 * Черный список клиентов
 */
@Entity
@Table(name = "black_list")
public class BlackList {



//    @OneToOne       // Сделать бы двунаправленную связь, cascade = DELETE
//    @JoinColumn(name = "client_id")
//    private Customer client;

    @Id
    private int id;

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



    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
