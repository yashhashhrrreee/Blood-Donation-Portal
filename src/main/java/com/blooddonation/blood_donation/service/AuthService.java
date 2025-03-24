package com.blooddonation.blood_donation.service;

import com.blooddonation.blood_donation.model.Donor;
import com.blooddonation.blood_donation.repository.DonorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AuthService {
    
    @Autowired
    private DonorRepository donorRepository;

    public Donor registerUser(Donor donor) {
        // Save password as plaintext (for testing purposes)
        return donorRepository.save(donor);
    }

    public Optional<Donor> loginUser(String email, String password) {
        Optional<Donor> donor = donorRepository.findByEmail(email);

        // Directly compare passwords (not secure, but works for testing)
        if (donor.isPresent() && donor.get().getPassword().equals(password)) {
            return donor; // Successful login
        }
        return Optional.empty(); // Login failed
    }

    public Optional<Donor> getDonorByEmail(String email) {
        return donorRepository.findByEmail(email);
    }
}
