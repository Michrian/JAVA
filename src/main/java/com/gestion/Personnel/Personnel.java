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
 private String nom_mission;
 private String lieux;
 private String tache;
 private String description;
 
 //information que nous ne souhaitons pas exposer
 
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getLieux() {
	return lieux;
}
public void setLieux(String lieux) {
	this.lieux = lieux;
}
public String getTache() {
	return tache;
}
public void setTache(String tache) {
	this.tache = tache;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}

public String getNom_mission() {
	return nom_mission;
}
public void setNom_mission(String nom_mission) {
	this.nom_mission = nom_mission;
}
 

 
	  
}
