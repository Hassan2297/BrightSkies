package BrightSkiesdemo.flight.Systems.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import BrightSkiesdemo.flight.Systems.entities.Customer;
import BrightSkiesdemo.flight.Systems.entities.Flight;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

 /*
    Implementation of interface CustomerSearchDAO

 */

@Repository
public class CustomerSearchDAOImp implements CustomerSearchDAO {

    // using EntityManager to access the database

    @PersistenceContext
    private EntityManager entityManager;


    @Autowired
    public CustomerSearchDAOImp() {
    }

    /*
       findAvailableFlights method used to get all avaialble flight from flight table
       SQL query: SELECT * FROM flight where isAvailable = 1;
    */

    @Override
    public List<Flight> findAvailableFlights() {

        TypedQuery<Flight> theQuery = entityManager.createQuery("Select f from Flight f where f.isAvailable = 1", Flight.class);
        List<Flight> availableFlights = theQuery.getResultList();
        return availableFlights;
    }

    /*
       findByFare method used to get all avaialble flight by fare
       SQL query: SELECT * FROM flight where fare = 4000;
    */

    @Override
    public List<Flight> findByFare(double fare) {

        TypedQuery<Flight> theQuery = entityManager.createQuery("Select f from Flight f where f.fare =:fareValue", Flight.class);

        theQuery.setParameter("fareValue", fare);

        List<Flight> availableFlights = theQuery.getResultList();
        return availableFlights;
    }

    /*
       findByBetweenFare method used to get all avaialble flight between 2 fare values
       SELECT * FROM flight where fare between 2000 and 8000;
    */

    @Override
    public List<Flight> findByBetweenFare(double fare1, double fare2) {
        TypedQuery<Flight> theQuery = entityManager.createQuery("Select f from Flight f where f.fare between :fareValue1 and :fareValue2", Flight.class);

        theQuery.setParameter("fareValue1", fare1);
        theQuery.setParameter("fareValue2", fare2);

        List<Flight> availableFlights = theQuery.getResultList();
        return availableFlights;
    }

    /*
       fromDestination method used to get all avaialble flight using fromDestination value
       SELECT * FROM flight f where f.fromDestination = 'Egypt'
    */

    @Override
    public List<Flight> fromDestination(String destination) {

        TypedQuery<Flight> theQuery = entityManager.createQuery("Select f from Flight f where f.fromDestination =:destinationval and" +
                " f.isAvailable = 1", Flight.class);

        theQuery.setParameter("destinationval", destination);

        List<Flight> availableFlights = theQuery.getResultList();
        return availableFlights;
    }

    /*
       toDestination method used to get all avaialble flight using toDestination value
       SELECT * FROM brightskiesdb.flight f where f.toDestination = 'Egypt';
    */

    @Override
    public List<Flight> toDestination(String destination) {
        TypedQuery<Flight> theQuery = entityManager.createQuery("Select f from Flight f where f.toDestination =:destinationval and" +
                " f.isAvailable = 1", Flight.class);

        theQuery.setParameter("destinationval", destination);

        List<Flight> availableFlights = theQuery.getResultList();
        return availableFlights;
    }

    /*
       fromAndToDestination method used to get all avaialble flight from a destination to a destination
       SELECT * FROM flight f where
       f.fromDestination  = 'Egypt' and f.toDestination = 'Germany';
    */

    @Override
    public List<Flight> fromAndToDestination(String fromDistination, String toDistination) {
        TypedQuery<Flight> theQuery = entityManager.createQuery("Select f from Flight f where f.fromDestination =:destinationval1 and" +
                " f.toDestination =:destinationval2 and f.isAvailable = 1", Flight.class);

        theQuery.setParameter("destinationval1", fromDistination);
        theQuery.setParameter("destinationval2", toDistination);

        List<Flight> availableFlights = theQuery.getResultList();
        return availableFlights;
    }

}
