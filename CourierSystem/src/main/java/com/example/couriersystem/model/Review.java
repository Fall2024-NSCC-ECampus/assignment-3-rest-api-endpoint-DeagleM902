package com.example.couriersystem.model;

import jakarta.persistence.*;

@Entity
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String customerName;
    private String reviewText;
    private int rating;

    @ManyToOne
    private Product product;

    //Constructor, get + set, etc.
}
