package com.blooddonation.blood_donation.controller;

import com.blooddonation.blood_donation.model.Donor;
import com.blooddonation.blood_donation.service.DonorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/donors")
@CrossOrigin(origins = "*")
public class DonorController {
    private final DonorService donorService;

    public DonorController(DonorService donorService) {
        this.donorService = donorService;
    }

    @GetMapping("/search")
    public List<Donor> searchDonors(@RequestParam String bloodGroup, @RequestParam String location) {
        return donorService.getDonorsByBloodGroupAndLocation(bloodGroup, location);
    }

    @PostMapping("/register")
    public Donor registerDonor(@RequestBody Donor donor) {
        return donorService.registerDonor(donor);
    }
}
