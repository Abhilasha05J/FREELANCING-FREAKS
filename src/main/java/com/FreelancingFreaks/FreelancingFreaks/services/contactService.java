package com.FreelancingFreaks.FreelancingFreaks.services;

import java.util.List;

import com.FreelancingFreaks.FreelancingFreaks.Entity.Contact;


public interface contactService {
	Contact addContact(Contact contact);
	void deleteContact(long conId);	
	Contact getContactById(long conId);
	List <Contact> getAllContact();

}
