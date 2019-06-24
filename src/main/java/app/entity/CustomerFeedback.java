package app.entity;


import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

import javax.persistence.*;

/**
 * Отзывы
 */

@Entity
@Data
@Table(name = "customer_feedback")
public class CustomerFeedback {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private long id;

    // Дата написания отзыва
    @Column(nullable = false)
    private String date;

    // Сообщение отзыва
    @Column(name = "feedback_message")
    private String feedbackMessage;

    // Запись из журнала
    @OneToOne
    private Journal journal;

}
