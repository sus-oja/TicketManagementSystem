/*
package model;

import javax.persistence.*;

@Entity
@Table(schema = "theatre", name = "seats")

public class Seat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "seat_id")
    private Long seatId;
    @Column(name = "seat_nr")
    private int seatNumber;

    @OneToOne
    @JoinColumn(name = "location_id")
    private Location location;


    public Seat() {

    }

    public Seat(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public Long getSeatId() {
        return seatId;
    }

    public void setSeatId(Long seatId) {
        this.seatId = seatId;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }



}
*/
