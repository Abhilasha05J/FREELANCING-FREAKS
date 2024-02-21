package com.FreelancingFreaks.FreelancingFreaks.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.FreelancingFreaks.FreelancingFreaks.Entity.Contact;
@Repository
public interface contactRepo extends JpaRepository<Contact, Long>{

}
