package com.sunbeam.beans;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpSession;

import com.sunbeam.dao.UserDao;
import com.sunbeam.dao.UserDaoImpl;
import com.sunbeam.entities.User;

public class LoginBean {
	private String email;
	private String passwd;
	public User user;
	
	public LoginBean() {
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
	
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public void Login()
	{
		try(UserDao userDao = new UserDaoImpl())
		{
			User dbUser = userDao.findByEmail(this.email);
			if(dbUser!=null && dbUser.getPassword().equals(this.passwd))
			{				
				this.user=dbUser;	
			}
			else
			{
				this.user = null;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
}