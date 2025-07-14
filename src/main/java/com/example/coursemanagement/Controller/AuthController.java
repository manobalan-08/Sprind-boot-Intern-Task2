package com.example.coursemanagement.Controller;

import com.example.coursemanagement.Models.RegisterDetails;
import com.example.coursemanagement.Services.AuthServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
    @Autowired
    AuthServices authserve;

    @GetMapping("/register")
    public String addNewUser(@RequestBody RegisterDetails register){
      authserve.addNewInstrustor(register);
        return "Instructor Register Successfully";
    }

    @GetMapping("/login")
    public String login(){
        return "Instructor Login Successfully";
    }

    @PostMapping("/register")
    public String postInstructor(@RequestBody RegisterDetails register){
       return authserve.postInstructor(register);

    }
    @PostMapping("/login")

}
