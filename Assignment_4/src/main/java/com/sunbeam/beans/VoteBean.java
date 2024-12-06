package com.sunbeam.beans;

import com.sunbeam.dao.CandidateDao;
import com.sunbeam.dao.CandidateDaoImpl;
import com.sunbeam.dao.UserDao;
import com.sunbeam.dao.UserDaoImpl;
import com.sunbeam.entities.User;

public class VoteBean {
	private int candId;
	private boolean success;
	private int userId;
	
	public VoteBean() {
	}

	public int getCandId() {
		return candId;
	}

	public void setCandId(int candId) {
		this.candId = candId;
	}

	public boolean getSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public void vote() {
		this.success =false;
		try(CandidateDao candDao = new CandidateDaoImpl())
		{
			int count = candDao.incrVote(this.candId);
			if(count == 1)
			{
				try(UserDao userDao = new UserDaoImpl())
				{
					User user = userDao.findById(this.userId);
					if(user != null)
					{
						user.setStatus(1);
						count = userDao.update(user);		
						if(count == 1)
							this.success = true;
					}
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
}
