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
    @Column(name = "row_nr")
    private int rowNumber;
    @Column(name = "location_id")
    private Long locationId;

    public Seat() {

    }

    public Seat(int seatNumber, int rowNumber, Long locationId) {
        this.seatNumber = seatNumber;
        this.rowNumber = rowNumber;
        this.locationId = locationId;
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

    public int getRowNumber() {
        return rowNumber;
    }

    public void setRowNumber(int rowNumber) {
        this.rowNumber = rowNumber;
    }

    public Long getLocationId() {
        return locationId;
    }

    public void setLocationId(Long locationId) {
        this.locationId = locationId;
    }
}
