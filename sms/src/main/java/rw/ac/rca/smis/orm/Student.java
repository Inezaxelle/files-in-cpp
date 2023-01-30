package rw.ac.rca.smis.orm;

import java.util.*;

import javax.persistence.Entity;
@Entity
public class Student{
	
	public Student(String name, Date dateOfBirth, String registrationNum) {
		super();
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.registrationNum = registrationNum;
	}
	String name;
	Date dateOfBirth;
	String registrationNum;
	List <Course> courses;
	Address address;
	public void setAddress(Address address2) {
		// TODO Auto-generated method stub
		this.address = address2;
	}
}  