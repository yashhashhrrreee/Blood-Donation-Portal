package com.blooddonation.blood_donation.model;

import jakarta.persistence.*;

@Entity
@Table(name = "donors")
public class Donor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fullName;
    private String email;
    private String password; 
    private String bloodGroup;
    private String location;
    private int age;
    private int weight;
    private String phone;

    // Constructors
    public Donor() {}

    public Donor(String fullName, String email, String password, String bloodGroup, String location, int age, int weight, String phone) {
        this.fullName = fullName;
        this.email = email;
        this.password = password; 
        this.bloodGroup = bloodGroup;
        this.location = location;
        this.age = age;
        this.weight = weight;
        this.phone = phone;
    }

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getFullName() { return fullName; }
    public void setFullName(String fullName) { this.fullName = fullName; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPassword() { return password; } 
    public void setPassword(String password) { this.password = password; } // ✅ Added setter

    public String getBloodGroup() { return bloodGroup; }
    public void setBloodGroup(String bloodGroup) { this.bloodGroup = bloodGroup; }

    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public int getWeight() { return weight; }
    public void setWeight(int weight) { this.weight = weight; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }
}
