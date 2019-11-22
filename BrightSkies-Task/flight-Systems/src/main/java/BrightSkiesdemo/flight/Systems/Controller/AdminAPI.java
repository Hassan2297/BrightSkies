package BrightSkiesdemo.flight.Systems.Controller;


import BrightSkiesdemo.flight.Systems.entities.Flight;
import BrightSkiesdemo.flight.Systems.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin()
public class AdminAPI {

     /*
        this Controller responsable for all admin action
        has 2 Get request: 1- For listing all flight, 2- for displaying specific flight
        1 Post to create a flight
        1 Put to update flight
        1 Delete to delete flight
    */

    private AdminService adminService;

    //Constructor
    //Params: adminService

    @Autowired
    public AdminAPI(AdminService adminService) {
        this.adminService = adminService;
    }

    /*
        Get Request: Get All Flights
        takes no parameters
        Url: http://localhost:8080/api/admin/getAllFlights
    */


    @GetMapping("/admin/getAllFlights")
    public List<Flight> getAllFlights() {
        return adminService.findAll();
    }

    /*
        Get Request: Get Specific Flight
        Params: Id of the flight
        Url: http://localhost:8080/api/admin/getAllFlights/1
    */


    @GetMapping("admin/getAllFlights/{id}")
    public Flight getFlightById(@PathVariable int id) {
        Flight flight = adminService.findById(id);

        return flight;
    }

    /*
        Post Request: Post to create Flight
        Params: Flight Body
        Url: http://localhost:8080/api/admin/CreateFlight
    */

    @PostMapping("admin/CreateFlight")
    public String CreateFlight(@RequestBody Flight flight) {
        flight.setFlightId(0);
        adminService.save(flight);

        return "Flight is created";
    }

    /*
        Put Request: PUT to update Flight
        Params: Flight Body
        Url: http://localhost:8080/api/admin/CreateFlight
    */

    @PutMapping("admin/CreateFlight")
    public String UpdateFlight(@RequestBody Flight flight) {
        adminService.save(flight);

        return "Flight is updated";
    }

    /*
        Delete Request: Delete flight
        Params: Id the flight
        Url: http://localhost:8080/api/admin/DeleteFlight/1
     */

    @DeleteMapping("admin/DeleteFlight/{id}")
    public String DeleteFlight(@PathVariable int id) {

        adminService.deleteById(id);

        return "flight id = " + id + " is deleted";
    }
}
