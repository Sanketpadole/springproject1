package com.example.springproject.demo.entities;

public class Product {
	private long id;
	private String Name;
	private String Lastname;
	public Product(long id, String Name, String LastName) {
		super();
		this.id = id;
		this.Name = Name;
		this.Lastname = LastName;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setTitle(String title) {
		this.Name = Name;
	}
	public String getDescription() {
		return Lastname;
	}
	public void setDescription(String description) {
		this.Lastname = Lastname;
	}
	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + Name + ", LastName=" + Lastname + "]";
	}
	
	

}
