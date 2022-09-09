package com.lob.ndeeddelivery.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "username",unique = true, nullable = false,length = 100)
    private String userName;

    @Column(name = "password", unique = false,nullable = false, length = 100)
    private String password;

    @Column(name = "time_created", nullable = false)
    private LocalDateTime timeCreated;

    @Enumerated(EnumType.STRING)
    @Column(name = "role", nullable = false)
    private Role role;
}
