package com.example.coursemanagement.Controller;

import com.example.coursemanagement.Models.Instructor;
import com.example.coursemanagement.Models.Student;
import com.example.coursemanagement.Services.InstructorServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Instructor")
public class InstructorController {

    @Autowired
    private InstructorServices instSer;

    @GetMapping
    public Instructor getAllInstructorId(){
        return instSer.getAllInstructorId();
    }

    @GetMapping("/{insId}")
    public Instructor getInstructorById(@PathVariable int insId){
        return instSer.getInstructorById(insId);
    }

  @PostMapping
  public String addInstructors(@RequestBody Instructor instructor){
        return instSer.addInstructors(instructor);
  }

  @PutMapping("/{insId}")
  public Instructor updateInstructorsById(@PathVariable int insId ,@RequestBody Instructor instructor){
        return instSer.updateInstructorsById(insId,instructor);
  }

    @DeleteMapping("/{insId}")
    public String deleteInstructorById(@PathVariable int insId){
        return instSer.deleteInstructorById(insId);
    }

}
