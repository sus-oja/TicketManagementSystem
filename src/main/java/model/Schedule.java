package model;


import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(schema = "theatre", name = "schedule")

public class Schedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "schedule_id")
    private Long scheduleId;

    @Column(name = "start_time")
    private Date startTime;
    //______________________
    @OneToOne(mappedBy = "schedule")
    private Ticket ticket;

    @OneToOne
    @JoinColumn(name = "location_id")
    private Location location;

    @OneToOne
    @JoinColumn(name = "show_id")
    private Shows show;

    public Schedule() {
    }

    public Schedule(Date startTime) {
        this.startTime = startTime;
    }

    public Long getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(Long scheduleId) {
        this.scheduleId = scheduleId;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Shows getShow() {
        return show;
    }

    public void setShow(Shows show) {
        this.show = show;
    }
}