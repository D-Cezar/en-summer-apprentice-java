package com.pratica.java2023.controller;

import com.pratica.java2023.entities.Customer;
import com.pratica.java2023.service.interfaces.CustomerServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestDelete {
    private final CustomerServiceInterface customerServiceInterface;
@Autowired
    public TestDelete(CustomerServiceInterface customerServiceInterface) {
        this.customerServiceInterface = customerServiceInterface;
    }
    @DeleteMapping("/delete/cus{id}")
    public  void deleteCustomerById(@PathVariable long id){

    customerServiceInterface.deleteCustomer(customerServiceInterface.findCustomer(id).get());
    }
}
