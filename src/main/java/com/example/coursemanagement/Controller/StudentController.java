package com.example.coursemanagement.Controller;


import com.example.coursemanagement.Models.Student;
import com.example.coursemanagement.Services.StudentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentServices ss;
    @GetMapping("/")
    public List<Student> getId(){
        return ss.getId();
    }

    @PostMapping("/")
    public List<Student> postId(){
        return ss.postId();
    }

    @PutMapping("/")
    public List<Student> putName(){
        return ss.putName();
    }



}
