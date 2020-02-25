package com.gestion.Personnel;

import java.util.List;
import java.util.Optional;

//import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonnelController {

	@Autowired
	IPersonnelRepository Ipersonnel;
	
	
	//Afficher tous les personnels
	@GetMapping("api/personnel")
	public List<Personnel> getAllNotes() {
	    return Ipersonnel.findAll();
	}
	
	// get un personnel
	@GetMapping("api/personnel/{id}")
	public Optional<Personnel> getPersonneById(@PathVariable(value = "id") Long personneId) {
	    return Ipersonnel.findById(personneId);
	}
	
	// Creer un personnel
	
	/*@RequestMapping(value = "/AddPersonne", consumes = "application/json",headers = "content-type=application/json")
	public Personnel createPersonnel(@Valid @RequestBody Personnel pers) {
	    return Ipersonnel.save(pers);
	}
	*/
	//ajouter un produit
    @PostMapping(value = "/personne")
    public void ajouterPersonne(@RequestBody Personnel pers) {
    	Ipersonnel.save(pers);
    }
}
