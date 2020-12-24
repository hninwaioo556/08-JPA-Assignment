package com.mmit;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Basic;
import static javax.persistence.FetchType.EAGER;
import static javax.persistence.FetchType.LAZY;
import javax.persistence.Enumerated;
import javax.persistence.Temporal;
import static javax.persistence.TemporalType.DATE;
import static javax.persistence.EnumType.STRING;

@Entity
public class Student implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	
	private int studentid;
	@Column(length = 40, nullable = false)
	private String studentname;
	@Column(unique = true)
	private String email;
	@Column(nullable = true)
	private int age;	
	@Enumerated(STRING)
	private year year;
	private String address;
	@Temporal(DATE)
	private Date dob;
	private String profile;
	
	public enum year{
		First,Second,Third,Fouth,Fifth
	}

	public int getStudentid() {
		return studentid;
	}
	public void setStudentid(int studentid) {
		this.studentid = studentid;
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

	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getProfile() {
		return profile;
	}
	public void setProfile(String profile) {
		this.profile = profile;
	}
	
	
	
}
