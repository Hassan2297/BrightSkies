package BrightSkiesdemo.flight.Systems.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
@Table(name = "book")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ticket_id")
    private int ticketId;

    @Column(name = "booked_date")
    private java.util.Date bookedDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_id")

    private Customer customer;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "class_id")

    private TicketClass ticketClass;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "flight_id")
    private Flight flight;

    public Book() {
    }

    public java.util.Date getBookeddate() {
        return bookedDate;
    }

    public void setBookeddate(java.util.Date bookedDate) {
        this.bookedDate = bookedDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public TicketClass getTicketClass() {
        return ticketClass;
    }

    public void setTicketClass(TicketClass ticketClass) {
        this.ticketClass = ticketClass;
    }


    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public int getTicketId() {
        return ticketId;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    @JsonProperty("flight_id")
    private void flightgetId(Integer flight_id) {
        this.flight = new Flight();
        flight.setFlightId(flight_id);
    }

    @JsonProperty("customer_id")
    private void customergetId(Integer customer_id) {
        this.customer = new Customer();
        customer.setCustomerId(customer_id);
    }

    @JsonProperty("class_id")
    private void classgetId(Integer class_id) {
        this.ticketClass = new TicketClass();
        ticketClass.setClassId(class_id);
    }


}
