package com.example.coursemanagement.Services;


import com.example.coursemanagement.Models.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class StudentServices {
    List<Student> obj = new ArrayList<>(
            Arrays.asList(
                    new Student(1, "Manobalan M", "Full-stack-developer"),
                    new Student(2, "ShriDarsh", "Backend-developer"),
                    new Student(3, "Viksh S", "IoT")
            )
    );

    public java.util.List<Student> getId(){
        return obj;
    }


    public java.util.List<Student> postId() {
        return obj;
    }

    public List<Student> putName(){
        return obj;
    }
}
