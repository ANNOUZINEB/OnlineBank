package org.bakOn;


import java.util.Date;

import org.bakOn.dao.ClientRepository;
import org.bakOn.dao.CompteRepository;
import org.bakOn.dao.OperationRepository;
import org.bakOn.entities.Client;
import org.bakOn.entities.Compte;
import org.bakOn.entities.CompteCourant;
import org.bakOn.entities.CompteEpargne;
import org.bakOn.entities.Retrait;
import org.bakOn.entities.Versement;
import org.bakOn.metier.IBanqueMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjetPalimApplication implements CommandLineRunner {
	@Autowired
	private ClientRepository clientRepository;
	@Autowired
	private CompteRepository compteRepository;
	@Autowired
	private OperationRepository operationRepository;
	@Autowired
	private IBanqueMetier banqueMetier;
	public static void main(String[] args) {
		SpringApplication.run(ProjetPalimApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Client c1 = clientRepository.save(new Client("cz4555", "ismail", "malik", "123 BD ANFA RUE AHMED", "0677777770", "isamil@gmil.com"));
	    Client c2 = clientRepository.save(new Client("cz4555", "Amal", "mila", "78 BD sidi ALI RUE X", "0678686886", "AMAL@gmil.com"));
     
	     Compte cp1 = compteRepository.save(new CompteCourant("cp1", new Date(), 90000, c1, 6000));
		Compte cp2 = compteRepository.save(new CompteEpargne("cp2", new Date(), 6000, c2, 5.5));

			operationRepository.save(new Versement(new Date(), 9000, cp1));
			operationRepository.save(new Versement(new Date(), 6000, cp1));
			operationRepository.save(new Versement(new Date(), 2300, cp1));
			operationRepository.save(new Retrait(new Date(), 9000, cp1));

			operationRepository.save(new Versement(new Date(), 2300, cp2));
			operationRepository.save(new Versement(new Date(), 400, cp2));
			operationRepository.save(new Versement(new Date(), 2300, cp2));
			operationRepository.save(new Retrait(new Date(), 3000, cp2));
			banqueMetier.verser("cp1", 44444);
	     
	     
	}

}
