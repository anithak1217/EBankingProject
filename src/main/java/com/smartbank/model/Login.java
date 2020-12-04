
package com.smartbank.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="login")

public class Login {
	
		
		public Login()
		{
			
			
		}
		
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		int cid;
		@Column(name="custid")
		@NotEmpty(message="uname Cannot be empty") 
		public int getCid() {
			return cid;
		}
		public String getUsername() {
			return username;
		}
		public void setUsername(String uname) {
			Login.username = uname;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String pwd) {
			Login.password = pwd;
		}
		
		@Column(name="username")
		@NotEmpty(message="uname Cannot be empty")
		static 
		String username;
		
		@Column(name="password") 
		@NotEmpty(message="uname Cannot be empty")
		static 
		String password;
}
