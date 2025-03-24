package com.blooddonation.blood_donation.controller;

import com.blooddonation.blood_donation.model.Donor;
import com.blooddonation.blood_donation.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin(origins = "*")
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("/register")
    public Donor registerUser(@RequestBody Donor donor) {
        return authService.registerUser(donor);
    }

    @PostMapping("/login")
    public String loginUser(@RequestParam String email, @RequestParam String password) {
        Optional<Donor> donor = authService.loginUser(email, password);
        return donor.isPresent() ? "Login Successful" : "Invalid Credentials";
    }
}
