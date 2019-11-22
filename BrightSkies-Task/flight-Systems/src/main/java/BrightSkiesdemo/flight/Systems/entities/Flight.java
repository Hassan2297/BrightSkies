package BrightSkiesdemo.flight.Systems.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "flight")
public class Flight {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "flight_id")
    private int flightId;

    @Column(name = "flight_name")
    private String flightName;
    private double fare;
    @Column(name = "from_destination")
    private String fromDestination;
    @Column(name = "to_destination")
    private String toDestination;
    @Column(name = "arrival_time")
    private java.util.Date arrivalTime;
    @Column(name = "is_available")
    private int isAvailable;


    @OneToMany(mappedBy = "flight")
    @JsonIgnore
    private List<Book> bookList;

    public Flight() {
    }

    public String getFlightname() {
        return flightName;
    }

    public void setFlightname(String flightName) {
        this.flightName = flightName;
    }

    public double getFare() {
        return fare;
    }

    public void setFare(double fare) {
        this.fare = fare;
    }

    public String getFromdestination() {
        return fromDestination;
    }

    public void setFromdestination(String fromDestination) {
        this.fromDestination = fromDestination;
    }

    public String getTodestination() {
        return toDestination;
    }

    public void setTodestination(String toDestination) {
        this.toDestination = toDestination;
    }

    public java.util.Date getArrivaltime() {
        return arrivalTime;
    }

    public void setArrivaltime(java.util.Date arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public int getIsavailable() {
        return isAvailable;
    }

    public void setIsavailable(int isAvailable) {
        this.isAvailable = isAvailable;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    public int getFlightId() {
        return flightId;
    }

    public void setFlightId(int flightId) {
        this.flightId = flightId;
    }
}
