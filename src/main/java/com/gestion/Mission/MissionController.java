package com.gestion.Mission;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
@CrossOrigin
public class MissionController {
	
	@Autowired
	IMissionRepository Imission;
	
	@GetMapping("/mission")
	public List<Mission> getAllMission (){
		return Imission.findAll();
	}
	
	
	@GetMapping("/mission/{idMission}")
	public Optional<Mission> getMission (@PathVariable(value="idMission") Long id){
		return Imission.findById(id);
	}

	
	@PutMapping("/mission/{idMission}")
	public ResponseEntity<?>  updateMission (@PathVariable(value="idMission") Long idUP , @Valid @RequestBody Mission AllMission){
		Mission idMission = Imission.getOne(idUP);
		idMission.setDescription(AllMission.getDescription());
		idMission.setLieux(AllMission.getLieux());
		idMission.setTache(AllMission.getTache());
		
		 Imission.save(idMission);
		 return new ResponseEntity<>("Modification effectué", HttpStatus.CREATED);
	}
	   
	@PostMapping(value= "/mission")
      public void ajouterMission (@RequestBody Mission mission) {
		
		System.out.println("resultat =>"+mission);
		Imission.save(mission);
	}
	
	
	@DeleteMapping("/mission/{idMission}")
	public   ResponseEntity<?> supprimerMission (@PathVariable(value="idMission") Long id){
		Optional<Mission> allMission = Imission.findById(id);
		   Imission.delete(allMission.get());
		return null;
		   
	}
	
	
    
}
