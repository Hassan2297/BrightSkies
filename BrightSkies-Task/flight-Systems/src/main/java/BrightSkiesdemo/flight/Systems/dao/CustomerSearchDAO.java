package BrightSkiesdemo.flight.Systems.dao;

import BrightSkiesdemo.flight.Systems.entities.Customer;
import BrightSkiesdemo.flight.Systems.entities.Flight;

import java.util.List;
/*
    Interface that contains all functions needed for a customer to Search for
     flights,
    by fare,
    between fare values ex: between 4000 and 8000,
    search from a location,
    search to location,
    search from a location to location

 */

public interface CustomerSearchDAO {


    public List<Flight> findAvailableFlights();

    public List<Flight> findByFare(double fare);

    public List<Flight> findByBetweenFare(double fare1, double fare2);

    public List<Flight> fromDestination(String destination);

    public List<Flight> toDestination(String destination);

    public List<Flight> fromAndToDestination(String fromDistination, String toDistination);


}
