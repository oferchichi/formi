package com.esprit.mcs.formation.dao;

import com.esprit.mcs.formation.domain.Formation;
import com.esprit.mcs.formation.utils.MySqlConnection;

public class FormationDao {

	MySqlConnection conn= MySqlConnection.getInstance();
	private static FormationDao instance ;
	
	
	public FormationDao() {
		// TODO Auto-generated constructor stub
	}


	public static FormationDao getInstance() {
		if (instance==null)
              instance= new FormationDao();
		return instance;
	}

	public void addFormation(Formation formation){
		String sql="insert into formation (organizme,titre,contenu,datedeb,datefin,prix,approuved) values('"+formation.getOrgaFormation()+"','"+ formation.getTitreFormation()+"','"+ formation.getContenueFormation()+"','"+formation.getDateDebut()+"','"+formation.getDateFin()+"',"+formation.getPrix()+",'"+formation.getApprouved()+"')";
		conn.executeUpdate(sql);
	}

	
	
}
