package com.example.coursemanagement.Repository;

import com.example.coursemanagement.Models.Instructor;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.lang.ScopedValue;

@Repository
public interface InstructorRepository extends JpaRepository<Instructor ,Integer> {


    void setInstById(int insId);
}
