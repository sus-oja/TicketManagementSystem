package model;


import javax.persistence.*;
import java.sql.Time;

@Entity
@Table(schema = "theatre", name = "schedule")

public class Schedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "schedule_id")
    private Long scheduleId;
    @Column(name = "start_time")
    private Time startTime;

    @OneToMany(mappedBy = "schedule") //kas peaks olema ManyToMany?!
    private Ticket ticket;

    @OneToOne
    @JoinColumn(name = "location_id")
    private Location location;

    @OneToOne
    @JoinColumn(name = "show_id")
    private Shows show;


    public Schedule() {

    }

    public Schedule(Time startTime) {
        this.startTime = startTime;
    }

    public Long getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(Long scheduleId) {
        this.scheduleId = scheduleId;
    }

    public Time getStartTime() {
        return startTime;
    }

    public void setStartTime(Time startTime) {
        this.startTime = startTime;
    }

}