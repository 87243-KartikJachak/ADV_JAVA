package com.sunbeam.beans;

import com.sunbeam.dao.CandidateDao;
import com.sunbeam.dao.CandidateDaoImpl;
import com.sunbeam.dao.UserDao;
import com.sunbeam.dao.UserDaoImpl;

public class DeleteCandidateBean {
	private int candId;
	
	public DeleteCandidateBean() {
	}

	public int getCandId() {
		return candId;
	}

	public void setCandId(int candId) {
		this.candId = candId;
	}
	
	public void deleteCand()
	{
		try(CandidateDao candDao = new CandidateDaoImpl()) 
		{
			int count = candDao.deleteById(this.candId);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
}
