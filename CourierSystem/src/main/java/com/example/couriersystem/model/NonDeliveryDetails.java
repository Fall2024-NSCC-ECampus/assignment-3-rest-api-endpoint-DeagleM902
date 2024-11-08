package com.example.couriersystem.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class NonDeliveryDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime scheduledDate;

    @OneToOne
    private Order order;
    private String description;

    //Constructor, get + set, etc.
}
