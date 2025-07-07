package com.example.coursemanagement.Services;

import com.example.coursemanagement.Models.Instructor;
import com.example.coursemanagement.Repository.InstructorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InstructorServices {
    
    @Autowired
    private InstructorRepository instRepo; 
    
    public Instructor getAllInstructorId() {
        return (Instructor) instRepo.findAll();
    }


    public Instructor getInstructorById(int insId) {
        return instRepo.findById(insId).orElse(null);
    }


    public String deleteInstructorById(int insId) {
        if(instRepo.existsById(insId)) {
            instRepo.deleteById(insId);
            return "Instructor Id Deleted Successfully!";
        }
        else{
            return "Instructor Id Not Found!";
        }
    }

    public String addInstructors(Instructor instructor) {
        instRepo.save(instructor);
        return " Instructors are added Successfully";
    }

    public Instructor updateInstructorsById(int insId, Instructor instructor) {
          if(instRepo.existsById(insId)){
              instRepo.setInstById(insId);
              instRepo.save(instructor);
          }

    }
}
