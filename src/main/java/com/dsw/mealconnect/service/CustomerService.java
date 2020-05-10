package com.dsw.mealconnect.service;

import com.dsw.mealconnect.domain.Customer;
import com.dsw.mealconnect.repository.CustomerRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Slf4j
@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public List<Customer> findAllCustomers(){
        return StreamSupport.stream(customerRepository.findAll().spliterator(),false)
            .collect(Collectors.toList());

    }



}
