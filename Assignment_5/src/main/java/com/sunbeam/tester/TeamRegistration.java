package com.sunbeam.tester;

import org.hibernate.SessionFactory;

import com.sunbeam.Dao.TeamsDao;
import com.sunbeam.Dao.TeamsDaoImpl;
import com.sunbeam.entities.Teams;

import static com.sunbeam.utils.HibernateUtils.getSessionFactory;

import java.util.Scanner;

public class TeamRegistration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(SessionFactory sf = getSessionFactory())
		{
			Scanner sc = new Scanner(System.in);
			TeamsDao teamDao = new TeamsDaoImpl();
			System.out.println("Enter Team details - Team Name, "
					+ "Abbreviations: , Batting Average:, Wickets:, ");
			Teams newTeam=new Teams(sc.next(), sc.next(), sc.nextDouble(), 
					sc.nextInt());
			System.out.println(teamDao.save(newTeam));
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
