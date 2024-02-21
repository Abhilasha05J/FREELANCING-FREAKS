package com.FreelancingFreaks.FreelancingFreaks.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.FreelancingFreaks.FreelancingFreaks.Entity.User;
import com.FreelancingFreaks.FreelancingFreaks.repository.userrepo;

import jakarta.transaction.Transactional;

@Service
@Transactional

public class userserviceimp implements userservice
{
	@Autowired
  private userrepo userrepoobj;
	@Override
	public User addUser(User user) {
		if(user.getUserType() == null || user.getUserType().isEmpty())
		{
			user.setUserType("user");
		}
		return userrepoobj.save(user) ;
	}

	@Override
	public User updateUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	
	public void deleteUser(long id) {
		 userrepoobj.deleteById(id);
	}

	@Override
	public User getUserById(long id) {
		// TODO Auto-generated method stub
		return userrepoobj.getById(id);
	}

	@Override
	public List<User> getAllUser() {
		return userrepoobj.findAll();
	}

	public User getUserByEmailAndPassword(String email, String password) {
		// TODO Auto-generated method stub
		return userrepoobj.findByEmailAndPassword(email, password);
	}

}
