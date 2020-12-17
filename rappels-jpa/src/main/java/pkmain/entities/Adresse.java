package pkmain.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Adresse {

//	FIELDS
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private Integer numeroRue;
	
	private String libelleRue;
	
	private String ville;
	
	private String codePostal;
	
	@ManyToMany
	@JoinTable(name = "adresse_intervenant", joinColumns = @JoinColumn(name = "id_adresse", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "id_intervenant", referencedColumnName = "id"))
	private List<Intervenant> intervenants;

//	CONSTRUCTOR
	public Adresse() {
		this.intervenants = new ArrayList<>();
	}

//	GETTERS & SETTERS
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getNumeroRue() {
		return numeroRue;
	}

	public void setNumeroRue(Integer numeroRue) {
		this.numeroRue = numeroRue;
	}

	public String getLibelleRue() {
		return libelleRue;
	}

	public void setLibelleRue(String libelleRue) {
		this.libelleRue = libelleRue;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}

	public List<Intervenant> getIntervenants() {
		return intervenants;
	}

	public void setIntervenants(List<Intervenant> intervenants) {
		this.intervenants = intervenants;
	}

}
