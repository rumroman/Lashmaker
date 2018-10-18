package app.model;

import javax.persistence.*;

/**
 *
 * Возможное время записи
 */
@Entity
@Table(name = "recording_time")
public class RecordingTime {

    @Id
    @Column(unique = true,nullable = false)
    private String date;


    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
