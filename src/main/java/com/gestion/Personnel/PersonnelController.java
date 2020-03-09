package com.gestion.Personnel;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

//import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PersonnelController {

	@Autowired
	IPersonnelRepository Ipersonnel;
	
	
	//Afficher tous les personnels
	@GetMapping("/personnel")
	public List<Personnel> getAllNotes() {
	    return Ipersonnel.findAll();
	}
	
	// get un personnel
	@GetMapping("/personnel/{id}")
	public Optional<Personnel> getPersonneById(@PathVariable(value = "id") Long personneId) {
	    return Ipersonnel.findById(personneId);
	}
	
	// Creer un personnel
	/*@RequestMapping(value = "/AddPersonne", consumes = "application/json",headers = "content-type=application/json")
	public Personnel createPersonnel(@Valid @RequestBody Personnel pers) {
	    return Ipersonnel.save(pers);
	}*/
	
	//Ajouter un personnel
    @PostMapping(value = "/addPersonne")
    public void ajouterPersonne(@RequestBody Personnel pers) {
    	Ipersonnel.save(pers);
    }
    
   
     
    //Update Personnel
    @PutMapping("/UpPersonnel/{id}")
    public ResponseEntity<?> UpPersonnel(@PathVariable(value="id") Long idUp , @Valid @RequestBody Personnel persAll ) {
    	
    	 
    	 Personnel idPers = Ipersonnel.getOne(idUp);
    	 
    	 idPers.setNom(persAll.getNom());
    	 idPers.setPrenom(persAll.getPrenom());
    	 idPers.setMatricule(persAll.getMatricule());
    	 
    	 Ipersonnel.save(idPers);
    	 
    	 return new ResponseEntity<>("Modification effectué", HttpStatus.CREATED);
    }
    
    
    // Test Unitaire  sur URI delete
    
    @DeleteMapping("/delPersonnel/{id}")
    public ResponseEntity<?> delPersonnel (@PathVariable(value="id") Long idDel) {
    	
    	     Optional<Personnel> persDel = Ipersonnel.findById(idDel);
    	    
    	     Ipersonnel.delete(persDel.get());
    	    return new ResponseEntity<>("Suppression avec succèes", HttpStatus.OK);
    }
    
    
    public  int calculer(int a, int b) {
        int res = a + b;
        
        if (a == 0) {
          res = b * 2;
        } 
        
        if (b == 0) {
          res = a * a;     
        }
        return res; 
      }
    
    
}
