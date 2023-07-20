package com.pratica.java2023.service.interfaces;

import com.pratica.java2023.entities.OrdersEntity;

import java.util.Optional;

public interface OrdersServiceInterface {
void saveOrder(OrdersEntity order);

void deleteOrder(OrdersEntity order);

void deleteOrderById(long id);

Optional<OrdersEntity> findOrder(long id);
}
