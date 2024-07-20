package com.example.Market.Service;

import com.example.Market.Model.Admin;
import com.example.Market.Model.Customer;
import com.example.Market.Repository.AdminRepository;
import com.example.Market.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdminService {
        @Autowired
        public AdminRepository adminRepository;

        public Admin createAdmin(Admin admin) {
            return adminRepository.save(admin);
        }

        public List<Admin> findAll() {
            return adminRepository.findAll();
        }

        public Optional<Admin> findById(Integer adminId) {
            return adminRepository.findById(adminId);
        }

        public void deleteCustomer(Integer customerId) {
            adminRepository.deleteById(customerId);
        }

    public void deleteAdmin(Integer adminId) {
    }

    public Admin updateAdmin(Admin admin) {
        return null;
    }
}

