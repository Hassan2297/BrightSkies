package BrightSkiesdemo.flight.Systems.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(TicketClass.class)
public abstract class TicketClass_ {

	public static volatile SingularAttribute<TicketClass, Integer> classId;
	public static volatile SingularAttribute<TicketClass, String> className;
	public static volatile ListAttribute<TicketClass, Book> bookList;

	public static final String CLASS_ID = "classId";
	public static final String CLASS_NAME = "className";
	public static final String BOOK_LIST = "bookList";

}

