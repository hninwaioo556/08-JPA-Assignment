package com.mmit;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

import static javax.persistence.EnumType.STRING;

@Entity
public class Course implements Serializable {
	
	@Id
	private int id;
	private String coursename;
	private int price;

	@Enumerated(STRING)
	private level role;
	
	private int duration;
	private Date startDate;
	
	private static final long serialVersionUID = 1L;
	
	public enum level{
		Basic,Intermediate,Advance
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getCoursename() {
		return coursename;
	}
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}

	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	
	
	
	
}
