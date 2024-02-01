package com.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class AssertTest {

	@Test
	public void test() {
		boolean condn=true;
		assertTrue(condn);
		assertArrayEquals(new int[] {1,2,3},new int[] {1,2,3});
	}

}
