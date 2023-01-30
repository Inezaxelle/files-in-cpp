package rw.ac.rca.smis.orm;

import java.util.Date;
 
 public abstract class Person {
	private int id;
	public String name;
	private String phoneNumber;
	private Date dateOfBirth;
	
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber; 
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    } 

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

  
}