package com.FreelancingFreaks.FreelancingFreaks.services;

import java.util.List;

import com.FreelancingFreaks.FreelancingFreaks.Entity.FreelancerP;

public interface PortfolioService {
	FreelancerP addPortfolio(FreelancerP freelancerP);
	FreelancerP updatePortfolio(FreelancerP freelancerP);
	FreelancerP getPortfolioById(long id);
	List <FreelancerP> getAllPortfolio();

}
