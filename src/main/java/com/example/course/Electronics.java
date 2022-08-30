package com.example.course;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="electronics device")
public class Electronics {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String category;
	private String price;
	
	public Electronics() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Electronics(int id, String name, String category,String price) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.price=price;
	}
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
	public String getcategory() {
		return category;
	}
	public void setcategory(String category) {
		this.category = category;
	}
	public String getprice() {
		return price;
	}
	public void setprice(String price) {
		this.category = price;
	}
	@Override
	public String toString() {
		return "Electronics [id=" + id + ", name=" + name + ", category=" + category + " , price="+ price +"]";
	}
	

}



