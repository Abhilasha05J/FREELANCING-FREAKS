package com.FreelancingFreaks.FreelancingFreaks.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.FreelancingFreaks.FreelancingFreaks.Entity.User;

@Repository
public interface userrepo extends JpaRepository<User, Long>{
	User findByEmailAndPassword(String email, String password);
}
