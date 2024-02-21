package com.FreelancingFreaks.FreelancingFreaks.services;

import java.util.List;

import com.FreelancingFreaks.FreelancingFreaks.Entity.User;

public interface userservice {
	User addUser(User user);
	User updateUser(User user);
	void deleteUser(long id);
	User getUserById(long id);
	 List <User> getAllUser();

}
