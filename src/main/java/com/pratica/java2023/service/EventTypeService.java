package com.pratica.java2023.service;

import com.pratica.java2023.entities.EventType;
import com.pratica.java2023.repository.EventTypeRepository;
import com.pratica.java2023.service.interfaces.EventTypeServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EventTypeService implements EventTypeServiceInterface {
    @Autowired
    EventTypeRepository eventTypeRepository;

    @Override
    public void saveEventType(EventType eventType){
        eventTypeRepository.save(eventType);
    }

    @Override
    public void deleteEventType(EventType eventType) {
        eventTypeRepository.save(eventType);
    }

    @Override
    public void deleteEventTypeById(long id) {
    eventTypeRepository.deleteById(id);
    }

    @Override
    public Optional<EventType> findEventType(long id) {
        return eventTypeRepository.findById(id);
    }

    @Override
    public List<EventType> findAllEventTypes() {
        return (List<EventType>) eventTypeRepository.findAll();
    }
}
