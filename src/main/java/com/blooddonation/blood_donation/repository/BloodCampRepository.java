package com.blooddonation.blood_donation.repository;

import com.blooddonation.blood_donation.model.BloodCamp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BloodCampRepository extends JpaRepository<BloodCamp, Long> {

    // Custom query to find all blood camps by location
    List<BloodCamp> findByLocation(String location);

    // Custom query to find all blood camps happening after a certain date
    List<BloodCamp> findByDateAfter(java.time.LocalDate date);

    // Custom query to find all blood camps organized by a specific organizer
    List<BloodCamp> findByOrganizer(String organizer);
}
