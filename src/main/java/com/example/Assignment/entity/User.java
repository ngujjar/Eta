package com.example.Assignment.entity;

import jakarta.persistence.*;
import lombok.Data;



@Data
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fname;
    private String lastname;
    private String phone;
    private boolean enabled = true;

}
