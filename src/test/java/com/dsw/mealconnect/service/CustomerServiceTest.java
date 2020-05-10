package com.dsw.mealconnect.service;

import com.dsw.mealconnect.domain.Customer;
import com.dsw.mealconnect.repository.CustomerRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

@SpringBootTest
@Transactional
class CustomerServiceTest {

    @Autowired
    private CustomerService customerService;

    @Autowired
    private EntityManager entityManager;

    @Test
    void findAllCustomers() {
        Customer customer = Customer.builder()
            .firstName("Darshana").lastName("Welikala")
            .build();
        entityManager.persist(customer);

        List<Customer> customers = customerService.findAllCustomers();

        assertFalse(customers.isEmpty());
        assertEquals(1,customers.size());
    }


}
