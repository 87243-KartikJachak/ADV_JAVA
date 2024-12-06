package com.sunbeam.beans;

import java.sql.Date;

import javax.servlet.ServletException;

import com.sunbeam.dao.UserDao;
import com.sunbeam.dao.UserDaoImpl;
import com.sunbeam.entities.User;

public class RegisterBean {
	private String firstname;
	private String lastname;
	private String email;
	private String passwd;
	private String dob;
	public RegisterBean() {
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	
	public void registerUser() throws ServletException
	{
		Date sqlDate =Date.valueOf(dob);
		try (UserDao userDao = new UserDaoImpl()) {
            User user = new User(1, firstname, lastname, email, passwd, sqlDate, 0, "voter");
            int result = userDao.save(user);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new ServletException(e);
		}
	}
}
