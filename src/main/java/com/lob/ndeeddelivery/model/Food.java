package com.lob.ndeeddelivery.model;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "foods")
public class Food {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "food_name", unique = true, nullable = false)
    private String foodName;

    @Column(name = "content", nullable = false)
    private String content;

    @Column(name = "price", nullable = false)
    private BigDecimal price;

    @Column(name = "time_created", nullable = false)
    private LocalDateTime timeCreated;
}
