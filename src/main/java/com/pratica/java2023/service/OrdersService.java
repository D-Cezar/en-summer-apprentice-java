package com.pratica.java2023.service;

import com.pratica.java2023.entities.OrdersEntity;
import com.pratica.java2023.repository.OrdersRepository;
import com.pratica.java2023.service.interfaces.OrdersServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class OrdersService implements OrdersServiceInterface {
    @Autowired
    private OrdersRepository ordersRepository;

    @Override
    public void saveOrder(OrdersEntity order){
        ordersRepository.save(order);
    }

    @Override
    public void deleteOrder(OrdersEntity order){
        ordersRepository.delete(order);
    }

    @Override
    public void deleteOrderById(long id){
        ordersRepository.deleteById(id);
    }

    @Override
    public Optional<OrdersEntity> findOrder(long id){
        return ordersRepository.findById(id);
    }
}
