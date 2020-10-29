package org.bakOn.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Client implements Serializable {
	@Id @GeneratedValue
	private Long code;
	private String cin;
	private String nom;
	private String prenom;
	private String adress;
	private String numTel;
	private String email;
	@OneToMany(mappedBy="client",fetch = FetchType.LAZY)
	private Collection<Compte> comptes;
	
	public Client() {
		// TODO Auto-generated constructor stub
	}
	public Client(String cin, String nom, String prenom, String adress, String numTel, String email) {
		super();
		this.cin = cin;
		this.nom = nom;
		this.prenom = prenom;
		this.adress = adress;
		this.numTel = numTel;
		this.email = email;
	}
	public Long getCode() {
		return code;
	}
	public void setCode(Long code) {
		this.code = code;
	}
	public String getCin() {
		return cin;
	}
	public void setCin(String cin) {
		this.cin = cin;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String getNumTel() {
		return numTel;
	}
	public void setNumTel(String numTel) {
		this.numTel = numTel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Collection<Compte> getComptes() {
		return comptes;
	}
	public void setComptes(Collection<Compte> comptes) {
		this.comptes = comptes;
	}

}
