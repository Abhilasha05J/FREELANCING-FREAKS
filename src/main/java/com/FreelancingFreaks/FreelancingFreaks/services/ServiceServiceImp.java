package com.FreelancingFreaks.FreelancingFreaks.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.FreelancingFreaks.FreelancingFreaks.Entity.Services;
import com.FreelancingFreaks.FreelancingFreaks.repository.ServiceRepo;
@Service
public class ServiceServiceImp implements ServiceService{
	@Autowired
	  private ServiceRepo servicerepoobj;
	@Override
	public Services addService(Services services) {
		
		return servicerepoobj.save(services);
	}

	@Override
	public Services updateService(Services services) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteService(long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Services getServiceById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Services> getAllServices() {
		
		return servicerepoobj.findAll();
	}

	
}
