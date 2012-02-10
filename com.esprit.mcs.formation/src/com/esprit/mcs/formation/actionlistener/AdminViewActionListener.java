package com.esprit.mcs.formation.actionlistener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.esprit.mcs.formation.scripts.CheckFormation;
import com.esprit.mcs.formation.utils.DataSourceFactory;
import com.esprit.mcs.formation.utils.MySqlConnection;
import com.esprit.mcs.formation.views.AdminView;

public class AdminViewActionListener implements ActionListener{
	private AdminView adminView;
	

	public AdminViewActionListener(AdminView adminView) {
		super();
		this.adminView = adminView;
	}


	@Override
	public void actionPerformed(ActionEvent arg0) {
		MySqlConnection.getInstance().connect(new DataSourceFactory().createDataSource());
		if(arg0.getSource()==adminView.getLancer()){
			CheckFormation a = new CheckFormation();
			a.check();
		}
	}


	public AdminView getAdminView() {
		return adminView;
	}


	public void setAdminView(AdminView adminView) {
		this.adminView = adminView;
	}

}
