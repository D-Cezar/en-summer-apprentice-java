package com.pratica.java2023.repository;

import com.pratica.java2023.entities.EventType;
import org.springframework.data.repository.CrudRepository;

public interface EventTypeRepository extends CrudRepository<EventType,Long> {
}
