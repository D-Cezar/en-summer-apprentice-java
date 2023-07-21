package com.pratica.java2023.service;

import com.pratica.java2023.entities.Event;
import com.pratica.java2023.entities.TicketCategory;
import com.pratica.java2023.repository.TicketCategoryRepository;
import com.pratica.java2023.service.interfaces.TicketCategoryServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TicketCategoryService implements TicketCategoryServiceInterface {
    @Autowired
    TicketCategoryRepository ticketCategoryRepository;

    @Override
    public void saveTicketCategory(TicketCategory ticketCategory) {
        ticketCategoryRepository.save(ticketCategory);
    }

    @Override
    public void deleteTicketCategory(TicketCategory ticketCategory) {
    ticketCategoryRepository.save(ticketCategory);
    }

    @Override
    public void deleteTicketCategoryById(long id) {
    ticketCategoryRepository.deleteById(id);
    }

    @Override
    public Optional<TicketCategory> findTicketCategory(long id) {
        return ticketCategoryRepository.findById(id);
    }

    @Override
    public List<TicketCategory> findAllTicketCategories() {
        return (List<TicketCategory>) ticketCategoryRepository.findAll();
    }

    @Override
    public List<TicketCategory> findAllTicketCategoryByEvent(Event event) {
        return ticketCategoryRepository.findAllTicketCategoryByEvent(event);
    }

    @Override
    public long findEvent_IdById(long id){
        return ticketCategoryRepository.findEvent_IdById(id);
    }
}
