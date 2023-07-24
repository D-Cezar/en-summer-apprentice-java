package com.pratica.java2023.service.interfaces;

import com.pratica.java2023.entities.Event;
import com.pratica.java2023.entities.EventType;
import com.pratica.java2023.responseObject.FirstGetDTO;

import java.util.List;
import java.util.Optional;

public interface EventServiceInterface {
    void saveEvent(Event event);

    void deleteEvent(Event event);

    void deleteEventById(long id);

    Optional<Event> findEvent(long id);

    List<Event> findAllEvents();

    List<Event> findAllByVenue_IdAndEventTypeName(long venueId, String eventType);

    List<FirstGetDTO> findEventAndTicketCategory(long venueId, String event);
}
