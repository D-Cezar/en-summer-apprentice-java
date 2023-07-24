package com.pratica.java2023.responseObject;

import java.util.Date;

public class PostResponse {
    public long eventId;

    public Date timestamp;

    public long ticketCategoryId;

    public int numberOfTickets;

    public double totalPrice;

    public PostResponse(long eventId, Date timestamp, long ticketCategoryId,
                        int numberOfTickets, double totalPrice) {
        this.eventId = eventId;
        this.timestamp = timestamp;
        this.ticketCategoryId = ticketCategoryId;
        this.numberOfTickets = numberOfTickets;
        this.totalPrice = totalPrice;
    }
}
