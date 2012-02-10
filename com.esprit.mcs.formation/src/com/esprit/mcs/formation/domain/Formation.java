package com.esprit.mcs.formation.domain;


public class Formation {
    private String orgaFormation;
	private String titreFormation;
	private int prix ;
	private String dateDebut;
	private String dateFin;
	private String contenueFormation;
	private String Approuved ;
	
	public Formation() {
		// TODO Auto-generated constructor stub
	}

	public String getOrgaFormation() {
		return orgaFormation;
	}

	public void setOrgaFormation(String orgaFormation) {
		this.orgaFormation = orgaFormation;
	}

	public String getTitreFormation() {
		return titreFormation;
	}

	public void setTitreFormation(String titreFormation) {
		this.titreFormation = titreFormation;
	}

	public int getPrix() {
		return prix;
	}

	public void setPrix(int prix) {
		this.prix = prix;
	}

	public String getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(String dateDebut) {
		this.dateDebut = dateDebut;
	}

	public String getDateFin() {
		return dateFin;
	}

	public void setDateFin(String dateFin) {
		this.dateFin = dateFin;
	}

	public String getContenueFormation() {
		return contenueFormation;
	}

	public void setContenueFormation(String contenueFormation) {
		this.contenueFormation = contenueFormation;
	}

	public String getApprouved() {
		return Approuved;
	}

	public void setApprouved(String approuved) {
		Approuved = approuved;
	}

	

}
