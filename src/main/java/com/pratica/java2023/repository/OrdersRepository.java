package com.pratica.java2023.repository;

import com.pratica.java2023.entities.Orders;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrdersRepository extends CrudRepository<Orders, Long> {
    List<Orders> findAllOrdersByCustomer_Id(long id);

    long findOrdersByTicketCategoryId(long orderId);

}
