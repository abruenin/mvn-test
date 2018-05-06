package org.abruenin;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

/**
 * Unit test for simple App.
 */
@DisplayName("Trying some weird testing")
 public class AppTest 
{
	private App myApp;
	String[] myArgs;
	
	@BeforeEach
	void initApp() {
		myApp = new App();
	}
	
	@AfterEach
	void tearDown() {
		myApp = null;
		myArgs = null;
	}
	
	@Test
	@DisplayName("Test Greeting with default empty String array")
	void testGreetingDefault() {
		myArgs = new String[0];
		System.out.println( "-->" + App.createGreeting(myArgs) + "<---" );
		assertEquals( "World", myApp.createGreeting(myArgs) );
	}
	
	@Test
	void testGreetingArne() {
		myArgs = new String[1];
		myArgs[0] = "Arne";
		System.out.println( "-->" + App.createGreeting(myArgs) + "<---" );
		assertEquals( "Arne", myApp.createGreeting(myArgs) );
	}
	
}
