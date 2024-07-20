package com.example.Market.Repository;

import com.example.Market.Model.Admin;
import com.example.Market.Model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository

public interface CustomerRepository extends JpaRepository<Customer,Integer> {

}
