package com.dk.training.jenkins_One;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JenkinsCaltest {
	
	@Test
	public void addTest()
	{
		JenkinsCalculator mycalc = new JenkinsCalculator ();
		assertEquals(10,mycalc.addNumbers(5, 5));
	}
	
	@Test
	public void subtractTest()
	{
		JenkinsCalculator mycalc = new JenkinsCalculator ();
		assertEquals(5,mycalc.subtractNumbers(10, 5));
	}
}
