package com.minor.project.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;



@Entity
@Table(name="USER_FEEDBACK")
public class UserfeedbackDtls {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	   private int id;
	
	   private String name;
	   private String email;
	   private String subject;
	   private String message;
	   
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
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
		return "UserfeedbackDtls [id=" + id + ", name=" + name + ", email=" + email + ", subject=" + subject
				+ ", message=" + message + "]";
	}
	   
	   
	   
}
