package BrightSkiesdemo.flight.Systems.dao;


import BrightSkiesdemo.flight.Systems.entities.Book;
import BrightSkiesdemo.flight.Systems.entities.Flight;
import org.springframework.data.jpa.repository.JpaRepository;


/*
    here i use the JpaRepository which enables to give me all crud operations

    Create, update, delete, select all, select by ir

    function names:
    1. findAll()
    2. findById()
    3.save()
    4.delteById()

 */

public interface AdminDAO extends JpaRepository<Flight, Integer> {


}
