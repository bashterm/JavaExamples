/*
 * HelloWorld.java
 * Written By Aidan Sciortino
 * 
 * A Simple program that introduces basic java syntax and shows how to print text to the standard output
 */

public class HelloWorld { // Define a new class called HelloWorld
	public static void main(String[] args) {// Define the main method. Java knows to automatically run this when 
											//the program starts. Not every Java class has a main method. 
											//Some classes are designed to be run from other classes, in which case they
											//use constructor methods instead.
		System.out.println("Hello World!"); // Print text to the screen using the method println() from the 
											//out PrintStream of the System class
	}
}
