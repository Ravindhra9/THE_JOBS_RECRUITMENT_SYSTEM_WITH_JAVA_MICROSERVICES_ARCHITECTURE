package com.employer_service.controller;

import static org.mockito.ArgumentMatchers.any;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import java.time.LocalDate;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import com.employer_service.entity.Employer;
import com.employer_service.service.EmployerService;




@WebMvcTest(EmployerController.class)
public class EmployerControllerTest {

	
	@MockBean
    private EmployerService eService;
    
    @InjectMocks
    EmployerController eController;
    
    Employer e=new Employer(14,"Sundhar Pichai","Google","IT,Finance,Marketing","Sundhar.Pichai@google.com",
			"sundhar@#321","9954324566",LocalDate.of(2021, 9, 26));
    
    @Autowired
    private MockMvc mockMvc;
    
    @Test
    public void givenEmployerDetailstoRegisterThenShouldReturnSavedEmployerDetails() throws Exception {
    	
    	Mockito.when(eService.register(any())).thenReturn(e);
        
        mockMvc.perform(post("/employer")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\n"+
                		"\"employerId\":14,"+
                	   "\n\"employerName\" : \"Sundhar Pichai\","+
                	   "\n\"companyName\" : \"Google\","+
                	   "\n\"industries\" : \"IT,Finance,Marketing\","+
                	   "\"email\": \"Sundhar.Pichai@google.com\","+
                	   "\"createPassword\" : \"sundhar@#321\","+
                	   "\"mobileNumber\" : \"9954324566\","+
                	   "\"loginPeriod\": \"2021-09-26\""+
                	"}")).andExpect(status().isOk());
                
    }  
    }
 
