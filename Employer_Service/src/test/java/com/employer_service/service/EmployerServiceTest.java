package com.employer_service.service;

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

import com.employer_service.entity.Employer;
import com.employer_service.repository.EmployerRepository;

@ExtendWith(MockitoExtension.class)
public class EmployerServiceTest {
	
	
	@Mock
	EmployerRepository erepository;
	
	@InjectMocks
	EmployerService eservice;

	Employer e=new Employer(14,"Sundhar Pichai","Google","IT,Finance,Marketing","Sundhar.Pichai@google.com",
			"sundhar@#321","9954324566",LocalDate.of(2021, 9, 26));
	
	@Test
	void givenEmployerDetailstoRegisterThenShouldReturnSavedEmployerDetails()
	{
		when(erepository.save(any())).thenReturn(e);
		
		assertEquals(e, eservice.register(e));
		
		verify(erepository, times(1)).save(any());
	}
}
