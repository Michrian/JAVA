package com.gestion.Personnel;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//import org.springframework.test.web.servlet.result.MockMvcResultMatchers;


@WebMvcTest(PersonnelController.class)
public class PersonnelControllerTest {
	 @Autowired
	  private MockMvc mockMvc;
	 
	 @MockBean
	 IPersonnelRepository Ipersonnel;
	 
	@Test
	public void getTousLesPersonnels() throws Exception {
	        
	  // AMPIASA MOCKITO TSIK 
		// @WHEN
		/*when(Ipersonnel.findAll()).thenReturn(
				Collections.emptyList());
		
 	    MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.get("/personnel")
 	    .accept(org.springframework.http.MediaType.APPLICATION_JSON)).andReturn();
 
 	  System.out.println(mvcResult.getResponse());
 	  
 	  
 	   //VERIFY
 	  verify(Ipersonnel).findAll();*/
		mockMvc.perform( MockMvcRequestBuilders
			      .get("/personnel")
			      .accept(org.springframework.http.MediaType.APPLICATION_JSON))
			      .andDo(print());
	        	
	}
		
	
}
