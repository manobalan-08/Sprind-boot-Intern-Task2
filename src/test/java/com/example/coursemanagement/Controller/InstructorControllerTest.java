package com.example.coursemanagement.Controller;

import com.example.coursemanagement.Models.RegisterDetails;
import com.example.coursemanagement.Services.InstructorServices;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.awt.*;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;


public class InstructorControllerTest {

    @Mock
    InstructorServices instructorServices;

    @Mock
    InstructorController instructorController;

    void setUp(){
        MockitoAnnotations.openMocks(this);
    }

    void testGetMethod(){
        RegisterDetails ins1= new RegisterDetails();
        RegisterDetails ins2= new RegisterDetails();
       when(instructorServices.getMethod()).thenReturn(Arrays.asList(ins1,ins2));
        List<InstructorController> result= instructorController.getMethodMockito();
        assertEquals(2,result.size());
    }


}
