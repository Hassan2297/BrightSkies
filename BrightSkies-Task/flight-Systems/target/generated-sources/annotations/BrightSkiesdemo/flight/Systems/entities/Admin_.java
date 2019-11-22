package BrightSkiesdemo.flight.Systems.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Admin.class)
public abstract class Admin_ {

	public static volatile SingularAttribute<Admin, String> adminName;
	public static volatile SingularAttribute<Admin, Integer> phone;
	public static volatile SingularAttribute<Admin, Integer> adminId;
	public static volatile SingularAttribute<Admin, String> adminEmail;

	public static final String ADMIN_NAME = "adminName";
	public static final String PHONE = "phone";
	public static final String ADMIN_ID = "adminId";
	public static final String ADMIN_EMAIL = "adminEmail";

}

