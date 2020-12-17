package pkmain.managers;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.stereotype.Service;

import exceptions.AdresseException;
import exceptions.IntervenantException;
import exceptions.TacheException;
import pkmain.entities.Intervenant;

@Service
public class IntervenantManager extends MasterManager {

	private AdresseManager adresseManager;
	
	private TacheManager tacheManager;

	public IntervenantManager(EntityManager em, AdresseManager adresseManager, TacheManager tacheManager) {
		super(em);
		this.adresseManager = adresseManager;
		this.tacheManager = tacheManager;
	}

	public void insertIntervenant(Intervenant intervenant) throws IntervenantException, AdresseException, TacheException {
		if (intervenant.getNom() == null) {
			throw new IntervenantException("Le nom de l'intervenant ne peut pas être null ..");
		}

		if (intervenant.getPrenom() == null) {
			throw new IntervenantException("Le prénom de l'intervenant ne peut pas être null ..");
		}

		adresseManager.insertAdresses(intervenant.getAdresse());

		tacheManager.insertTaches(intervenant.getTaches());

		getEm().persist(intervenant);
	}

	public void insertIntervenants(List<Intervenant> intervenants) throws IntervenantException, AdresseException, TacheException {
		if (!intervenants.isEmpty()) {
			for (Intervenant intervenant : intervenants) {
				insertIntervenant(intervenant);
			}
		} else {
			throw new IntervenantException("Impossible d'insérer un liste d'intervenants vide ..");
		}

	}

}
