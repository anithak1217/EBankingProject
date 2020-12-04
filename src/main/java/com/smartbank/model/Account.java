package com.smartbank.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="Account")
public class Account {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column(name="accno")
	
	private long accno;
	public long getAccno() {
		return accno;
	}
	public void setAccno(long accno) {
		this.accno = accno;
	}
	@Column(name="acctype")
	public long getAccType() {
		return accType;
	}
	public void setAccType(long accType) {
		this.accType = accType;
	}
	private long accType;
	
}
