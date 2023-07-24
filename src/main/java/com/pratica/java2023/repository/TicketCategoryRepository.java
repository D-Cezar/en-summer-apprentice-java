package com.pratica.java2023.repository;

import com.pratica.java2023.entities.Event;
import com.pratica.java2023.entities.TicketCategory;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TicketCategoryRepository extends CrudRepository<TicketCategory,Long> {
    List<TicketCategory> findAllTicketCategoryByEvent(Event event);

    long findEventIdById(long id);
}
