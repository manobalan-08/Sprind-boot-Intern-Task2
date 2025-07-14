package com.example.coursemanagement.Services;

import com.example.coursemanagement.Models.RegisterDetails;
import com.example.coursemanagement.Repository.RegisterDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthServices {

    @Autowired
    private RegisterDetailsRepository registerDetailsRepository;

    private final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

    public String addNewInstrustor(RegisterDetails register) {
        RegisterDetails registerDetails = new RegisterDetails();
        registerDetails.setInsId(register.getInsId());
        registerDetails.setName(register.getName());
        registerDetails.setEmail(register.getEmail());
        registerDetails.setGender(register.getGender());
        registerDetails.setDateofbirth(register.getDateofbirth());
        registerDetails.setRole(register.getRole());
        registerDetails.setPassword(encoder.encode(register.getPassword()));

        registerDetailsRepository.save(registerDetails);
        return "Instructor Added Successfully";
    }

    public String postInstructor(RegisterDetails login) {
        RegisterDetails user = registerDetailsRepository.findByEmail(login.getEmail()).orElse(null);

        if (user != null && encoder.matches(login.getPassword(), user.getPassword())) {
            return "Login successful!!!";
        } else {
            return "Invalid email or password!";
        }
    }
}
