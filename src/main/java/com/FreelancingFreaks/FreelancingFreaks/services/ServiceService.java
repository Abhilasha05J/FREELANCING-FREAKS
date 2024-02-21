package com.FreelancingFreaks.FreelancingFreaks.services;

import java.util.List;

import com.FreelancingFreaks.FreelancingFreaks.Entity.Services;


public interface ServiceService {
	Services addService(Services services);
	Services updateService(Services services);
	void deleteService(long id);
	Services getServiceById(long id);
	 List <Services> getAllServices();
}
