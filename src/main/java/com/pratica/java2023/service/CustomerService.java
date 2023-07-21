package com.pratica.java2023.service;

import com.pratica.java2023.entities.Customer;
import com.pratica.java2023.repository.CustomerRepository;
import com.pratica.java2023.service.interfaces.CustomerServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class CustomerService implements CustomerServiceInterface {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public void saveCustomer(Customer customer){
        customerRepository.save(customer);
    }

    @Override
    public void deleteCustomer(Customer customer){
        customerRepository.delete(customer);
    }

    @Override
    public Optional<Customer> findCustomer(long id){
        return customerRepository.findById(id);
    }

    @Override
    public void deleteCustomerById(long id){
        customerRepository.deleteById(id);
    }

    @Override
    public List<Customer> findAllCustomers() {
        return (List<Customer>) customerRepository.findAll();
    }
}
