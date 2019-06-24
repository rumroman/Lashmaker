package app.entity;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

import javax.persistence.*;

/**
 *
 * Возможное время записи
 */
@Entity
@Data
@Table(name = "recording_time")
public class RecordingTime {

    @Id
    @Setter(AccessLevel.NONE)
    private long id;

    // для mysql DATETIME YYYY-MM-DD
    @Column(unique = true,nullable = false)
    private String date;

}
