package com.pratica.java2023.service;

import com.pratica.java2023.entities.CustomerEntity;
import com.pratica.java2023.repository.CustomerRepository;
import com.pratica.java2023.service.interfaces.CustomerServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class CustomerService implements CustomerServiceInterface {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public void saveCustomer(CustomerEntity customer){
        customerRepository.save(customer);
    }

    @Override
    public void deleteCustomer(CustomerEntity customer){
        customerRepository.delete(customer);
    }

    @Override
    public Optional<CustomerEntity> findCustomer(long id){
        return customerRepository.findById(id);
    }

    @Override
    public void deleteCustomerById(long id){
        customerRepository.deleteById(id);
    }
}
