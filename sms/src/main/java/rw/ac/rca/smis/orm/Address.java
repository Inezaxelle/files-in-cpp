package rw.ac.rca.smis.orm;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="address") 

//public class Address implements Serializable {
//	
//	private static final long serialVersionUID = 1L;
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private int id;
//	private String country;
//	private String city;
//	private String streetAddress;
//	private String postalCode;
//	
//	@OneToMany(cascade= CascadeType.ALL, mappedBy = "address")
//	private Set<Student> students;
	
public class Address{
	@OneToMany(cascade= CascadeType.ALL, mappedBy = "address")
	private Set<Student> students;
	@OneToMany(cascade= CascadeType.ALL, mappedBy = "address")
	private Set<Instructor> instructors;
	String name;
	String street;
	public Address(String name, String street) {
	super();
	this.name = name; 
	this.street=street;
	}
}
