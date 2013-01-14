package com.shankh.rest;

import static org.junit.Assert.*;

import org.junit.Test;

public class RestEndPointsUTest {
	
	private RestEndPoints iut = new RestEndPoints();

	@Test
	public void getVersionShouldReturnCorrectVersionNumber(){
		String actualVersion = iut.getVersion();
		String expectedVersion = "1.1";
		assertEquals(expectedVersion , actualVersion);
	}
}
