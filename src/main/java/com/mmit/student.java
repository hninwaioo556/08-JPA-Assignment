package com.mmit;

import java.io.Serializable;
import javax.persistence.*;

import static javax.persistence.EnumType.STRING;

@Entity
public class student implements Serializable {
	
	@Id
	private int id;
	private String studentname;
	private String email;
	private int age;

	@Enumerated(STRING)
	private year year;
	
	private String address;
	private String profile;
	
	private static final long serialVersionUID = 1L;
	
	public enum year{
		First, Second, Third, Fourth, Fifth
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getProfile() {
		return profile;
	}
	public void setProfile(String profile) {
		this.profile = profile;
	}	

}
