package com.pratica.java2023.Entities;

import jakarta.persistence.*;



@Entity
@Table(name = "Customers")
public class CustomerEntity {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "customers_id")
    private long customer_id;

    @Column(name = "name", length = 50)
    private String name;

    @Column(name = "email", length = 30)
    private String email;

//    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL, orphanRemoval = true)
//    private List<OrdersEntity> orders;

}
