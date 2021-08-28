package com.jobseeker_service.controller;

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

import com.jobseeker_service.entity.JobSeeker;
import com.jobseeker_service.service.JobSeekerService;



@WebMvcTest(JobSeekerController.class)
public class JobSeekerControllerTest {
	
	@MockBean
    private JobSeekerService eService;
	
	@InjectMocks
    JobSeekerController eController;
	
	JobSeeker j=new JobSeeker(10,"Sandeep Kumar", "sandeepkumar@gmail.com", "9954556632",
			"sandeep@#123","Hyderabad", "Male", LocalDate.of(1998, 3, 21));
	
	 @Autowired
	 private MockMvc mockMvc;
	 
	 @Test
	    public void givenJobSeekerDetailstoRegisterThenShouldReturnSavedJobSeekerDetails() throws Exception {
	    	
	    	Mockito.when(eService.register(any())).thenReturn(j);
	        
	        mockMvc.perform(post("/jobseeker")
	                .contentType(MediaType.APPLICATION_JSON)
	                .content("{\n"+
	                		"\"jobSeekerId\":10,"+
	                	   "\n\"jobSeekerName\" : \"Sandeep Kumar\","+
	                	   "\n\"jobSeekerEmail\" : \"sandeepkumar@gmail.com\","+
	                	   "\n\"mobileNumber\" : \"9954556632\","+
	                	   "\"password\": \"sandeep@#123\","+
	                	   "\"currentCity\" : \"Hyderabad\","+
	                	   "\"gender\" : \"Male\","+
	                	   "\"dateOfBirth\": \"1998-03-21\""+
	                	"}")).andExpect(status().isOk());
	                
	    }  

}
