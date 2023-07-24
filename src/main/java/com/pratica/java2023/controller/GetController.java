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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class GetController {

    private final EventServiceInterface eventServiceInterface;
    private final TicketCategoryServiceInterface ticketCategoryServiceInterface;
    private final OrdersServiceInterface ordersServiceInterface;

    private final static long customerId=1;

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
        return eventServiceInterface.findEventAndTicketCategory(venueId,eventType);
    }

    @GetMapping("/orders")
    public List<SecondGetDTO> findAllOrdersByCustomer_Id(){

        return ordersServiceInterface.OrderInfo(customerId);
    }
}
