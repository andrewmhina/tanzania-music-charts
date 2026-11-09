package com.tmc.tanzaniamusiccharts.entity;

import jakarta.persistence.*;

@Entity 
@Table(name = "categories")
public class Category {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false, unique = true)
    private String name;
}
