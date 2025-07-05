package com.example.coursemanagement.Controller;


import com.example.coursemanagement.Models.Student;
import com.example.coursemanagement.Services.StudentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Students")
public class StudentController {

    @Autowired
    StudentServices ss;
    @GetMapping("/{stuID}")
    public Student getStudentId(@PathVariable int stuID){
        return ss.getStudentId(stuID);
    }

    @PostMapping("/{stuID}")
    public String updateId(@PathVariable int stuID, @RequestBody Student student){
        return ss.updateId(stuID,student);
    }

    /*@PutMapping("/{name}")
    public List<Student> putName(@PathVariable String name){
        return ss.putName(name);
    }
     */
    @DeleteMapping("/{stuID}")
    public String deleteStudentById(int stuID){
        return ss.deleteStudentById(stuID);
    }



}
