package BrightSkiesdemo.flight.Systems.service;

import java.util.List;

import BrightSkiesdemo.flight.Systems.dao.CustomerBookDAO;
import BrightSkiesdemo.flight.Systems.dao.CustomerSearchDAO;
import BrightSkiesdemo.flight.Systems.entities.Book;
import BrightSkiesdemo.flight.Systems.entities.Customer;
import BrightSkiesdemo.flight.Systems.entities.Flight;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/*
    Implementation of Customer Service
    we create an CustomerSearchDAO and CustomerBookDAO objects
    initialize it using Dependency Injection
 */

@Service
public class CustomerServiceImp implements CustomerService {


    private CustomerSearchDAO customerDao;

    private CustomerBookDAO bookDao;


    @Autowired
    public CustomerServiceImp(CustomerSearchDAO customerImp, CustomerBookDAO bookDaoImp) {

        this.customerDao = customerImp;
        this.bookDao = bookDaoImp;
    }


    @Override
    @Transactional
    public List<Flight> findFlights() {

        List<Flight> flights = customerDao.findAvailableFlights();

        return flights;
    }

    @Override
    public List<Flight> findByFare(double fare) {
        List<Flight> flights = customerDao.findByFare(fare);

        return flights;
    }

    @Override
    public List<Flight> findByBetweenFare(double fare1, double fare2) {
        List<Flight> flights = customerDao.findByBetweenFare(fare1, fare2);

        return flights;
    }

    @Override
    public List<Flight> getDestinations(String destination) {
        List<Flight> flights = customerDao.fromDestination(destination);

        return flights;
    }

    @Override
    public List<Flight> toDestinations(String destination) {
        List<Flight> flights = customerDao.toDestination(destination);
        return flights;
    }

    @Override
    public List<Flight> fromAndToDestination(String from, String to) {
        List<Flight> flights = customerDao.fromAndToDestination(from, to);
        return flights;
    }

    @Override
    @Transactional
    public void BookCustomer(Book CustomerBooked) {

        bookDao.customerBook(CustomerBooked);
    }

    @Override
    @Transactional
    public void updateTicket(int ticketId, int classId) {

        bookDao.updateTicketClass(ticketId, classId);
    }

    @Override
    public void CancelBook(int ticketId) {
        bookDao.CancelBook(ticketId);
    }


}
