package pkmain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import pkmain.entities.Tache;

public interface TacheRepo extends JpaRepository<Tache, Integer> {

}
