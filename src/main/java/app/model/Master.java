package app.model;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

/**
 *
 * Мастер по наращиванию ресниц
 */
@Entity
@Table(name = "master")
public class Master implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    // Для двунаправленной связи
//    @OneToMany(fetch = FetchType.EAGER, mappedBy = "serviceMaster")
//    private Set<EyeLashService> services;

    /**
     * Ссылки на фото работ
     */
    @OneToMany
    private Set<Photo> photos;

    @OneToMany
    private Set<RecordingTime> recordingTimes;

    /**
     *
     * Квалификация мастера
     */
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "qualification_id")
    private Qualification qualification;


    /**
     *
     * Акция , которую проводит мастер
     */
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "action_id")
    private Action action;

    /**
     *
     * Имя мастера
     */
    @Column(name = "master_name",unique = true,nullable = false)
    private String masterName;

    /**
     *
     * Информация о мастере
     */
    @Column(name = "personal_info",unique = true,nullable = false)
    private String personalInfo;



    public Master(){

    }

    public Master(String masterName){
        this.masterName = masterName;
    }


    public String getMasterName() {
        return masterName;
    }

    public void setMasterName(String masterName) {
        this.masterName = masterName;
    }

    public String getPersonalInfo() {
        return personalInfo;
    }

    public void setPersonalInfo(String personalInfo) {
        this.personalInfo = personalInfo;
    }

//    public Set<EyeLashService> getServices() {
//        return services;
//    }
//
//    public void setServices(Set<EyeLashService> services) {
//        this.services = services;
//    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Set<Photo> getPhotos() {
        return photos;
    }

    public void setPhotos(Set<Photo> photos) {
        this.photos = photos;
    }

    public Qualification getQualification() {
        return qualification;
    }

    public void setQualification(Qualification qualification) {
        this.qualification = qualification;
    }

    public Action getAction() {
        return action;
    }

    public void setAction(Action action) {
        this.action = action;
    }


    @Override
    public String toString(){
        return "HELLOW";
    }

    public Set<RecordingTime> getRecordingTimes() {
        return recordingTimes;
    }

    public void setRecordingTimes(Set<RecordingTime> recordingTimes) {
        this.recordingTimes = recordingTimes;
    }
}
