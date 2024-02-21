package com.FreelancingFreaks.FreelancingFreaks.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.FreelancingFreaks.FreelancingFreaks.Entity.Contact;
import com.FreelancingFreaks.FreelancingFreaks.repository.contactRepo;

@Service
public class ContactServiceImp implements contactService {
         @Autowired
	  private contactRepo contactRepoobj;
	@Override
	public Contact addContact(Contact contact) {
	
		return contactRepoobj.save(contact);
	}

	@Override
	public void deleteContact(long conId) {
		contactRepoobj.deleteById(conId);
		
	}

	@Override
	public Contact getContactById(long conId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Contact> getAllContact() {
		return contactRepoobj.findAll();
	}
	
	
}
