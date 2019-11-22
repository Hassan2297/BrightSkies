package BrightSkiesdemo.flight.Systems.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Flight.class)
public abstract class Flight_ {

	public static volatile SingularAttribute<Flight, Double> fare;
	public static volatile SingularAttribute<Flight, Integer> isAvailable;
	public static volatile SingularAttribute<Flight, String> flightName;
	public static volatile SingularAttribute<Flight, String> toDestination;
	public static volatile SingularAttribute<Flight, Date> arrivalTime;
	public static volatile SingularAttribute<Flight, String> fromDestination;
	public static volatile SingularAttribute<Flight, Integer> flightId;
	public static volatile ListAttribute<Flight, Book> bookList;

	public static final String FARE = "fare";
	public static final String IS_AVAILABLE = "isAvailable";
	public static final String FLIGHT_NAME = "flightName";
	public static final String TO_DESTINATION = "toDestination";
	public static final String ARRIVAL_TIME = "arrivalTime";
	public static final String FROM_DESTINATION = "fromDestination";
	public static final String FLIGHT_ID = "flightId";
	public static final String BOOK_LIST = "bookList";

}

