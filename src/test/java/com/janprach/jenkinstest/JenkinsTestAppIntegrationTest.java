package com.janprach.jenkinstest;

import static org.junit.Assert.assertEquals;
import org.junit.experimental.categories.Category;
import org.junit.Test;

@Category(IntegrationTest.class)
public class JenkinsTestAppIntegrationTest {
	@Test
	public void greetFoo() {
		assertEquals("Hello foo!", JenkinsTestApp.greet("foo"));
	}

	@Test
	public void greetBar() {
		assertEquals("Hello bar!", JenkinsTestApp.greet("bar"));
	}
}
