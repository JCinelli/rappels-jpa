package pkmain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import pkmain.entities.Adresse;

public interface AdresseRepo extends JpaRepository<Adresse, Integer> {

}
