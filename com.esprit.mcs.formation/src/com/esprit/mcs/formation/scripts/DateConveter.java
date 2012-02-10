package com.esprit.mcs.formation.scripts;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConveter {
   public String dateToSting(Date date){
	   SimpleDateFormat d = new SimpleDateFormat("yyyy-MM-dd");
	   String todaytoSring= d.format(date);
return todaytoSring;	   
   }
   
   
	
}
