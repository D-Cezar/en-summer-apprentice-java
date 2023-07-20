package com.pratica.java2023.service.interfaces;

import com.pratica.java2023.entities.CustomerEntity;

import java.util.Optional;

public interface CustomerServiceInterface {
        void saveCustomer(CustomerEntity customer);
        void deleteCustomer(CustomerEntity customer);
        Optional<CustomerEntity> findCustomer(long id);
        void deleteCustomerById(long id);
}
