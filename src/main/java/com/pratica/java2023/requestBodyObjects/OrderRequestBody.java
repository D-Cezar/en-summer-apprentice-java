package com.pratica.java2023.requestBodyObjects;

public class OrderRequestBody {
    public long eventId;

    public long ticketCategoryId;

    public int numberOfTickets;

    public void setEventId(long eventId) {
        this.eventId = eventId;
    }

    public void setTicketCategoryId(long ticketCategoryId) {
        this.ticketCategoryId = ticketCategoryId;
    }

    public int getNumberOfTickets() {
        return numberOfTickets;
    }

    public void setNumberOfTickets(int numberOfTickets) {
        this.numberOfTickets = numberOfTickets;
    }
}
