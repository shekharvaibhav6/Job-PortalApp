package com.example.JobServiceApp.service;



import com.example.JobServiceApp.entity.Job;
import com.example.JobServiceApp.repo.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JobService {

    @Autowired
    private JobRepository jobRepository;

    public List<Job> getAllJobs() {
        return jobRepository.findAll();
    }

    public Job createJob(Job job) {
        return jobRepository.save(job);
    }
    public Job updateJobStatus(Long id, String status) {
        Optional<Job> optionalJob = jobRepository.findById(id);
        if (optionalJob.isPresent()) {
            Job job = optionalJob.get();
            job.setStatus(status);
            return jobRepository.save(job);
        } else {
            throw new RuntimeException("Job not found with id: " + id);
        }
    }
    public String withdrawApplication(Long applicationId) {
        // Fetch the application from the repository
        Optional<Job> applicationOpt = jobRepository.findByApplicationId(applicationId);

        // Check if application exists
        if (!applicationOpt.isPresent()) {
            return "Application not found.";
        }

        Job application = applicationOpt.get();

        // Update the status to "withdrawn"
        application.setStatus("withdrawn");
        jobRepository.save(application);

        return "Application successfully withdrawn.";
    }
}

