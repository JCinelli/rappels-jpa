package pkmain.managers;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.stereotype.Service;

import exceptions.AdresseException;
import pkmain.entities.Adresse;

@Service
public class AdresseManager extends MasterManager {

	public AdresseManager(EntityManager em) {
		super(em);
	}
	
	public void insertAdresse(Adresse adresse) throws AdresseException {
		if (adresse.getCodePostal() == null) {
			throw new AdresseException("Le code postal de l'adresse ne peut pas être null ..");
		}
		
		if (adresse.getLibelleRue() == null) {
			throw new AdresseException("Le libelle dela rue de l'adresse ne peut pas être null ..");
		}
		
		if (adresse.getVille() == null) {
			throw new AdresseException("La ville de l'adresse ne peut pas être null ..");
		}
		
		getEm().persist(adresse);
		
	}

	public void insertAdresses(List<Adresse> adresses) throws AdresseException {
		if (!adresses.isEmpty()) {
			for (Adresse adresse : adresses) {
				getEm().persist(adresse);
			}
		} else {
			throw new AdresseException("La liste d'adresse de l'intervenant ne peut pas être vide ..");
		}
		
	}

	
	
	

}
