package com.FreelancingFreaks.FreelancingFreaks.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "portfolio")
public class FreelancerP {


    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "first_name", nullable = false)
    private String firstName;
    
    @Column(name = "last_name", nullable = false)
    private String lastName;
    
    @Column(name = "latest_qualification", nullable = false)
    private String latestQualification;
    
    @Column(name = "skills", nullable = false)
    private String skills;
    
    @Column(name = "gitlink", nullable = false)
    private String gitLink;
    
    @Column(name = "portfolio", nullable = false)
    private String portfolio;
    
    @Column(name = "address", nullable = false)
    private String address;
    
    @Column(name = "phone", nullable = false)
    private String phoneNumber;

    // Constructors, Getters, and Setters
    public FreelancerP() {
    }

    public FreelancerP(String firstName, String lastName, String latestQualification, String skills, String gitLink, String portfolio, String address, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.latestQualification = latestQualification;
        this.skills = skills;
        this.gitLink = gitLink;
        this.portfolio = portfolio;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLatestQualification() {
        return latestQualification;
    }

    public void setLatestQualification(String latestQualification) {
        this.latestQualification = latestQualification;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public String getGitLink() {
        return gitLink;
    }

    public void setGitLink(String gitLink) {
        this.gitLink = gitLink;
    }

    public String getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(String portfolio) {
        this.portfolio = portfolio;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Freelancer{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", latestQualification='" + latestQualification + '\'' +
                ", skills='" + skills + '\'' +
                ", gitLink='" + gitLink + '\'' +
                ", portfolio='" + portfolio + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}



