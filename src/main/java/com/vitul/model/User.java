package com.vitul.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity    
@Table(name="users")
public class User {

	@Id  
	@Column  
	private int userid;  
	@Column  
	private String username;  
	@Column  
	private int userrollno;  
	@Column  
	private int fees;
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getUserrollno() {
		return userrollno;
	}
	public void setUserrollno(int userrollno) {
		this.userrollno = userrollno;
	}
	public int getFees() {
		return fees;
	}
	public void setFees(int fees) {
		this.fees = fees;
	} 
}
