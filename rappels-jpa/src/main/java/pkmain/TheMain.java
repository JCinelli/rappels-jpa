package pkmain;
import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.transaction.Transactional;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import pkmain.entities.Acteur;
import pkmain.entities.Adresse;
import pkmain.entities.Categorie;
import pkmain.entities.Film;
import pkmain.entities.Producteur;
import pkmain.entities.Realisateur;
import pkmain.entities.Tache;
import pkmain.entities.TacheDatee;
import pkmain.managers.FilmManager;

@SpringBootApplication
@EnableTransactionManagement
public class TheMain implements CommandLineRunner {
	
	
	FilmManager filmManager;

	public TheMain(FilmManager filmManager) {
		this.filmManager = filmManager;
	}

	public static void main(String[] args) {
		
		SpringApplication.run(TheMain.class, args);
		
	}

	@Override
	@Transactional
	public void run(String... args) throws Exception {
		
//		Affichez les informations concernant cet acteur ainsi que les films associés connus de la base de données****************************
//		Acteur acteur = em.find(Acteur.class, 2);
//		System.out.println(acteur);
//		System.out.println(acteur.getFilms());
		
//		Ajoutez un acteur : Simon Pegg et associez-le au film Mission impossible : FALLOUT****************************************************
//		Film film = em.find(Film.class, 3);
//		Acteur newActeur = new Acteur();
//		newActeur.setNom("PEGG");
//		newActeur.setPrenom("Simon");
//		em.persist(newActeur);
//		newActeur.getFilms().add(film);
		
//		Modifiez la date de sortie du film « Avengers : Endgame » qui est 2019 et non 2018*****************************************************
//		Film avanger = em.find(Film.class, 4);
//		avanger.setAnnee_sortie("2019");
		
//		Ajoutez en base de données un film de votre choix ainsi que 3 acteurs ayant joué dans ce film
		Categorie categorie = new Categorie();
		categorie.setDate_maj(LocalDateTime.now());
		categorie.setNom("Thriller");
		
		Adresse ad = new Adresse();
		ad.setCodePostal("34000");
		ad.setLibelleRue("rue de la pelle");
		ad.setNumeroRue(125);
		ad.setVille("Montpellier");
		
		TacheDatee tache = new TacheDatee();
		tache.setDate(LocalDate.now());
		tache.setDateEcheance(LocalDate.of(2020, 12, 18));
		tache.setDescription("Prendre une pause");
		
		Tache tache2 = new Tache();
		tache2.setDate(LocalDate.now());
		tache2.setDescription("Boire du café");
		
		Acteur acteur = new Acteur();
		acteur.setNom("PORTMAN");
		acteur.setPrenom("Natalie");
		acteur.getAdresse().add(ad);
		acteur.setAgence("ASK");
		acteur.setSalaire(15000.00);
		acteur.getTaches().add(tache);
		acteur.getTaches().add(tache2);
		
		Acteur acteur2 = new Acteur();
		acteur2.setNom("WEAVING");
		acteur2.setPrenom("Hugo");
		acteur2.getAdresse().add(ad);
		acteur2.setAgence("ASK");
		acteur2.setSalaire(15000.00);
		acteur2.getTaches().add(tache);
		
		Acteur acteur3 = new Acteur();
		acteur3.setNom("REA");
		acteur3.setPrenom("Stephen");
		acteur3.getAdresse().add(ad);
		acteur3.setAgence("ASK");
		acteur3.setSalaire(15000.00);
		acteur3.getTaches().add(tache2);
		
		Realisateur real = new Realisateur();
		real.getAdresse().add(ad);
		real.setCommission(1600.00);
		real.setNom("BABA");
		real.setPrenom("Helmut");
		real.getTaches().add(tache2);
		
		Producteur prod = new Producteur();
		prod.setBudget(10000000.0);
		prod.getAdresse().add(ad);
		prod.setNom("PRODO");
		prod.setPrenom("Nelson");
		
		Film newFilm = new Film();
		newFilm.setTitre("V pour Vendetta");
		newFilm.setAnnee_sortie("2006");
		newFilm.setCategorie(categorie);
		newFilm.getIntervenants().add(acteur);
		newFilm.getIntervenants().add(acteur2);
		newFilm.getIntervenants().add(acteur3);
		newFilm.getIntervenants().add(real);
		newFilm.getIntervenants().add(prod);
		
		filmManager.insertFilm(newFilm);
		
		
		
//		Supprimez les catégories 10 et 13**********************************************************************************
//		Categorie categorie = em.find(Categorie.class, 10);
//		Categorie categorie2 = em.find(Categorie.class, 13);
//		
//		em.remove(categorie);
//		em.remove(categorie2);
		
//		o Créez une méthode permettant d’extraire un film à partir de son nom************************************************
//		List<Film> findByNom = filmRepo.findByTitre("V pour Vendetta");
//		System.out.println(findByNom.get(0));
		
//		Créez une méthode permettant d’extraire un acteur à partir de son nom et de son	prénom
//		List<Acteur> findByNomAndPrenom = acteurRepo.findByNomAndPrenom("PORTMAN", "Natalie");
//		System.out.println(findByNomAndPrenom.get(0));
		
//		Créez une méthode permettant d’extraire une catégorie à partir de sa date de dernière mise à jour.********************
//		LocalDateTime ldt = LocalDateTime.of(2020,12,16,16,47,23);
//		List<Categorie> findByDate_Maj = categorieRepo.findByDateMaj(ldt);
//		System.out.println(findByDate_Maj.get(0));

	}

}
