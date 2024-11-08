package com.example.couriersystem.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class DeliveryDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime deliveryDate;

    @OneToOne
    private Order order;

    //Constructor, get + set, etc.
}
