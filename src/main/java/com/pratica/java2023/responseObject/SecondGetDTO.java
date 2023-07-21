package com.pratica.java2023.responseObject;

import java.util.Date;

public class SecondGetDTO {
    long eventId;
    Date date;
    long ticketCategoryId;
    int numberOfTickets;
    double totalPrice;

    public void setEventId(long eventId) {
        this.eventId = eventId;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setTicketCategoryId(long ticketCategoryId) {
        this.ticketCategoryId = ticketCategoryId;
    }

    public void setNumberOfTickets(int numberOfTickets) {
        this.numberOfTickets = numberOfTickets;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
}
