package com.dto;

public class UserDTO {
String username;
String password;
String country;
String emailId;
public UserDTO() {
	super();
	// TODO Auto-generated constructor stub
}

public UserDTO(String username, String password, String country, String emailId) {
	super();
	this.username = username;
	this.password = password;
	this.country = country;
	this.emailId = emailId;
}

public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
public String getEmailId() {
	return emailId;
}
public void setEmailId(String emailId) {
	this.emailId = emailId;
}
@Override
public String toString() {
	return "UserDTO [username=" + username + ", password=" + password + ", country=" + country + ", emailId=" + emailId
			+ "]";
}

}
