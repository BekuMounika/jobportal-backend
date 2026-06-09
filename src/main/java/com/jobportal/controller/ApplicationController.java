package com.jobportal.controller;

import com.jobportal.model.Application;
import com.jobportal.service.ApplicationService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/applications")
@CrossOrigin(origins = "*")
public class ApplicationController {

    @Autowired
    private ApplicationService service;

    @PostMapping("/apply")
    public String applyJob(@RequestBody Application app) {

        return service.applyJob(app);
    }

    @GetMapping("/{email}")
    public List<Application> getApplications(
            @PathVariable String email) {

        return service.getApplications(email);
    }
}