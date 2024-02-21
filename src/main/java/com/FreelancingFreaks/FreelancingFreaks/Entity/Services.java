package com.FreelancingFreaks.FreelancingFreaks.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
@Entity
@Table(name="Services")
public class Services {
    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="serviceId")
    private long serviceId;
    
   
    @Column(name="servicename")
    private String serviceName;

    @Column(name="status")
    private boolean status;

	public long getServiceId() {
		return serviceId;
	}

	public void setServiceId(long serviceId) {
		this.serviceId = serviceId;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public Services() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Services(long serviceId, String serviceName, boolean status) {
		super();
		this.serviceId = serviceId;
		this.serviceName = serviceName;
		this.status = status;
	}
    
 
}
