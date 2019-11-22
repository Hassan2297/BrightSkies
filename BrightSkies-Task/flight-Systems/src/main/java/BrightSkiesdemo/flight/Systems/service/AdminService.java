package BrightSkiesdemo.flight.Systems.service;

import BrightSkiesdemo.flight.Systems.entities.Flight;

import java.util.List;

/*
    the admin service contains all business lgoic and methods needed for an admin
    the service is used as a container fol all features admin have to enable to pass it
    to Admin API
 */
public interface AdminService {
    public List<Flight> findAll();

    public Flight findById(int id);

    public void save(Flight flight);

    public void deleteById(int id);
}
