package com.esprit.mcs.formation.actionlistener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import com.esprit.mcs.formation.dao.EmployerDao;
import com.esprit.mcs.formation.domain.Employer;
import com.esprit.mcs.formation.main.EmployerConnecte;
import com.esprit.mcs.formation.utils.DataSourceFactory;
import com.esprit.mcs.formation.utils.MySqlConnection;
import com.esprit.mcs.formation.views.AdminView;
import com.esprit.mcs.formation.views.LoginView;

public class LoginViewActionListener  implements ActionListener{
     private LoginView loginView;
	
	
	public LoginViewActionListener() {
		// TODO Auto-generated constructor stub
	}
	
	
	public LoginViewActionListener(LoginView loginView) {
		super();
		this.setLoginView(loginView);
	}

   
	public void actionPerformed(ActionEvent e) {
		 MySqlConnection.getInstance().connect(new DataSourceFactory().createDataSource());
		 if (e.getSource() == loginView.getValiderAuthentification()) {
				String l = loginView.getLoginField().getText();
				String p = String.valueOf(loginView.getPassField().getPassword());
				if(l.equals(null) && p.equals(null)){
					JOptionPane.showMessageDialog(null,"Echec Identification !  Erreur Login/Password","Echec",JOptionPane.ERROR_MESSAGE);
				}
				else {
					Employer emp =EmployerDao.getInstance().findByKey(l);
					if (emp.getLoginUser() != null && emp.getPassUser() != null) {
						if (emp.getLoginUser().equals(l) && emp.getPassUser().equals(p)) {
						    EmployerConnecte.setEmployerCon(emp);
						    AdminView adminView = new AdminView();
						    adminView.setVisible(true);
						    loginView.dispose();
						}
						
						else JOptionPane.showMessageDialog(null,"Echec Identification !  Erreur Login/Password","Echec",JOptionPane.ERROR_MESSAGE);
						}
					else JOptionPane.showMessageDialog(null,"Echec Identification !  Erreur Login/Password","Echec",JOptionPane.ERROR_MESSAGE);
				}
				
		 }
		
	}


	public LoginView getLoginView() {
		return loginView;
	}


	public void setLoginView(LoginView loginView) {
		this.loginView = loginView;
	}
	

}
