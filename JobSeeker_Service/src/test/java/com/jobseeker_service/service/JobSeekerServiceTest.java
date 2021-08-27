package com.jobseeker_service.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import java.time.LocalDate;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import com.jobseeker_service.entity.JobSeeker;
import com.jobseeker_service.repository.JobSeekerRepository;


@ExtendWith(MockitoExtension.class)
public class JobSeekerServiceTest {
	
	@Mock
	JobSeekerRepository jrepository;
	
	@InjectMocks
	JobSeekerService jservice;
	
	JobSeeker j=new JobSeeker(10,"Sandeep Kumar", "sandeepkumar@gmail.com", "9954556632",
			"sandeep@#123","Hyderabad", "Male", LocalDate.of(1998, 3, 21));
	
	@Test
	void givenEmployerDetailstoRegisterThenShouldReturnSavedEmployerDetails()
	{
		when(jrepository.save(any())).thenReturn(j);
		
		assertEquals(j, jservice.register(j));
		
		verify(jrepository, times(1)).save(any());
	}

}
