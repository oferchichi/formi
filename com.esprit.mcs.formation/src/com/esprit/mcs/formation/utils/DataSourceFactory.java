package com.esprit.mcs.formation.utils;

import java.io.IOException;

import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;
import org.jdom.Document;

public class DataSourceFactory {

	  public   DataSource createDataSource(){
		   
		   SAXBuilder  sb = new SAXBuilder();
		   DataSource dataSource=null;
		   try {
			Document xmlDoc = sb.build("config/data.xml");
			Element root=xmlDoc.getRootElement();
			Element url=root.getChild("url");
			
			dataSource= new DataSource();
			dataSource.setHost(url.getText());
		    dataSource.setDbName(root.getChild("database").getText());
			dataSource.setDriverClass(root.getChildText("driver-class"));
			dataSource.setPort(root.getChildText("port"));
			dataSource.setUserLogin(root.getChildText("login"));
			dataSource.setUserPwd(root.getChildText("password"));
			
		} catch (JDOMException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dataSource;
		   
	   }
		

}