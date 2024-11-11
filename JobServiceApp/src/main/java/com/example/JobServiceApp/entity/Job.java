package com.example.JobServiceApp.entity;

import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.security.SecurityProperties;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "jobs")
public class Job {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;
    private String company;
    private Long applicationId;
    private Long userId;
    private String status;
    @ManyToMany(mappedBy = "appliedJobs")
    private List<SecurityProperties.User> applicants = new ArrayList<>();

    // Constructors, getters, and setters

    public List<SecurityProperties.User> getApplicants() {
        return applicants;
    }

    public void setApplicants(List<SecurityProperties.User> applicants) {
        this.applicants = applicants;
    }
    public Job(){

    }

    public Job(Long id, String title, String description, String company, Long applicationId, Long userId, String status) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.company = company;
        this.applicationId = applicationId;
        this.userId = userId;
        this.status = status;
    }

    public Long getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(Long applicationId) {
        this.applicationId = applicationId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }



    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
