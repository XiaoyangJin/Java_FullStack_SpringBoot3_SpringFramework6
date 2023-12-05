package com.in28minutes.mockito.mockitodemo.list;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.Test;

public class ListTest {
	
	@Test
	void simpleTest() {
		
		List listMock = mock(List.class);
		
//		listMock.size() => 3
		when(listMock.size()).thenReturn(3);
		
		assertEquals(3, listMock.size());
		
	}
	
	@Test
	void multipleReturnsTest() {
		
		List listMock = mock(List.class);
		
		when(listMock.size()).thenReturn(1).thenReturn(2);
		
		assertEquals(1, listMock.size());
		assertEquals(2, listMock.size());
		assertEquals(2, listMock.size());
		assertEquals(2, listMock.size());
		assertEquals(2, listMock.size());
		
	}

}
