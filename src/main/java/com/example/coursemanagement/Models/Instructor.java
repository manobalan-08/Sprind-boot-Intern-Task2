package com.example.coursemanagement.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.web.WebProperties;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Instructor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int insId;
    private String name;
    private int salary;

}
