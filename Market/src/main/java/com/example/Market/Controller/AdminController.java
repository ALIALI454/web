package com.example.Market.Controller;

import com.example.Market.Model.Admin;
import com.example.Market.Service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/admin")
public class AdminController {



    @Autowired
    public AdminService adminService;



    @PostMapping
    public Admin addAdmin(@RequestBody Admin admin) {
        return adminService.createAdmin(admin);
    }

    @GetMapping
    public List<Admin> findAll() {
        return adminService.findAll();
    }

    @GetMapping("/{adminId}")
    public Optional<Admin> findById(@PathVariable("adminId") Integer adminId) {
        return adminService.findById(adminId);
    }

    @DeleteMapping("/{adminId}")
    public void deleteAdmin(@PathVariable("adminId") Integer adminId) {
        adminService.deleteAdmin(adminId);
    }

    @PutMapping("/{adminId}")
    public Admin updateAdmin(@PathVariable("adminId") Integer adminId, @RequestBody Admin admin) {
        // Set the adminId on the incoming admin object
        admin.setAdminId(adminId);

        // Call the service method to update the admin
        return adminService.updateAdmin(admin);
    }
}