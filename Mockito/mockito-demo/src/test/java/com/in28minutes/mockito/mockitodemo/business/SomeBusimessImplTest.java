package com.in28minutes.mockito.mockitodemo.business;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SomeBusimessImplTest {

	@Test
	void findTheGreatestFromAllData_basicScenario() {
		
		DataServiceStub dataServiceStub = new DataServiceStub();
		
		SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataServiceStub);
		int result = businessImpl.findTheGreatestFromAllData();
		assertEquals(25, result);
	}

}

class DataServiceStub implements DataService{

	@Override
	public int[] retrieveAllData() {
		return new int[]{25, 23, 14};
	}
	
}
