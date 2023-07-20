package com.pratica.java2023.entities;

import jakarta.persistence.*;

import java.io.Serializable;


@Entity
@Table(name = "Customer")
public class CustomerEntity implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "customers_id")
    private long customer_id;

    @Column(name = "name", length = 50)
    private String name;

    @Column(name = "email", length = 30)
    private String email;

    public CustomerEntity(){}
}
