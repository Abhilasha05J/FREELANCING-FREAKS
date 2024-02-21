package com.FreelancingFreaks.FreelancingFreaks.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.FreelancingFreaks.FreelancingFreaks.Entity.FreelancerP;
import com.FreelancingFreaks.FreelancingFreaks.repository.portfoliRepo;

public class PortfolioSerImp implements PortfolioService{
@Autowired
 private portfoliRepo pro;
	@Override
	public FreelancerP addPortfolio(FreelancerP freelancerP) {
		// TODO Auto-generated method stub
		return pro.save(freelancerP);
	}

	@Override
	public FreelancerP updatePortfolio(FreelancerP freelancerP) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FreelancerP getPortfolioById(long id) {
	
		return pro.getById(id);
	}

	@Override
	public List<FreelancerP> getAllPortfolio() {
		
		return pro.findAll();
	}

}
