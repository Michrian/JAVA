package com.gestion.Mission;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class MissionController {
	
	@Autowired
	IMissionRepository imission;
	
	@GetMapping("/mission")
	public List<Mission> getAllMission (){
		return imission.findAll();
	}

	
    
}
