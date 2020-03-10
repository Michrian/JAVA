package com.gestion.Personnel;
//import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
/*import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;*/


@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(classes = PersonnelController.class)

public class PersonnelControllerTest {

	
	/*@Test
	public void AffichernaNyListeRehetra() {
	  PersonnelController personne = Mockito.mock(PersonnelController.class);
	  
      Mockito.when(personne.getAllNotes()).thenReturn(personne.getAllNotes() );
	  
	}*/

	//@Autowired
	// private MockMvc mockMvc;
	
	/*@Test
    public void testUserController () throws Exception {
		
        ResultMatcher ok = MockMvcResultMatchers.status()
                                                .isOk();

        MockHttpServletRequestBuilder builder = MockMvcRequestBuilders.get("/api/personnel?size=2");
        this.mockMvc.perform(builder)
                    .andExpect(ok);

    }*/
	
	
	
	
	
}
