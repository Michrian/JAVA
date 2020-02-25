package com.gestion.Mission;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

import com.gestion.Personnel.Personnel;

//import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
public class Mission {
@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;
 private String nom_mission;
 private String lieux;
 private String tache;
 private String description;
 private Date date_debut ;
 private Date date_fin;
 
 @ManyToMany
 @JoinColumn(name="ID_PERSONNEL")
private Collection<Personnel> personnel ;
 
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
public Date getDate_debut() {
	return date_debut;
}
public void setDate_debut(Date date_debut) {
	this.date_debut = date_debut;
}
public Date getDate_fin() {
	return date_fin;
}
public void setDate_fin(Date date_fin) {
	this.date_fin = date_fin;
}
 
	  
}
