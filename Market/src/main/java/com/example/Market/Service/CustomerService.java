package com.example.Market.Service;


import com.example.Market.Model.Customer;
import com.example.Market.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class CustomerService {
    @Autowired
    public CustomerRepository customerRepository;

    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    public Optional<Customer> findById(Integer customerId) {
        return customerRepository.findById(customerId);
    }

    public void deleteCustomer(Integer customerId) {
        customerRepository.deleteById(customerId);
    }

    public Customer createCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    public Customer updateCustomer(Customer customer) {
        Customer o = null;
        return o;
    }
}

