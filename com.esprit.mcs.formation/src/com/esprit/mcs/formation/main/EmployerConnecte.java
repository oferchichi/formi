package com.esprit.mcs.formation.main;

import com.esprit.mcs.formation.domain.Employer;

public class EmployerConnecte {
 private static Employer employerCon;

public static Employer getEmployerCon() {
	return employerCon;
}

public static void setEmployerCon(Employer employerCon) {
	EmployerConnecte.employerCon = employerCon;
}
 
}
