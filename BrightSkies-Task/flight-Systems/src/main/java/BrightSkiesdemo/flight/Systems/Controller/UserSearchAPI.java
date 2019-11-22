package BrightSkiesdemo.flight.Systems.Controller;

import java.util.List;

import BrightSkiesdemo.flight.Systems.entities.Customer;
import BrightSkiesdemo.flight.Systems.entities.Flight;
import BrightSkiesdemo.flight.Systems.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api")
@CrossOrigin()
public class UserSearchAPI {


    /*
     this Controller responsable for User searching action

    */
    private CustomerService customerService;

    //Constructor
    //Params: customerService


    @Autowired
    public UserSearchAPI(CustomerService customerService) {

        this.customerService = customerService;
    }


        /*
            Get Request: Get all the flights
            takes no params
            Url: http://localhost:8080/api/getAll/flights
        */

    @GetMapping("/getAll/flights")
    public List<Flight> getFlights() {
        List<Flight> flights = customerService.findFlights();

        return flights;
    }

        /*
          Get Request: Get all Flights by specific fare
          Params: Fare - double number (decimal)
          Url: http://localhost:8080/api/getAll/byFare/4000
        */

    @GetMapping("/getAll/byFare/{fare}")
    public List<Flight> getFlightsByFare(@PathVariable double fare) {
        List<Flight> flights = customerService.findByFare(fare);

        return flights;
    }

        /*
            Get Request: Get all Flights between 2 fare
            Params: Fare1 - double number (decimal)
                    Fare2 - double number (decimal)

            Url: http://localhost:8080/api/getAll/byFare/between/2000/and/8000

        */

    @GetMapping("/getAll/byFare/between/{fare1}/and/{fare2}")
    public List<Flight> getFlightsByBetweenFare(@PathVariable double fare1, @PathVariable double fare2) {
        List<Flight> flights = customerService.findByBetweenFare(fare1, fare2);

        return flights;
    }

        /*
            Get Request: Get all Flights departure from specific location
            Params: from - string represents the departure location
            Url: http://localhost:8080/api/getAll/fromDestination/Egypt
        */

    @GetMapping("/getAll/fromDestination/{from}")
    public List<Flight> getFlightsfromDestination(@PathVariable String from) {
        List<Flight> flights = customerService.getDestinations(from);

        return flights;
    }

        /*
            Get Request: Get all Flights arrival to specific location
            Params: To - string represents the arrival location
            Url: http://localhost:8080/api/getAll/ToDestination/Egypt
        */

    @GetMapping("/getAll/ToDestination/{To}")
    public List<Flight> getFlightsToDestination(@PathVariable String To) {
        List<Flight> flights = customerService.toDestinations(To);

        return flights;
    }

        /*
            Get all Flights departure from specific location and arrival to specific location
            Params: from - string represents the departure location
                    to - string represents the arrival location

            Url: http://localhost:8080/api/getAll/fromDestination/Egypt/ToDestination/Germany
        */

    @GetMapping("/getAll/fromDestination/{from}/ToDestination/{to}")
    public List<Flight> getFlightsToDestination(@PathVariable String from, @PathVariable String to) {

        List<Flight> flights = customerService.fromAndToDestination(from, to);

        return flights;
    }


}
