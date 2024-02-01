package com.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyMathTest {

	MyMath math =new MyMath();
	@Test
	public void test() {
		//fail("Not yet implemented");
	}
	@Test
	public void Sum_with_3numbers() {
		assertEquals(6, math.sum(new int[]{1,2,3}));
	}
	@Test
	public void Sum_with_1numbers() {
		assertEquals(3, math.sum(new int[]{3}));
	}	
}


