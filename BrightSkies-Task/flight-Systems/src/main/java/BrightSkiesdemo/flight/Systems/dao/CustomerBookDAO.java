package BrightSkiesdemo.flight.Systems.dao;

import BrightSkiesdemo.flight.Systems.entities.Book;
import BrightSkiesdemo.flight.Systems.entities.Customer;
import BrightSkiesdemo.flight.Systems.entities.Flight;

import java.util.List;

/*
    Interface that contains all functions needed for a customer to
    Book flight,
    Cancel book, and
    Update ticket class

 */

public interface CustomerBookDAO {

    public void customerBook(Book cutomerBooked);

    public void updateTicketClass(int ticketId, int classId);

    public void CancelBook(int ticketId);


}
