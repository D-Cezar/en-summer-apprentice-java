package com.pratica.java2023.service.interfaces;

import com.pratica.java2023.entities.Customer;

import java.util.List;
import java.util.Optional;

public interface CustomerServiceInterface {
        void saveCustomer(Customer customer);
        void deleteCustomer(Customer customer);
        Optional<Customer> findCustomer(long id);
        void deleteCustomerById(long id);

        List<Customer> findAllCustomers();
}
