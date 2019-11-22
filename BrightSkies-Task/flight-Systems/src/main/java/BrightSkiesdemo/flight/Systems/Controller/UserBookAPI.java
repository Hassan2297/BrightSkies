package BrightSkiesdemo.flight.Systems.Controller;

import BrightSkiesdemo.flight.Systems.entities.Book;
import BrightSkiesdemo.flight.Systems.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api")
@CrossOrigin()
public class UserBookAPI {

    /*
        this Controller responsable for User Booking action
        1 Post to book a flight
        1 Put to update Ticket's class
        1 Delete reservation
    */

    private CustomerService customerService;

    //Constructor
    //Params: customerService


    @Autowired
    public UserBookAPI(CustomerService customerService) {

        this.customerService = customerService;
    }

    /*
        Post Request: Post request of the customer's  booking
        Params: Book Body
        Url: http://localhost:8080/api/postBook
    */

    @PostMapping("/postBook")
    public String BookCustomer(@RequestBody Book theBook) {

        theBook.setTicketId(0);
        customerService.BookCustomer(theBook);

        return "Customer Booked";
    }

    /*
        Put Request: Put request to change ticket's class
        Params: ticket's id and class's id
        Url: http://localhost:8080/api/updateTicekt/ticketId/classId  --> class id = 1 , tciket id =2
    */

    @PutMapping("/updateTicekt/{ticketId}/{classId}")
    public String UpdateTicket(@PathVariable int ticketId, @PathVariable int classId) {

        customerService.updateTicket(ticketId, classId);

        return "ticket Class updated";
    }

    /*
        Delete Request: Delete request to cancel reservation
        Params: ticket's id
        Url: http://localhost:8080/api/deleteBook/1
    */

    @DeleteMapping("/deleteBook/{ticketId}")
    public String CancelBook(@PathVariable int ticketId) {
        customerService.CancelBook(ticketId);

        return "flight booking is cancelled";
    }


}
