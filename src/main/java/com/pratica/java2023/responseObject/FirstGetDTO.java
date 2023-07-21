package com.pratica.java2023.responseObject;

import com.pratica.java2023.entities.Event;
import com.pratica.java2023.entities.TicketCategory;

import java.util.ArrayList;

public class FirstGetDTO {
    public Event event;
    public ArrayList<TicketCategory> ticketCategories;

    public FirstGetDTO() {
    }

    public FirstGetDTO(Event event, ArrayList<TicketCategory> ticketCategories) {
        this.event = event;
        this.ticketCategories = ticketCategories;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public void setTicketCategories(ArrayList<TicketCategory> ticketCategories) {
        this.ticketCategories = ticketCategories;
    }
}
