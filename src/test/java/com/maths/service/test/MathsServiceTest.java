package com.maths.service.test;
import static org.junit.Assert.*;

import org.junit.Test;

public class MathsServiceTest {


	
	@Test
	public void addTest() {
		assertEquals(15, com.maths.service.MathsService.add(10, 5));
	}
	@Test
	public void subTest() {
		assertEquals(5, com.maths.service.MathsService.substract(10, 5));
	}
	@Test
	public void multiTest() {
		assertEquals(50, com.maths.service.MathsService.multiPly(10, 5));
	}
}
