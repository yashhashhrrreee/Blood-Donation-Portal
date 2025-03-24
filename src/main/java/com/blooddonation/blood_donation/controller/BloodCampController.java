package com.blooddonation.blood_donation.controller;

import com.blooddonation.blood_donation.model.BloodCamp;
import com.blooddonation.blood_donation.service.BloodCampService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/bloodcamps")
@CrossOrigin(origins = "*") // Allows frontend to access this API
public class BloodCampController {
    @Autowired
    private BloodCampService bloodCampService;

    @GetMapping
    public List<BloodCamp> getAllCamps() {
        return bloodCampService.getAllCamps();
    }

    @GetMapping("/{id}")
    public Optional<BloodCamp> getCampById(@PathVariable Long id) {
        return bloodCampService.getCampById(id);
    }

    @PostMapping
    public BloodCamp addCamp(@RequestBody BloodCamp camp) {
        return bloodCampService.addCamp(camp);
    }

    @DeleteMapping("/{id}")
    public void deleteCamp(@PathVariable Long id) {
        bloodCampService.deleteCamp(id);
    }
}
