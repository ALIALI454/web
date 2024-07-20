package com.example.Market.Controller;

import com.example.Market.Model.Customer;
import com.example.Market.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/customer")
@CrossOrigin("*")

public class CustomerController {


    @Autowired
    public  CustomerService customerService;

    @PostMapping
    public Customer createCustomer(@RequestBody Customer customer) {

        return customerService.createCustomer(customer);
    }

    @GetMapping
    public List<Customer> findAll() {
        return customerService.findAll();
    }

    @GetMapping("/{customerId}")
    public Optional<Customer> findById(@PathVariable Integer customerId) {
        return customerService.findById(customerId);
    }

    @DeleteMapping("/{customerId}")
    public void deleteCustomer(@PathVariable Integer customerId) {

        customerService.deleteCustomer(customerId);
    }

    @PatchMapping("/{customerId}")
    public Customer updateCustomer(@RequestBody Customer customer, @PathVariable Integer customerId) {
        customer.setCustomerId(customerId);
        return customerService.updateCustomer(customer);
    }
}
