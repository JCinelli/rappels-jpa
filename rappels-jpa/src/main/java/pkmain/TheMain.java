package pkmain;
import java.sql.Time;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import entities.Acteur;
import entities.Categorie;
import entities.Film;
import repositories.ActeurRepo;
import repositories.CategorieRepo;
import repositories.FilmRepo;

@EntityScan(basePackages = {"entities"})
@EnableJpaRepositories("repositories")
@SpringBootApplication
@EnableTransactionManagement
public class TheMain implements CommandLineRunner {
	
	@PersistenceContext
	EntityManager em;
	
	CategorieRepo categorieRepo;
	
	ActeurRepo acteurRepo;
	
	FilmRepo filmRepo;

	public TheMain(CategorieRepo categorieRepo, ActeurRepo acteurRepo, FilmRepo filmRepo) {
		this.categorieRepo = categorieRepo;
		this.acteurRepo = acteurRepo;
		this.filmRepo = filmRepo;
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
//		Categorie categorie = new Categorie();
//		categorie.setDate_maj(LocalDateTime.now());
//		categorie.setNom("Thriller");
//		em.persist(categorie);
//		
//		Acteur acteur = new Acteur();
//		acteur.setNom("PORTMAN");
//		acteur.setPrenom("Natalie");
//		em.persist(acteur);
//		
//		Acteur acteur2 = new Acteur();
//		acteur2.setNom("WEAVING");
//		acteur2.setPrenom("Hugo");
//		em.persist(acteur2);
//		
//		Acteur acteur3 = new Acteur();
//		acteur3.setNom("REA");
//		acteur3.setPrenom("Stephen");
//		em.persist(acteur3);
//		
//		Film newFilm = new Film();
//		newFilm.setTitre("V pour Vendetta");
//		newFilm.setAnnee_sortie("2006");
//		newFilm.setCategorie(categorie);
//		newFilm.getActeurs().add(acteur);
//		newFilm.getActeurs().add(acteur2);
//		newFilm.getActeurs().add(acteur3);
//		
//		em.persist(newFilm);
		
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
