package com.jobportal.controller;

import com.jobportal.model.Job;
import com.jobportal.service.JobService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jobs")
@CrossOrigin(origins = "*")
public class JobController {

    @Autowired
    private JobService service;

    // Get All Jobs
    @GetMapping
    public List<Job> getAllJobs() {
        return service.getAllJobs();
    }

    // Get Job By Id
    @GetMapping("/{id}")
    public Job getJobById(
            @PathVariable Long id) {

        return service.getJobById(id);
    }

    // Add Job
    @PostMapping
    public Job addJob(
            @RequestBody Job job) {

        return service.addJob(job);
    }

    // Update Job
    @PutMapping("/{id}")
    public Job updateJob(
            @PathVariable Long id,
            @RequestBody Job job) {

        return service.updateJob(id, job);
    }

    // Delete Job
    @DeleteMapping("/{id}")
    public String deleteJob(
            @PathVariable Long id) {

        service.deleteJob(id);

        return "Job Deleted Successfully";
    }
}