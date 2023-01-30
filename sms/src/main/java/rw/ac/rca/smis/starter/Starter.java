package rw.ac.rca.smis.starter;

import java.util.Date;

import rw.ac.rca.smis.orm.Address;
import rw.ac.rca.smis.orm.Course;
import rw.ac.rca.smis.orm.Instructor;
import rw.ac.rca.smis.orm.Student;

public class Starter {

	public Starter() {
		// TODO Auto-generated constructor stub
		Address address = new Address("Kicukiro", "KN4 st 13");
		Student st1 = new Student("Axelle", new Date(2001-9-03), "83923434");
		Student st2 = new Student("Ineza", new Date(2008-9-03), "7218822");
		Course course1 = new Course("maths", 3);
		Course course2 = new Course("english", 2);
		Instructor inst1 = new Instructor("Aphrorwa", new Date(1990-8-04), "8239232911");
		
		inst1.setAddress(address);
		st1.setAddress(address);
		st2.setAddress(address);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}