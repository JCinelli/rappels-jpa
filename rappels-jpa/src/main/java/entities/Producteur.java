package entities;

import javax.persistence.Entity;

@Entity
public class Producteur extends Intervenant {

//	FIELDS
	private Double budget;
	
//	CONSTRUCTOR
	public Producteur() {
		super();
	}

//	GETTERS & SETTERS
	public Double getBudget() {
		return budget;
	}

	public void setBudget(Double budget) {
		this.budget = budget;
	}

}
