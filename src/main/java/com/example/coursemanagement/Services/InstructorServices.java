package com.example.coursemanagement.Services;

import com.example.coursemanagement.Models.Instructor;
import com.example.coursemanagement.Models.RegisterDetails;
import com.example.coursemanagement.Repository.InstructorRepository;
import com.example.coursemanagement.Repository.RegisterDetailsRepository;
import org.apache.catalina.util.ErrorPageSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InstructorServices {

    @Autowired
    private InstructorRepository instRepo;

    @Autowired
    private RegisterDetailsRepository registerDetailsRepository;


    public List<Instructor> getAllInstructorId() {
        return instRepo.findAll();
    }


    public Instructor getInstructorById(int insId) {
        return instRepo.findById(insId).orElse(null);
    }

    public String deleteInstructorById(int insId) {
        if(instRepo.existsById(insId)) {
            instRepo.deleteById(insId);
            return "Instructor Id Deleted Successfully!";
        }
        return "Instructor Id Not Found!";
    }

    public String addInstructor(Instructor instructor) {
        instRepo.save(instructor);
        return "Instructor is added Successfully";
    }

    public String updateInstructorsById(int insId, Instructor instructor) {
        if (instRepo.existsById(insId)) {
            Instructor updatedInstructor = instRepo.findById(insId).orElse(null);
            if (updatedInstructor != null) {
                updatedInstructor.setName(instructor.getName());
                updatedInstructor.setSalary(instructor.getSalary());
                instRepo.save(updatedInstructor);
                return "Instructor is successfully updated!";
            }
        }
        return "Instructor ID not found (404)";
    }


    public List<RegisterDetails> getMethod() {
        return registerDetailsRepository.findAll();
    }
}
