package com.in28minutes.mockito.mockitodemo.business;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class SomeBusimessImplMockTest {
	
	@Mock
	private DataService dataServiceMock;
	
	@InjectMocks
	private SomeBusinessImpl businessImpl;

	@Test
	void findTheGreatestFromAllData_basicScenario() {
		
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {24, 25, 14});
		
		assertEquals(25, businessImpl.findTheGreatestFromAllData());
	}
	
	@Test
	void findTheGreatestFromAllData_oneScenario() {
		
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {1});
		
		assertEquals(1, businessImpl.findTheGreatestFromAllData());
	}

}
