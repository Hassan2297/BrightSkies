package BrightSkiesdemo.flight.Systems.entities;

import javax.persistence.*;

@Entity
@Table(name = "admin")
public class Admin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "admin_id")
    private int adminId;

    @Column(name = "admin_name")
    private String adminName;
    @Column(name = "admin_email")
    private String adminEmail;
    private int phone;

    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

    public String getAdminname() {
        return adminName;
    }

    public void setAdminname(String adminName) {
        this.adminName = adminName;
    }

    public String getAdminemail() {
        return adminEmail;
    }

    public void setAdminemail(String adminEmail) {
        this.adminEmail = adminEmail;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }
}
