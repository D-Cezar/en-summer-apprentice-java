package com.pratica.java2023.service.interfaces;

import com.pratica.java2023.entities.Event;
import com.pratica.java2023.entities.TicketCategory;

import java.util.List;
import java.util.Optional;

public interface TicketCategoryServiceInterface {
    void saveTicketCategory(TicketCategory ticketCategory);

    void deleteTicketCategory(TicketCategory ticketCategory);

    void deleteTicketCategoryById(long id);

    Optional<TicketCategory> findTicketCategory(long id);

    List<TicketCategory> findAllTicketCategories();

    List<TicketCategory> findAllTicketCategoryByEvent(Event event);

    long findEvent_IdById(long id);
}
