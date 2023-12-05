package com.in28minutes.mockito.mockitodemo.business;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

class SomeBusimessImplMockTest {

	@Test
	void findTheGreatestFromAllData_basicScenario() {
		
		DataService dataServiceMock = mock(DataService.class);
//		dataServiceMock.retrieveAllData() => new int[] {24, 25, 14};
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {24, 25, 14});
		
		SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataServiceMock);
		int result = businessImpl.findTheGreatestFromAllData();
		assertEquals(25, result);
	}

}
