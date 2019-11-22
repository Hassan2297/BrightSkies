package BrightSkiesdemo.flight.Systems.service;

import BrightSkiesdemo.flight.Systems.dao.AdminDAO;
import BrightSkiesdemo.flight.Systems.entities.Flight;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

/*
    Implementation of Admin Service
    we create an AdmAdminDAO object and use it here using Dependency Injection
 */

@Service
public class AdminServiceImp implements AdminService {

    private AdminDAO adminDAO;

    @Autowired
    public AdminServiceImp(AdminDAO adminDAO) {
        this.adminDAO = adminDAO;
    }

    @Override
    public List<Flight> findAll() {
        return adminDAO.findAll();
    }

    @Override

    public Flight findById(int id) {
        Optional<Flight> result = adminDAO.findById(id);
        Flight theFlight = null;
        if (result.isPresent()) {
            theFlight = result.get();
        }
        return theFlight;
    }

    @Override
    public void save(Flight flight) {
        adminDAO.save(flight);
    }

    @Override
    public void deleteById(int id) {
        adminDAO.deleteById(id);
    }
}
