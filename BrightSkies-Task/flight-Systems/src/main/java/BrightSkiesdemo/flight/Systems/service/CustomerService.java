package BrightSkiesdemo.flight.Systems.service;

import BrightSkiesdemo.flight.Systems.entities.Book;
import BrightSkiesdemo.flight.Systems.entities.Customer;
import BrightSkiesdemo.flight.Systems.entities.Flight;

import java.util.List;

/*
    the Customer service contains all business lgoic and methods needed for customer
    the service is used as a container fol all features admin have to enable to pass it
    to UserSearch API and UserBookAPI
 */
public interface CustomerService {


    public List<Flight> findFlights();

    public List<Flight> findByFare(double fare);

    public List<Flight> findByBetweenFare(double fare1, double fare2);

    public List<Flight> getDestinations(String destination);

    public List<Flight> toDestinations(String destination);

    public List<Flight> fromAndToDestination(String from, String to);

    public void BookCustomer(Book CustomerBooked);

    public void updateTicket(int ticketId, int classId);

    public void CancelBook(int ticketId);
}
