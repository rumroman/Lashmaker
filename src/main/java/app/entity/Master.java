package app.entity;


import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

/**
 *
 * Мастер по наращиванию ресниц
 */
@Entity
@Data
@Table(name = "master")
public class Master implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private long id;

    // Для двунаправленной связи
//    @OneToMany(fetch = FetchType.EAGER, mappedBy = "serviceMaster")
//    private Set<EyeLashService> services;

    /**
     * Ссылки на фото работ
     */
    // default fetch Lazy
//    @OneToMany
//    private Set<Photo> photos;
//
//    @OneToMany
//    private Set<RecordingTime> recordingTimes;

    /**
     *
     * Акция , которую проводит мастер
     */
    @OneToMany
    @JoinColumn(name = "action_id")
    private Set<Action> action;

    @ManyToOne
    private Address address;

    /**
     *
     * Имя мастера
     */
    @Column(name = "name",unique = true,nullable = false, length = 25)
    private String name;

    /**
     *
     * Информация о мастере
     */
    @Column(name = "personal_info",unique = true,nullable = false)
    private String personalInfo;

}
