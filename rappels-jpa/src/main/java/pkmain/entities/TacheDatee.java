package pkmain.entities;

import java.time.LocalDate;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("DATEE")
public class TacheDatee extends Tache {
	
//	FIELDS
	private LocalDate dateEcheance;

//	CONSTRUCTOR
	public TacheDatee() {
		super();
	}
	
//	GETTERS & SETTERS
	public LocalDate getDateEcheance() {
		return dateEcheance;
	}

	public void setDateEcheance(LocalDate dateEcheance) {
		this.dateEcheance = dateEcheance;
	}



}
