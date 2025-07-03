package com.example.coursemanagement.Models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Student {
    private int studID;
    private String name;
    private String course;
}
