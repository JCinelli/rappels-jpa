package pkmain.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import pkmain.entities.Film;

public interface FilmRepo extends JpaRepository<Film, Integer> {
	
	List<Film> findByTitre(String titre);

}
