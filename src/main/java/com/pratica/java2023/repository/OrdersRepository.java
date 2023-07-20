package com.pratica.java2023.repository;

import com.pratica.java2023.entities.OrdersEntity;
import org.springframework.data.repository.CrudRepository;

public interface OrdersRepository extends CrudRepository<OrdersEntity, Long> {
}
