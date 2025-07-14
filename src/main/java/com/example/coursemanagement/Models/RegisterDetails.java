package com.example.coursemanagement.Models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "instructor_name")
public class RegisterDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int insId;

    @Column(name="ins_name")
    private String name;
    private String email;
    private String gender;
    private String password;

    @Column(name="Date_of_Birth")
    private Date dateofbirth;

    private String role;
}
