package com.esprit.mcs.formation.scripts;

import java.io.IOException;

import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;
import org.jdom.Document;

import com.esprit.mcs.formation.dao.FormationDao;
import com.esprit.mcs.formation.domain.Formation;
import com.esprit.mcs.formation.utils.DataSourceFactory;
import com.esprit.mcs.formation.utils.MySqlConnection;



public class CheckFormation {
 
	public CheckFormation() {
		// TODO Auto-generated constructor stub
	}
	
	public void  check(){
		MySqlConnection.getInstance().connect(new DataSourceFactory().createDataSource());
		 SAXBuilder  sb = new SAXBuilder();
		 Formation formation = null;
		   try {
				Document xmlDoc = sb.build("config/test.xml");
				Element root=xmlDoc.getRootElement();
				Element titre=root.getChild("titre");

				/* this a comment add by me */
				formation= new Formation();
				formation.setTitreFormation(titre.getText());
				formation.setPrix(Integer.parseInt(root.getChildText("prix")));
				formation.setContenueFormation(root.getChildText("contenu"));
				formation.setDateDebut((root.getChildText("datedebut")));
				formation.setDateFin(root.getChildText("datefin"));
				formation.setApprouved(root.getChildText("approuved"));
				
			} catch (JDOMException e) {
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		   FormationDao.getInstance().addFormation(formation);
	}
}
