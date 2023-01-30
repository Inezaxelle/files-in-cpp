package rw.ac.rca.smis.orm;

import javax.persistence.Entity;

@Entity
public class Course {
	private int id;
	private String name;
	private int period;
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getPeriod() {
		return period;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPeriod(int period) {
		this.period = period;
	}
	 
	public Course(String name, int period) {
		super();
		this.name = name;
		this.period = period;
	}
} 