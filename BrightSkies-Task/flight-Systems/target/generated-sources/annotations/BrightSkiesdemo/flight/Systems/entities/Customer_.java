package BrightSkiesdemo.flight.Systems.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Customer.class)
public abstract class Customer_ {

	public static volatile SingularAttribute<Customer, Integer> phone;
	public static volatile SingularAttribute<Customer, String> customerEmail;
	public static volatile SingularAttribute<Customer, Integer> customerId;
	public static volatile SingularAttribute<Customer, String> customerName;
	public static volatile ListAttribute<Customer, Book> bookList;

	public static final String PHONE = "phone";
	public static final String CUSTOMER_EMAIL = "customerEmail";
	public static final String CUSTOMER_ID = "customerId";
	public static final String CUSTOMER_NAME = "customerName";
	public static final String BOOK_LIST = "bookList";

}

