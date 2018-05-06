package org.abruenin;

/**
 * Hello world!
 * abruenin
 */

public class App 
{
	
	public static String createGreeting(String[] args) {
		
		return args.length>0 ? args[0] : "World";
	}
		
    public static void main( String[] args )
    {
		System.out.println( "Hello " + createGreeting(args) );
    }
}
