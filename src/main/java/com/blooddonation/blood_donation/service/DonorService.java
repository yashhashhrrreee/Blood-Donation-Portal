package com.blooddonation.blood_donation.service;

import com.blooddonation.blood_donation.model.Donor;
import com.blooddonation.blood_donation.repository.DonorRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class DonorService {
    private final DonorRepository donorRepository;

    public DonorService(DonorRepository donorRepository) {
        this.donorRepository = donorRepository;
    }

    public Donor registerDonor(Donor donor) {
        return donorRepository.save(donor);
    }

    public List<Donor> getDonorsByBloodGroupAndLocation(String bloodGroup, String location) {
        System.out.println("Searching for: Blood Group = " + bloodGroup + ", Location = " + location);
        return donorRepository.findByBloodGroupAndLocation(bloodGroup, location);
    } 
    
}
