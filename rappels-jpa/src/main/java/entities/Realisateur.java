package entities;

import javax.persistence.Entity;

@Entity
public class Realisateur extends Intervenant {

//	FILEDS
	private Double commission;
	
//	CONSTRUCTOR
	public Realisateur() {
		super();
	}

//	GETTERS & SETTERS
	public Double getCommission() {
		return commission;
	}

	public void setCommission(Double commission) {
		this.commission = commission;
	}

}
