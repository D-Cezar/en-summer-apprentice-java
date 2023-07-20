package com.pratica.java2023.repository;

import com.pratica.java2023.entities.TicketCategory;
import org.springframework.data.repository.CrudRepository;

public interface TicketCategoryRepository extends CrudRepository<TicketCategory,Long> {
}
