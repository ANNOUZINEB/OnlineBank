package org.bakOn.metier;

import java.util.List;

import org.bakOn.entities.Client;
import org.bakOn.entities.Compte;
import org.bakOn.entities.Operation;
import org.springframework.data.domain.Page;

public interface IBanqueMetier {
	public Compte consulterunCompte(String codeCpte);
	public void verser(String codeCpte,double montant);
	public void retirer(String codeCpte,double montant);
	public void virement (String codeCpte1,String codeCpte2,double montant);
	public Page<Operation> listeOperation(String codeCpte,int page ,int size);
	public List<Client> listeClients();
	public List<Compte> listeCompte();
	public Client findClient(String nomClient);
	public void creeCompteCourant(String codeCompte,double solde,double decouvert,Client client);
	public void creeCompteEpargne(String codeCompte,double solde,double taux,Client client);
	public boolean existeCompte(String codeCompte);
	public void creeClient(String cin, String nom,String prenom,String adress,String numTel,String email);
	public void delete(String codeCompte);
}
