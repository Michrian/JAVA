package com.gestion.Personnel;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
public class Personnel {
@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;
 private String nom;
 private String prenom;
 private String poste;
 private String matricule;
 private String adresse;
 private String tel;
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
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
public String getPoste() {
	return poste;
}
public void setPoste(String poste) {
	this.poste = poste;
}
public String getMatricule() {
	return matricule;
}
public void setMatricule(String matricule) {
	this.matricule = matricule;
}
public String getAdresse() {
	return adresse;
}
public void setAdresse(String adresse) {
	this.adresse = adresse;
}
public String getTel() {
	return tel;
}
public void setTel(String tel) {
	this.tel = tel;
}
 

	  
}
