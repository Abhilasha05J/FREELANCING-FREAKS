package com.FreelancingFreaks.FreelancingFreaks.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Contact")
public class Contact {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column (name="contactId")
	private long conId;
@Column(name="name")
private String name;
@Column(name="email")
private String email;
@Column(name="subject")
private String subject;
@Column(name="message")
private String message;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public long getConId() {
	return conId;
}
public void setConId(long conId) {
	this.conId = conId;
}
public void setEmail(String email) {
	this.email = email;
}
public String getSubject() {
	return subject;
}
public void setSubject(String subject) {
	this.subject = subject;
}
public String getMessage() {
	return message;
}
public void setMessage(String message) {
	this.message = message;
}
@Override
public String toString() {
	return "Contact [name=" + name + ", email=" + email + ", subject=" + subject + ", message=" + message + "]";
}
public Contact() {
	super();
	// TODO Auto-generated constructor stub
}
public Contact(String name, String email, String subject, String message) {
	super();
	this.name = name;
	this.email = email;
	this.subject = subject;
	this.message = message;
}

}
