package com.example.coursemanagement.Services;

import com.example.coursemanagement.Models.Student;
import com.example.coursemanagement.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServices {

    @Autowired
    private StudentRepository studRepo;


    public List<Student> getAllStudents() {
        return studRepo.findAll();
    }


    public Student getStudentbyId(int studID) {
        return studRepo.findById(studID).orElse(null);
    }


    public String addStudent(Student student) {
        studRepo.save(student);
        return "Student Added Successfully";
    }


    public String updateStudent(int studID, Student student) {
        if (studRepo.existsById(studID)) {
            student.setStudID(studID);
            studRepo.save(student);
            return "Student Updated Successfully";
        } else {
            return "Student ID not found. Update Failed.";
        }
    }


    public String deleteStudent(int studID) {
        if (studRepo.existsById(studID)) {
            studRepo.deleteById(studID);
            return "Student Deleted Successfully";
        } else {
            return "Student ID not found. Deletion Failed.";
        }
    }

    public Student getStudentByCourse(String course) {
        return studRepo.findByCourse(course);

    }

}




/*  List<Student> obj = new ArrayList<>(
            Arrays.asList(
                    new Student(1, "Manobalan M", "Full-stack-developer"),
                    new Student(2, "ShriDarsh", "Backend-developer"),
                    new Student(3, "Viksh S", "IoT"),
                    new Student(4, "Akash", "Gamer")
            )
    );

   /* public java.util.List<Student> getId(){
        return obj;
    }


    public java.util.List<Student> Updaterecords() {
        return obj;
    }

    public List<Student> putName(){
        return obj;
    } This Method is a basic Method Implemented in Task2
    */
  /* public Student getStudentId(int stuID) {
       for (Student s : obj) {
           if (s.getStudID() == stuID) {
               System.out.println("STUId: " + s.getStudID() + " " + s);
               return s; // Return the student if found
           }
       }
       // If not found, return an empty/default Student
       return new Student();
   }


    public String deleteStudentById(int stuID) {
        for(int i=0 ; i<obj.size();i++){
            if(stuID == obj.get(i).getStudID()){
                obj.remove(i);
               return "Student with "+ stuID + "is successfully deleted!";
            }
        }
        return "Student with "+stuID +"Is not found";
    }

    public String updateId(int stuID, Student student) {
        for (int i = 0; i < obj.size(); i++) {
            Student current = obj.get(i);
            if (current.getStudID() == stuID) {
                current.setName(current.getName());
                current.setStudID(current.getStudID());
                current.setCourse(current.getCourse());
                return"Student Record of "+stuID +" is Updated Successfully"  ;
            }

        }
        return"Student Record is not Found!";
    } */
