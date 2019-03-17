package chapter20;

import java.util.ArrayList;
//import java.util.Iterator;

public class ArrayListSample {

	public static void main(String[] args) {
		
		// Create an array list of strings
		ArrayList<String> javaList = new ArrayList<String>();
		
		javaList.add("Boston, MA");
		javaList.add("McLean, VA");
		javaList.add("Los Angeles, CA");
		javaList.add("Chicago, IL");
		javaList.add("Cleveland, OH");
		javaList.add("Orlando, FL");
		
		// Iterate through the array list
		for(String javaIterate: javaList) {
			System.out.println("City is: " + javaIterate);
		}
		
		System.out.println("\n");
		
		System.out.println("My message to you is: " + getMessageString());
		
		
	}
	
	public static String getMessageString() {
		
		String javaString = "Hello World!";
		
		return javaString;
		
	}
  
}
