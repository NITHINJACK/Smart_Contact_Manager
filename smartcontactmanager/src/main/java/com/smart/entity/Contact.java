package com.smart.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "CONTACT")
public class Contact {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cId;
	private String name;
	private String lastName;
	private String work;
	private String email;
	private String imgUrl;
	private String mobNo;
	
	@Column(length = 1000)
	private String description;
	
	@ManyToOne
	private User user;
	
	public Contact() {
		// TODO Auto-generated constructor stub
	}

	public Contact(String name, String lastName, String work, String email, String imgUrl, String mobNo,
			String description) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.work = work;
		this.email = email;
		this.imgUrl = imgUrl;
		this.mobNo = mobNo;
		this.description = description;
	}

	public int getcId() {
		return cId;
	}

	public void setcId(int cId) {
		this.cId = cId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getWork() {
		return work;
	}

	public void setWork(String work) {
		this.work = work;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public String getMobNo() {
		return mobNo;
	}

	public void setMobNo(String mobNo) {
		this.mobNo = mobNo;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Contact [cId=" + cId + ", name=" + name + ", lastName=" + lastName + ", work=" + work + ", email="
				+ email + ", imgUrl=" + imgUrl + ", mobNo=" + mobNo + ", description=" + description + ", user=" + user
				+ "]";
	}	
	
	

}
