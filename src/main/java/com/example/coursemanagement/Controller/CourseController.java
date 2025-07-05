package com.example.coursemanagement.Controller;


import com.example.coursemanagement.Models.Courses;
import com.example.coursemanagement.Models.Student;
import com.example.coursemanagement.Services.CourseServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Courses")
public class CourseController {
    @Autowired
    CourseServices csv;

    @GetMapping("/{cid}")
    public Courses getCoursebyId(@PathVariable int cID){
        return csv.getCoursebyId(cID);
    }


    @PostMapping("/{cID}")
    public String updateCourse(@PathVariable int cID,@RequestBody Courses course){
        return csv.updateCourse(cID,course);
    }

    @DeleteMapping("/{cID}")
    public String deleteCourse(@PathVariable int cID){
        return csv.deleteCourse(cID);
    }

}
