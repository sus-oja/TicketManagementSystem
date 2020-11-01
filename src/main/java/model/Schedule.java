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
    @Column(name = "show_id")
    private Long showId;
    @Column(name = "locationId")
    private Long locationId;

    public Schedule() {

    }

    public Schedule(Time startTime, Long showId, Long locationId) {
        this.startTime = startTime;
        this.showId = showId;
        this.locationId = locationId;
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

    public Long getShowId() {
        return showId;
    }

    public void setShowId(Long showId) {
        this.showId = showId;
    }

    public Long getLocationId() {
        return locationId;
    }

    public void setLocationId(Long locationId) {
        this.locationId = locationId;
    }
}