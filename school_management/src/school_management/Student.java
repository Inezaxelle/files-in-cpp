package school_management;

import java.util.*;

public class Student{
	
	public Student(int id) {
		super();
		this.id = id;
	}
	int id;
	String name;
	Date dateOfBirth;
	String registrationNum;
	List <Course> courses;
	Address address;
}