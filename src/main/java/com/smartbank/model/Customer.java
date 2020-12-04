package com.smartbank.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="customer")

public class Customer {
	
		
		public Customer()
		{
			
			
		}
		
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		 
		
		int cid;
		@Column(name="custid")
		@NotEmpty(message="customerid Cannot be empty") 
		public int getCid() {
			return cid;
		}
		public void setCid(int cid) {
			this.cid = cid;
		}
		String fname;
		@Column(name="firstname")
		@NotEmpty(message="firstname Cannot be empty") 
		public String getFname() {
			return fname;
		}
		public void setFname(String fname) {
			this.fname = fname;
		}
		String lname;
		@Column(name="lastname") 
		@NotEmpty(message="lastname Cannot be empty") 
		public String getLname() {
			return lname;
		}
		public void setLname(String lname) {
			this.lname = lname;
		}
		int age;

		
		@Column(name="age")
		@NotEmpty(message="age Cannot be empty") 
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		String gender;
		@Column(name="gender")
		@NotEmpty(message="gender Cannot be empty") 
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		String city;
		@Column(name="city")
		@NotEmpty(message="city Cannot be empty") 
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		String occup;
		@Column(name="occupation")
		@NotEmpty(message="occupation Cannot be empty") 
		public String getOccup() {
			return occup;
		}
		public void setOccup(String occup) {
			this.occup = occup;
		}
		String cnum;
		@Column(name="contactNo")
		@NotEmpty(message="contact number Cannot be empty") 
		public String getCnum() {
			return cnum;
		}
	
		public void setCnum(String cnum) {
			this.cnum = cnum;
		}		

}


