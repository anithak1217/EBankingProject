package com.smartbank.dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.smartbank.model.Customer;

public class CustomerDao {

	@Autowired
private DataSource dataSource;
 
	
	 
	 
	public void insert(Customer e) {
		
		 
	   	 	
		JdbcTemplate insert = new JdbcTemplate(dataSource);
	insert.update("INSERT INTO customer1 (custid, firstname,lastname,age,gender,city,occupation,contactno)" +
	    		" VALUES(?,?,?,?,?,?,?,?)",
	    		e.getCid(),e.getFname(),e.getLname(),e.getAge(),e.getGender(),e.getCity(),e.getOccup(),e.getCnum());
		
		 
	} 
	
	
	public Customer getEmpById(int custid){    
		JdbcTemplate obj = new JdbcTemplate(dataSource);
	    String sql="select * from customer1 where custid=?";    
	  
	    Customer cust= obj.queryForObject(sql, new Object[]{custid},new BeanPropertyRowMapper<Customer>(Customer.class));  
	    return cust;
	}
	public void modify(Customer e) {
		
		 
   	 	
		JdbcTemplate insert = new JdbcTemplate(dataSource);
		insert.update("update customer1 set firstname='"+e.getFname()+"',lastname="+e.getLname()+"age="+e.getAge()+"where id="+e.getCid());
		
		 
	} 
}
