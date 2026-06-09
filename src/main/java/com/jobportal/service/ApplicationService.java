package com.jobportal.service;

import com.jobportal.model.Application;
import com.jobportal.repository.ApplicationRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApplicationService {

    @Autowired
    private ApplicationRepository repo;

    public String applyJob(Application app) {

        List<Application> existing =
                repo.findByUserEmail(app.getUserEmail());

        for(Application a : existing) {

            if(a.getJobId().equals(app.getJobId())) {
                return "Already Applied";
            }
        }

        app.setStatus("APPLIED");
        repo.save(app);

        return "Applied Successfully";
    }

    public List<Application> getApplications(String email) {
        return repo.findByUserEmail(email);
    }
}