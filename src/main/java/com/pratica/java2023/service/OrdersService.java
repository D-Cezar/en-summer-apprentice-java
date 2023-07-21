package com.pratica.java2023.service;

import com.pratica.java2023.entities.Orders;
import com.pratica.java2023.repository.OrdersRepository;
import com.pratica.java2023.service.interfaces.OrdersServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrdersService implements OrdersServiceInterface {
    @Autowired
    private OrdersRepository ordersRepository;

    @Override
    public void saveOrder(Orders order){
        ordersRepository.save(order);
    }

    @Override
    public void deleteOrder(Orders order){
        ordersRepository.delete(order);
    }

    @Override
    public void deleteOrderById(long id){
        ordersRepository.deleteById(id);
    }

    @Override
    public Optional<Orders> findOrder(long id){
        return ordersRepository.findById(id);
    }

    @Override
    public List<Orders> findAllOrders() {
        return (List<Orders>) ordersRepository.findAll();
    }

    @Override
    public List<Orders> findAllOrdersByCustomer_Id(long id) {
        return ordersRepository.findAllOrdersByCustomer_Id(id);
    }

    @Override
    public long findTicketCategoryIdById(long id){
        return  ordersRepository.findTicketCategoryIdById(id);
    }
}
