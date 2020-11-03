package model;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(schema = "theatre", name = "tickets")

public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "ticket_id")
    private Long ticketId;


    @Column(name = "price")
    private Double ticketPrice;

    @OneToOne
    @JoinColumn(name = "schedule_id")
    private Schedule schedule;

    @OneToOne (mappedBy = "ticket")
    private Client client;

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_at")
    private Date createdAt;

    @UpdateTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "last_updated")
    private Date lastUpdated;

    public Ticket() {
    }

    public Ticket( Double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public Long getTicketId() {
        return ticketId;
    }

    public void setTicketId(Long ticketId) {
        this.ticketId = ticketId;
    }

 /*   public TicketType getTicketType(int customersChoice) {

        if(customersChoice == 1) {
            return TicketType.ADULT;
        } else if(customersChoice == 2) {
            return TicketType.STUDENT_CHILD;
        } else if(customersChoice == 3) {
            return TicketType.ELDERLY;
        } else {
            System.out.println("Please enter appropriate code from 1-3: ");
            return null;
        }

    }*/



    public Double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(Double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public Schedule getSchedule() {
        return schedule;
    }
    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }
}


