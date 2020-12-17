package pkmain.managers;

import javax.persistence.EntityManager;

import org.springframework.stereotype.Service;

import exceptions.CategorieException;
import pkmain.entities.Categorie;

@Service
public class CategorieManager extends MasterManager {

	public CategorieManager(EntityManager em) {
		super(em);
	}

	public void insertCategorie(Categorie categorie) throws CategorieException {
		if (categorie.getNom() == null) {
			throw new CategorieException("Le nom de la catégorie ne peut pas être null ..");
		}
		
		if (categorie.getDate_maj() == null) {
			throw new CategorieException("La date de mise a jour de la categorie ne peut pas être null ..");
		}
		
		this.getEm().persist(categorie);
	}

	
	
	

}
