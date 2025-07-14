package com.example.coursemanagement.Repository;

import com.example.coursemanagement.Models.RegisterDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RegisterDetailsRepository extends JpaRepository<RegisterDetails,Integer> {


    Optional<RegisterDetails> findByEmail(String email);
}
