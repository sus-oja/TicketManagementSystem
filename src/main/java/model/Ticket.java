package model;

import javax.persistence.*;

@Entity
@Table(schema = "tickets", name = "tickets")

public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ticket_id")
    private Long ticketId;
    @Column(name = "schedule_id")
    private Long scheduleId;
    @Column(name = "seat_id")
    private Long seatId;
    @Column(name = "type")
    private Long ticketType;
    @Column(name = "price")
    private Double ticketPrice;

    public Ticket() {

    }

    public Ticket(Long scheduleId, Long seatId, Long ticketType, Double ticketPrice) {
        this.scheduleId = scheduleId;
        this.seatId = seatId;
        this.ticketType = ticketType;
        this.ticketPrice = ticketPrice;
    }

    public Long getTicketId() {
        return ticketId;
    }

    public void setTicketId(Long ticketId) {
        this.ticketId = ticketId;
    }

    public Long getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(Long scheduleId) {
        this.scheduleId = scheduleId;
    }

    public Long getSeatId() {
        return seatId;
    }

    public void setSeatId(Long seatId) {
        this.seatId = seatId;
    }

    public Long getTicketType() {
        return ticketType;
    }

    public void setTicketType(Long ticketType) {
        this.ticketType = ticketType;
    }

    public Double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(Double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }
}
