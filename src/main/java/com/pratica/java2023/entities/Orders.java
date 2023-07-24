package com.pratica.java2023.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "orders")
public class Orders implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "orders_id")
    private long id;

    @ManyToOne
    @JoinColumn(name="customers_id", referencedColumnName="customers_id")
    private Customer customer;

    @ManyToOne
    @JoinColumn(name ="ticket_category_id", referencedColumnName="ticket_category_id")
    private TicketCategory ticketCategory;

    @Column(name = "ordered_at")
    private Date orderedAt;

    @Column(name = "number_of_tickets")
    private int numberOfTickets;

    @Column(name = "total_price")
    private double totalPrice;

    public Orders() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public TicketCategory getTicketCategory() {
        return ticketCategory;
    }

    public void setTicketCategory(TicketCategory ticketCategory) {
        this.ticketCategory = ticketCategory;
    }

    public Date getOrderedAt() {
        return orderedAt;
    }

    public void setOrderedAt(Date orderedAt) {
        this.orderedAt = orderedAt;
    }

    public int getNumberOfTickets() {
        return numberOfTickets;
    }

    public void setNumberOfTickets(int numberOfTickets) {
        this.numberOfTickets = numberOfTickets;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Orders(long id, Customer customer,
                  TicketCategory ticketCategory, Date orderedAt,
                  int numberOfTickets, double totalPrice) {
        this.id = id;
        this.customer = customer;
        this.ticketCategory = ticketCategory;
        this.orderedAt = orderedAt;
        this.numberOfTickets = numberOfTickets;
        this.totalPrice = totalPrice;
    }
    public Orders(Customer customer,
                  TicketCategory ticketCategory, Date orderedAt,
                  int numberOfTickets, double totalPrice) {
        this.customer = customer;
        this.ticketCategory = ticketCategory;
        this.orderedAt = orderedAt;
        this.numberOfTickets = numberOfTickets;
        this.totalPrice = totalPrice;
    }
}
