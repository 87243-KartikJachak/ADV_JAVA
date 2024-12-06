package com.sunbeam.beans;

import java.util.List;

import com.sunbeam.dao.CandidateDao;
import com.sunbeam.dao.CandidateDaoImpl;
import com.sunbeam.entities.Candidate;

public class CandidateListBean {
	private List<Candidate> candList;

	public CandidateListBean() {
	}

	public List<Candidate> getCandList() {
		return candList;
	}

	public void setCandList(List<Candidate> candList) {
		this.candList = candList;
	}
	
	public void fetchCandidates() {
		try(CandidateDao candDao = new CandidateDaoImpl())
		{
			this.candList = candDao.findAll();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
}
