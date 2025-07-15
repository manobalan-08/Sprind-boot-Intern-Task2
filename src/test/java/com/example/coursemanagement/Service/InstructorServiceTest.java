package com.example.coursemanagement.Service;

import com.example.coursemanagement.Models.RegisterDetails;
import com.example.coursemanagement.Repository.InstructorRepository;
import com.example.coursemanagement.Repository.RegisterDetailsRepository;
import com.example.coursemanagement.Services.InstructorServices;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class InstructorServiceTest {

    @Mock
    RegisterDetailsRepository registerDetailsRepository;

    @InjectMocks
    InstructorServices instructorServices;

    @BeforeEach
    void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testGetMethod() {
        RegisterDetails ins1 = new RegisterDetails();
        RegisterDetails ins2 = new RegisterDetails();

        // Mocking the behavior of the registerDetailsRepository
        when(registerDetailsRepository.findAll()).thenReturn(Arrays.asList(ins1, ins2));

        // Call the method on the instructorServices instance
        List<RegisterDetails> result = instructorServices.getMethod();

        // Assert the size of the result
        assertEquals(2, result.size());
        System.out.println(result);
    }


}
