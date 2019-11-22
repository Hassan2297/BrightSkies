package BrightSkiesdemo.flight.Systems.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id")
    private int customerId;

    @Column(name = "customer_name")
    private String customerName;
    @Column(name = "customer_email")
    private String customerEmail;
    private int phone;

    @OneToMany(mappedBy = "customer")
    @JsonIgnore
    private List<Book> bookList;

//	public Customer(String customerName, String customerEmail, int phone, List<Book> bookList) {
//		this.customerName = customerName;
//		this.customerEmail = customerEmail;
//		this.phone = phone;
//		this.bookList = bookList;
//	}

    public Customer() {
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomername() {
        return customerName;
    }

    public void setCustomername(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomeremail() {
        return customerEmail;
    }

    public void setCustomeremail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

}
