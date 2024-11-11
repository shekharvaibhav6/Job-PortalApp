package com.example.JobServiceApp.controller;



import com.example.JobServiceApp.entity.Job;
import com.example.JobServiceApp.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/jobs")
public class JobController {

    @Autowired
    private JobService jobService;

    @GetMapping
    public List<Job> getAllJobs() {
        return jobService.getAllJobs();
    }

    @PostMapping
    public Job createJob(@RequestBody Job job) {

        return jobService.createJob(job);
    }
    @PutMapping("/{id}/status")
    public Job updateJobStatus(@PathVariable Long id, @RequestParam String status) {
        return jobService.updateJobStatus(id, status);
    }

    @PutMapping("/withdraw/{applicationId}")
    public ResponseEntity<String> withdrawApplication(@PathVariable Long applicationId) {
        String response = jobService.withdrawApplication(applicationId);

        if (response.equals("Application successfully withdrawn.")) {
            return ResponseEntity.ok(response);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);
        }
    }
}

