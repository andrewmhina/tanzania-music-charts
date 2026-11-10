package com.tmc.tanzaniamusiccharts.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity 
@Table(name = "administrators")
@Getter 
@Setter
public class Administrator {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true, length = 100)
    private String username;

    @Column(name = "password_hash", nullable = false)
    private String passwordHash;

    @Column(nullable = false, length = 30)
    private String role;
}
