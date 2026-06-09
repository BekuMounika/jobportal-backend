package com.jobportal.service;

import com.jobportal.model.Job;
import com.jobportal.repository.JobRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    @Autowired
    private JobRepository repo;

    // Get All Jobs
    public List<Job> getAllJobs() {
        return repo.findAll();
    }

    // Add Job
    public Job addJob(Job job) {
        return repo.save(job);
    }

    // Delete Job
    public void deleteJob(Long id) {
        repo.deleteById(id);
    }

    // Get Job By Id
    public Job getJobById(Long id) {
        return repo.findById(id).orElse(null);
    }

    // Update Job
    public Job updateJob(Long id, Job job) {

        Job existingJob =
                repo.findById(id).orElse(null);

        if (existingJob != null) {

            existingJob.setTitle(
                    job.getTitle());

            existingJob.setCompany(
                    job.getCompany());

            existingJob.setLocation(
                    job.getLocation());

            existingJob.setSalary(
                    job.getSalary());

            existingJob.setDescription(
                    job.getDescription());

            return repo.save(existingJob);
        }

        return null;
    }
}