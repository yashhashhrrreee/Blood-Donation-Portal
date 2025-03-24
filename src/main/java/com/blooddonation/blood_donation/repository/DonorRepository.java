package com.blooddonation.blood_donation.repository;

import com.blooddonation.blood_donation.model.Donor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface DonorRepository extends JpaRepository<Donor, Long> {

    // Find donors by blood group and location
    List<Donor> findByBloodGroupAndLocation(String bloodGroup, String location);

    // Find all donors in a specific location
    List<Donor> findByLocation(String location);

    // Find all donors with a specific blood group
    List<Donor> findByBloodGroup(String bloodGroup);

    Optional<Donor> findByEmail(String email);
}
