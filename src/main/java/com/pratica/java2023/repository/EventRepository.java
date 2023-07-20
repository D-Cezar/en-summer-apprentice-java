package com.pratica.java2023.repository;

import com.pratica.java2023.entities.EventEntity;
import org.springframework.data.repository.CrudRepository;

public interface EventRepository extends CrudRepository<EventEntity,Long> {
}
