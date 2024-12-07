package com.sunbeam.Dao;

import org.hibernate.*;
import com.sunbeam.entities.Teams;
import static com.sunbeam.utils.HibernateUtils.getSessionFactory;

import java.io.Serializable;

public class TeamsDaoImpl implements TeamsDao{

	@Override
	public String save(Teams team) {
		// TODO Auto-generated method stub
		String mesg="Please add the correct details";
		Session session = getSessionFactory().getCurrentSession();

		Transaction tx = session.beginTransaction();
		try {
			Serializable id = session.save(team);
			tx.commit();
			mesg ="Team added Successfully";
		} catch(RuntimeException e)
		{
			if(tx != null)
				tx.rollback();
			throw e;
		}
		return mesg;
	}

}
