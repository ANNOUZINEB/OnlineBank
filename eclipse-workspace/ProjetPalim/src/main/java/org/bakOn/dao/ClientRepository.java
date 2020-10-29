package org.bakOn.dao;


import org.bakOn.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client,Long>{

	Client findByNom(String nom);

}
