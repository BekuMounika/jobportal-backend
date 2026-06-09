package com.jobportal.service;

import com.jobportal.model.User;
import com.jobportal.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    public String register(User user) {

        if(repo.findByEmail(user.getEmail()) != null) {
            return "Email Already Exists";
        }

        repo.save(user);
        return "Registration Successful";
    }

    public User login(User user) {

        User dbUser = repo.findByEmail(user.getEmail());

        if(dbUser != null &&
           dbUser.getPassword().equals(user.getPassword())) {

            return dbUser;
        }

        return null;
    }
}