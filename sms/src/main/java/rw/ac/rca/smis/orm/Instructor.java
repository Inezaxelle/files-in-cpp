package rw.ac.rca.smis.orm;

import java.util.*;

import javax.persistence.*;

@Entity
@Table(name="instructor")

public class Instructor{
	String name; 
	Date dateOfBirth;
	String nid;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne
	@JoinColumn(name="address_id")
	private Address address;
	
	public Instructor(String name, Date dateOfBirth, String nid) {
		super();
		this.name=name;
		this.dateOfBirth = dateOfBirth;
		this.nid = nid;
	} 
	List <Course> courses;

	public void setAddress(Address address) {
		this.address = address;		
	}
	
}  