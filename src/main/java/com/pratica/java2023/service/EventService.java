package com.pratica.java2023.service;

import com.pratica.java2023.entities.EventEntity;
import com.pratica.java2023.repository.EventRepository;
import com.pratica.java2023.service.interfaces.EventServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class EventService implements EventServiceInterface {
    @Autowired
    EventRepository eventRepository;

    @Override
    public void saveEvent(EventEntity event){
        eventRepository.save(event);
    }

    @Override
    public void deleteEvent(EventEntity event){
        eventRepository.delete(event);
    }

    @Override
    public void deleteEventById(long id){
        eventRepository.deleteById(id);
    }

    @Override
    public Optional<EventEntity> findEvent(long id){
        return eventRepository.findById(id);
    }
}
