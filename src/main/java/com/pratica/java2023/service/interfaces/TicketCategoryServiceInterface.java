package com.pratica.java2023.service.interfaces;

import com.pratica.java2023.entities.TicketCategory;

import java.util.Optional;

public interface TicketCategoryServiceInterface {
    void saveTicketCategory(TicketCategory ticketCategory);

    void deleteTicketCategory(TicketCategory ticketCategory);

    void deleteTicketCategoryById(long id);

    Optional<TicketCategory> findTicketCategory(long id);
}
