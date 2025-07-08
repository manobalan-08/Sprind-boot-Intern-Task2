package com.example.coursemanagement.Controller;

import com.example.coursemanagement.Models.Instructor;
import com.example.coursemanagement.Services.InstructorServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class InstructorController {

    @Autowired
    private InstructorServices instSer;

    @GetMapping("/")
    public String route() {
        return "Welcome to SpringBoot Security";
    }

    // GET all instructors
    @GetMapping("/Instructor")
    public List<Instructor> getAllInstructorId() {
        return instSer.getAllInstructorId();
    }


    // GET instructor by ID
    @GetMapping("/Instructor/{insId}")
    public Instructor getInstructorById(@PathVariable int insId) {
        return instSer.getInstructorById(insId);
    }

    // POST: Add instructor
    @PostMapping
    public String addInstructor(@RequestBody Instructor instructor) {
        return instSer.addInstructor(instructor);
    }

    // PUT: Update instructor by ID
    @PutMapping("/Instructor/{insId}")
    public String updateInstructorsById(@PathVariable int insId, @RequestBody Instructor instructor) {
        return instSer.updateInstructorsById(insId, instructor);
    }

    // DELETE: Delete instructor by ID
    @DeleteMapping("/Instructor/{insId}")
    public String deleteInstructorById(@PathVariable int insId) {
        return instSer.deleteInstructorById(insId);
    }
}
