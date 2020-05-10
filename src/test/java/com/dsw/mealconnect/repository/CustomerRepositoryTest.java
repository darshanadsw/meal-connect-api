package com.dsw.mealconnect.repository;

import com.dsw.mealconnect.domain.Customer;
import com.dsw.mealconnect.service.CustomerService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import java.util.stream.StreamSupport;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class CustomerRepositoryTest {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private CustomerRepository customerRepository;

    @Test
    public void test_find_customer() {

        Iterable<Customer> customers = customerRepository.findAll();

        assertTrue(customers.iterator().hasNext());
        assertEquals(8,StreamSupport.stream(customers.spliterator(),false).count());

    }

}


