package school_management;

import java.util.*;

public class Instructor{
	
	public Instructor(int id) {
		super();
		this.id = id;
	}
	int id;
	String name;
	Date dateOfBirth;
	String nid;
	List <Course> courses;
	Address address;
}