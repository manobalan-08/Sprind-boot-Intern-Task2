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
    private StudentServices ss;
    @GetMapping
    public List<Student> getAllStudents()
    {
        return ss.getAllStudents();
    }

    @GetMapping("/{studID}")
    public Student getStudentbyId(@PathVariable int studID){
        return ss.getStudentbyId(studID);
    }

    @PostMapping
    public String addStudent(@RequestBody Student student){
        return ss.addStudent(student);
    }

    @PutMapping("/{studID}")
    public String updateStudent(@PathVariable int studID, @RequestBody Student student){
        return ss.updateStudent(studID, student);
    }

    @DeleteMapping("/{studID}")
    public String deleteStudent(@PathVariable int studID){
        return ss.deleteStudent(studID);
    }

    @GetMapping("/course/{course}")
    public Student getStudentByCourse(@PathVariable String course){
        return ss.getStudentByCourse(course);
    }

}
