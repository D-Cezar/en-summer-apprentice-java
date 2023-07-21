package com.pratica.java2023.controller;

import com.pratica.java2023.entities.Event;
import com.pratica.java2023.entities.Orders;
import com.pratica.java2023.entities.TicketCategory;
import com.pratica.java2023.responseObject.FirstGetDTO;
import com.pratica.java2023.responseObject.SecondGetDTO;
import com.pratica.java2023.service.interfaces.EventServiceInterface;
import com.pratica.java2023.service.interfaces.OrdersServiceInterface;
import com.pratica.java2023.service.interfaces.TicketCategoryServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class GetController {

    private final EventServiceInterface eventServiceInterface;
    private final TicketCategoryServiceInterface ticketCategoryServiceInterface;
    private final OrdersServiceInterface ordersServiceInterface;

    @Autowired
    public GetController(EventServiceInterface eventServiceInterface,
                         TicketCategoryServiceInterface ticketCategoryServiceInterface,
                        OrdersServiceInterface orderInterface) {
        this.eventServiceInterface = eventServiceInterface;
        this.ticketCategoryServiceInterface = ticketCategoryServiceInterface;
        this.ordersServiceInterface=orderInterface;
    }

    @GetMapping("/events")
    public List<FirstGetDTO> findEventWithDetalis(@RequestParam long venueId, @RequestParam String eventType){
    List<FirstGetDTO> response=new ArrayList<FirstGetDTO>();
    FirstGetDTO firstGetDTO =new FirstGetDTO();
        for (Event event:eventServiceInterface.findAllByVenue_IdAndEventTypeName(venueId,eventType)) {
    firstGetDTO.setEvent(event);
    firstGetDTO.setTicketCategories(
            (ArrayList<TicketCategory>) ticketCategoryServiceInterface.findAllTicketCategoryByEvent(event));
        }
        response.add(firstGetDTO);
        return response;
    }

    @GetMapping("/orders/{id}")
    List<SecondGetDTO> findAllOrdersByCustomer_Id(@PathVariable long id){
        /*ArrayList<SecondGetDTO> response =new ArrayList<>();
        SecondGetDTO secondGetDTO=new SecondGetDTO();
        for(Orders order:ordersServiceInterface.findAllOrdersByCustomer_Id(id)){
            secondGetDTO.setDate(order.getOrderedAt());
            secondGetDTO.setNumberOfTickets(order.getNumberOfTickets());
            secondGetDTO.setEventId(ticketCategoryServiceInterface
                    .findEvent_IdById(ordersServiceInterface.findTicketCategoryIdById(order.getId())));
            secondGetDTO.setTotalPrice(order.getTotalPrice());
            secondGetDTO.setTicketCategoryId(ordersServiceInterface.findTicketCategoryIdById(order.getId()));
        response.add(secondGetDTO);
        }
        return  response;*/
        return findAllOrdersByCustomer_Id(id);
    }
}
