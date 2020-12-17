package pkmain.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import pkmain.entities.Intervenant;

public interface IntervenantRepo extends JpaRepository<Intervenant, Integer> {

	List<Intervenant> findByNomAndPrenom(String nom,String prenom);
	
}
