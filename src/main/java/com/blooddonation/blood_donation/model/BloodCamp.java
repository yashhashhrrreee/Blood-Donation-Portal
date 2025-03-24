package com.blooddonation.blood_donation.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "blood_camps")
public class BloodCamp {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String campName;
    private String location;
    private LocalDate date;
    private String organizer;
    private String contactNumber;

    // Constructors
    public BloodCamp() {}

    public BloodCamp(String campName, String location, LocalDate date, String organizer, String contactNumber) {
        this.campName = campName;
        this.location = location;
        this.date = date;
        this.organizer = organizer;
        this.contactNumber = contactNumber;
    }

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getCampName() { return campName; }
    public void setCampName(String campName) { this.campName = campName; }

    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }

    public LocalDate getDate() { return date; }
    public void setDate(LocalDate date) { this.date = date; }

    public String getOrganizer() { return organizer; }
    public void setOrganizer(String organizer) { this.organizer = organizer; }

    public String getContactNumber() { return contactNumber; }
    public void setContactNumber(String contactNumber) { this.contactNumber = contactNumber; }
}
