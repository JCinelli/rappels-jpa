package pkmain.managers;

import javax.persistence.EntityManager;

import org.springframework.stereotype.Service;

import exceptions.AdresseException;
import exceptions.CategorieException;
import exceptions.FilmException;
import exceptions.IntervenantException;
import exceptions.TacheException;
import pkmain.entities.Film;

@Service
public class FilmManager extends MasterManager {
	
	private CategorieManager categorieManager;
	private IntervenantManager intervenantManager;
	
	public FilmManager(EntityManager em, CategorieManager categorieManager, IntervenantManager intervenantManager) {
		super(em);
		this.categorieManager = categorieManager;
		this.intervenantManager = intervenantManager;
	}

	public void insertFilm(Film film) throws FilmException, CategorieException, IntervenantException, AdresseException, TacheException {
		if (film.getAnnee_sortie() == null) {
			throw new FilmException("La date de sortie du film ne peut pas être null ..");
		}
		
		if (film.getTitre() == null) {
			throw new FilmException("Le titre du film ne peut pas être null ..");
		}
		
		categorieManager.insertCategorie(film.getCategorie());
		
		intervenantManager.insertIntervenants(film.getIntervenants());
		
		
		getEm().persist(film);
	}

}
