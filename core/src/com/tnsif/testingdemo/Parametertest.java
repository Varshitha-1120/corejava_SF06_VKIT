package com.tnsif.testingdemo;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class Parametertest {

	@ParameterizedTest
	@ValueSource (strings={"ad","teacher","student"})
	void testvalidroles(String role) {
		System.out.println(" checking the role "+ role);
		
		assertNotNull(role);
		assertTrue(role.length()>3);
	}
}