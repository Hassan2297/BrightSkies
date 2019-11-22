package BrightSkiesdemo.flight.Systems.dao;

import BrightSkiesdemo.flight.Systems.entities.Book;
import BrightSkiesdemo.flight.Systems.entities.Customer;
import BrightSkiesdemo.flight.Systems.entities.Flight;
import BrightSkiesdemo.flight.Systems.entities.TicketClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.util.Date;
import java.util.List;
/*
    Implementation of interface CustomerBookDAO

 */

@Repository
public class CustomerBookDAOImp implements CustomerBookDAO {


    // using EntityManager to access the database

    @PersistenceContext
    private EntityManager entityManager;


    @Autowired
    public CustomerBookDAOImp() {
    }

    /*
        customerBook method used to create a new record in Book table
        SQL query: Insert into Book (ticket_id,booked_date,customer_id,flight_id,class_id)
                   Values (1,2019-04-22,1,2,1);
     */
    @Override
    public void customerBook(Book customerBooked) {

        Book BookedCustomer = entityManager.merge(customerBooked);

        BookedCustomer.setBookeddate(new Date());
        BookedCustomer.setTicketId(BookedCustomer.getTicketId());


    }

    /*
      updateTicketClass method used to update classId in Book table
      SQL query: UPDATE  Book SET class_id = 1
                 Where ticket_id = 2;
   */
    @Override
    public void updateTicketClass(int ticketId, int classId) {

        Query query = entityManager.createNativeQuery
                ("update book set class_id =:classval where ticket_id =:ticketval");
        query.setParameter("classval", classId);
        query.setParameter("ticketval", ticketId);
        query.executeUpdate();


    }

    /*
      CancelBook method used to delete a record in Book table by ticketId
      SQL query: DELTE from Book Where ticket_id = 1

   */
    @Override
    @Transactional
    public void CancelBook(int ticketId) {
        Query query = entityManager.createQuery("delete from Book b where b.ticketId =:ticketval");
        query.setParameter("ticketval", ticketId);
        query.executeUpdate();
    }
}
