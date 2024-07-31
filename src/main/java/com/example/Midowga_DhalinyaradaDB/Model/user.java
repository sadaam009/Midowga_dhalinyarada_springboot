package com.example.Midowga_DhalinyaradaDB.Model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "macmiil")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class user {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String phone;
    private String degan;
    private String stateedu;
    private String jop;
    private String bloodtype;
}
