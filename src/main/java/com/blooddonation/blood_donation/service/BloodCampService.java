package com.blooddonation.blood_donation.service;

import com.blooddonation.blood_donation.model.BloodCamp;
import com.blooddonation.blood_donation.repository.BloodCampRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class BloodCampService {
    @Autowired
    private BloodCampRepository bloodCampRepository;

    public List<BloodCamp> getAllCamps() {
        return bloodCampRepository.findAll();
    }

    public Optional<BloodCamp> getCampById(Long id) {
        return bloodCampRepository.findById(id);
    }

    public BloodCamp addCamp(BloodCamp camp) {
        return bloodCampRepository.save(camp);
    }

    public void deleteCamp(Long id) {
        bloodCampRepository.deleteById(id);
    }
}
