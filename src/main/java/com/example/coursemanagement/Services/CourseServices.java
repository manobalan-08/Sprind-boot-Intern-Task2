package com.example.coursemanagement.Services;

import com.example.coursemanagement.Models.Courses;
import com.example.coursemanagement.Models.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class CourseServices {

    List<Courses> cObj= new ArrayList<>(Arrays.asList(new Courses(1435,"Cloud Computing",1500) ,
            new Courses(1450 ,"FullStack",2500),
            new Courses(1540,"Artificial Intelligence",2800)
    ));



    public Courses getCoursebyId(int cID) {
        for(Courses c : cObj){
            if(cID== c.getCID()){
                System.out.println("Course Id :" +c.getCID() );
                return c;
            }
        }
        return new Courses();
    }

    public String updateCourse(int cID, Courses course){
        for(int i=0 ; i<cObj.size() ; i++){
            Courses recent=cObj.get(i);
            if(recent.getCID() == cID){
                recent.setCID(recent.getCID());
                recent.setCourse(recent.getCourse());
                recent.setFees(recent.getFees());
                return "Courses are Successfully Updated!";
            }
        }
       return "Courses are not updated!";
    }

    public String deleteCourse(int cID){

        for(int i=0; i<cObj.size() ; i++){
            if(cID==cObj.get(i).getCID()){
                cObj.remove(i);

                return "Courses are deleted Succesfully!";
            }

        }
        return "Course are not Found 404!";
    }
}
