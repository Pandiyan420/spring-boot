/**
 * 
 */
package com.pkg.pandiyan.entiry;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Pandiyan
 *
 */
@Entity
@Table(name = "user")
public class User {

	
	@Id
	@GeneratedValue
	@Column(name = "Id")
	private Integer id;
	
	@Column(name = "User_Id")
	private Integer userId;
	
	@Column(name = "User_Name")
	private String userName;
	
	@Column(name = "Email")
	private String email;
	
	@Column(name = "Password")
	private String password;

	@Column(name = "Created_Date")
	private Date createdDate;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	
}
