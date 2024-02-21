package com.FreelancingFreaks.FreelancingFreaks.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.FreelancingFreaks.FreelancingFreaks.Entity.FreelancerP;
@Repository
public interface portfoliRepo extends JpaRepository<FreelancerP, Long>{

}
