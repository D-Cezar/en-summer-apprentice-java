package com.pratica.java2023.service;

import com.pratica.java2023.entities.Event;
import com.pratica.java2023.entities.TicketCategory;
import com.pratica.java2023.repository.EventRepository;
import com.pratica.java2023.repository.TicketCategoryRepository;
import com.pratica.java2023.responseObject.FirstGetDTO;
import com.pratica.java2023.service.interfaces.EventServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EventService implements EventServiceInterface {
    @Autowired
    EventRepository eventRepository;
    @Autowired
    TicketCategoryRepository ticketCategoryRepository;

    @Override
    public List<Event> findAllByVenue_IdAndEventTypeName(long venueId, String eventType) {
        return eventRepository.findAllByVenue_IdAndEventType_Name(venueId, eventType);
    }

    @Override
    public List<FirstGetDTO> findEventAndTicketCategory(long venueId, String eventName) {
        List<FirstGetDTO> response = new ArrayList<FirstGetDTO>();
        List<Event> eventsDB = eventRepository.findAllByVenue_IdAndEventType_Name(venueId,eventName);
        FirstGetDTO firstGetDTO = new FirstGetDTO();
        for (Event event:eventsDB) {
            firstGetDTO = new FirstGetDTO();
            firstGetDTO.setEvent(event);
            firstGetDTO.setTicketCategories(
                    (ArrayList<TicketCategory>) ticketCategoryRepository.findAllTicketCategoryByEvent(event));
        }
        response.add(firstGetDTO);
        return response;
    }


    @Override
    public void saveEvent(Event event){
        eventRepository.save(event);
    }

    @Override
    public void deleteEvent(Event event){
        eventRepository.delete(event);
    }

    @Override
    public void deleteEventById(long id){
        eventRepository.deleteById(id);
    }

    @Override
    public Optional<Event> findEvent(long id){
        return eventRepository.findById(id);
    }

    @Override
    public List<Event> findAllEvents() {
        return (List<Event>) eventRepository.findAll();
    }


}
