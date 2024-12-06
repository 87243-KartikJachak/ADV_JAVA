package com.sunbeam.beans;

import com.sunbeam.dao.CandidateDao;
import com.sunbeam.dao.CandidateDaoImpl;
import com.sunbeam.entities.Candidate;

public class FindCandidateBean {
	private int candId;
	private Candidate cand;
	
	public FindCandidateBean() {
	}

	public int getCandId() {
		return candId;
	}

	public void setCandId(int candId) {
		this.candId = candId;
	}

	public Candidate getCand() {
		return cand;
	}

	public void setCand(Candidate cand) {
		this.cand = cand;
	}
	
	public void findCandidate() {
		try(CandidateDao candDao = new CandidateDaoImpl())
		{
			this.cand = candDao.findById(candId);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
