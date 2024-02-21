package com.FreelancingFreaks.FreelancingFreaks.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.FreelancingFreaks.FreelancingFreaks.Entity.Services;
@Repository
public interface ServiceRepo extends JpaRepository<Services, Long>{

}
