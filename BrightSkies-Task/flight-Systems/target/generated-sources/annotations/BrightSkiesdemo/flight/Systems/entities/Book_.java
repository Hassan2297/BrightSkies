package BrightSkiesdemo.flight.Systems.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Book.class)
public abstract class Book_ {

	public static volatile SingularAttribute<Book, Flight> flight;
	public static volatile SingularAttribute<Book, TicketClass> ticketClass;
	public static volatile SingularAttribute<Book, Date> bookedDate;
	public static volatile SingularAttribute<Book, Integer> ticketId;
	public static volatile SingularAttribute<Book, Customer> customer;

	public static final String FLIGHT = "flight";
	public static final String TICKET_CLASS = "ticketClass";
	public static final String BOOKED_DATE = "bookedDate";
	public static final String TICKET_ID = "ticketId";
	public static final String CUSTOMER = "customer";

}

