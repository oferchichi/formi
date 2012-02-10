package com.esprit.mcs.formation.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.esprit.mcs.formation.domain.Employer;
import com.esprit.mcs.formation.utils.MySqlConnection;

public class EmployerDao {
	MySqlConnection conn= MySqlConnection.getInstance();
	private static EmployerDao instance ;

   public EmployerDao() {

   }
   
   public void save(Employer user){
		  String sql = "INSERT INTO employer VALUES('"+user.getLoginUser()+ "','"+user.getPassUser()+"')";	
	      conn.executeUpdate(sql);		 
			 
			}
		
		public void remove (Employer user){
		   String sql="DELETE FROM employer WHERE employer.LoginUser='"+user.getLoginUser()+"'";
		   conn.executeQuery(sql);
		   
		}
		
		public void update (Employer user){
			String sql="UPDATE employer SET employer.LoginUser='"+ user.getLoginUser()+"',employer.PassUser='"+ user.getPassUser()+"' WHERE employer.LoginUser='"+ user.getLoginUser()+"'";
			   conn.executeQuery(sql);

		}

		public Employer  findByKey (String login){
			String sql="SELECT * FROM employer  WHERE employer.LoginUser='"+login+"'"; 
			ResultSet rs=conn.executeQuery(sql);
			Employer user = new Employer();
			
			try {
				while (rs.next()){
			      user.setLoginUser(rs.getString("LoginUser"));
			      user.setPassUser(rs.getString("PassUser"));
				}
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			return user;
			
		}
		
		public List<Employer> listAll() {
			String sql="SELECT * FROM employer ";
			ResultSet rs=conn.executeQuery(sql);
			List <Employer> users = new ArrayList<Employer>();
			try {
				while (rs.next()){
					Employer user = new Employer();
				      user.setLoginUser(rs.getString("LoginUser"));
				      user.setPassUser(rs.getString("PassUser"));
				      users.add(user);
					}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return users;
			
		}

		
	public static EmployerDao getInstance() {
		if(instance==null)
			  instance= new EmployerDao();
		return instance;
	}
	


}
