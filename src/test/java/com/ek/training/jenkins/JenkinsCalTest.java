package com.ek.training.jenkins;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JenkinsCalTest {
	
	@Test
	public void addTest() {
		JenkinsCalculator myClac = new JenkinsCalculator();
		assertEquals(10,myClac.addNumbers(5, 5));
		
	}
	
	@Test
	public void subTractTest() {
		JenkinsCalculator myClac = new JenkinsCalculator();
		assertEquals(5,myClac.subtractNumbers(10, 5));
		
	}
	
}
