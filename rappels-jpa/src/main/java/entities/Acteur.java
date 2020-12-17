package entities;

import javax.persistence.Entity;

@Entity
public class Acteur extends Intervenant {

//	FIELDS	
	private String agence;
	
	private Double salaire;

//	CONSTRUCTORS
	public Acteur() {
		super();
	}

//	METHODS
	

//  GETTERS & SETTERS
	public String getAgence() {
		return agence;
	}

	public void setAgence(String agence) {
		this.agence = agence;
	}

	public Double getSalaire() {
		return salaire;
	}

	public void setSalaire(Double salaire) {
		this.salaire = salaire;
	}
}
