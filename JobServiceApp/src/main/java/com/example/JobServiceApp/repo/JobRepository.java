package com.example.JobServiceApp.repo;



import com.example.JobServiceApp.entity.Job;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface JobRepository extends JpaRepository<Job, Long> {
    Optional<Job> findByApplicationId(Long applicationId);
}

