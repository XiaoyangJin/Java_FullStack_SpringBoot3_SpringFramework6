package com.in28minutes.mockito.mockitodemo.business;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SomeBusimessImplTest {

	@Test
	void findTheGreatestFromAllData_basicScenario() {
		
		DataService dataServiceStub = new DataServiceStub1();
		
		SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataServiceStub);
		int result = businessImpl.findTheGreatestFromAllData();
		assertEquals(25, result);
	}

}

class DataServiceStub1 implements DataService{

	@Override
	public int[] retrieveAllData() {
		return new int[]{25, 23, 14};
	}
	
}

class DataServiceStub2 implements DataService{

	@Override
	public int[] retrieveAllData() {
		return new int[]{14};
	}
	
}
