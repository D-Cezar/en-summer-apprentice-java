package com.pratica.java2023.service.interfaces;

import com.pratica.java2023.entities.Orders;

import java.util.List;
import java.util.Optional;

public interface OrdersServiceInterface {
void saveOrder(Orders order);

void deleteOrder(Orders order);

void deleteOrderById(long id);

Optional<Orders> findOrder(long id);

List<Orders> findAllOrders();

List<Orders> findAllOrdersByCustomer_Id(long id);

long findTicketCategoryIdById(long id);
}
