package com.pratica.java2023.service.interfaces;

import com.pratica.java2023.entities.EventType;

import java.util.List;
import java.util.Optional;

public interface EventTypeServiceInterface {
    void saveEventType(EventType eventType);

    void deleteEventType(EventType eventType);

    void deleteEventTypeById(long id);

    Optional<EventType> findEventType(long id);

    List<EventType> findAllEventTypes();
}
