package org.bakOn.dao;

import org.bakOn.entities.Compte;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompteRepository extends JpaRepository<Compte,String>{


	Compte findByCodeCompte(String codeCpte);
	

}
