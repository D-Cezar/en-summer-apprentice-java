package com.pratica.java2023.Entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "orders")
public class OrdersEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "orders_id")
    private long orders_id;

    @ManyToOne
    @JoinColumn(name="customer_id", referencedColumnName="customer_id", foreignKey=@ForeignKey(name = "FK__orders__customer__440B1D61"))
    private CustomerEntity customer;

    @ManyToOne
    @JoinColumn(name ="ticket_category_id", referencedColumnName="ticket_category", foreignKey=@ForeignKey(name = "FK__orders__ticket_c__44FF419A"))
    private TicketCategory ticketCategory;

    @Column(name = "ordered_at")
    private Date ordered_at;

    @Column(name = "number_of_tickets")
    private int number_of_tickets;

    @Column(name = "total_price")
    private double total_price;
}