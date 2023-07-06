package com.example.callRest.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "User_data")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long id;
	
	@Column(name="user_name")
	public String userName;
	
	@Column(name="password")
	public String password;
	
	@Column(name="user_Email")
	public String email;
	
	@Column(name="mobile_number")
	public String mobileNumber;
	
	@Column(name="description")
	public String description;
	
	@Column(name="pass_generate_date")
	public LocalDate passGeneDate;
	
	@Column(name="user_status")
	public String userStatus;
	
	@Column(name="account_non_locked")
	public boolean accountnonlocked;
	
	@Column(name="roleNew")
	public String role;
	
	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public boolean isAccountnonlocked() {
		return accountnonlocked;
	}

	public void setAccountnonlocked(boolean accountnonlocked) {
		this.accountnonlocked = accountnonlocked;
	}

	public String getUserStatus() {
		return userStatus;
	}

	public void setUserStatus(String userStatus) {
		this.userStatus = userStatus;
	}

	public LocalDate getPassGeneDate() {
		return passGeneDate;
	}

	public void setPassGeneDate(LocalDate passGeneDate) {
		this.passGeneDate = passGeneDate;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", password=" + password + ", email=" + email
				+ ", mobileNumber=" + mobileNumber + ", description=" + description + ", passGeneDate=" + passGeneDate
				+ ", userStatus=" + userStatus + ", accountnonlocked=" + accountnonlocked + ", role=" + role + "]";
	}

	

}
