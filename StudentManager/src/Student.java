/*
 * Student.java
 * By Aidan Sciortino
 * 
 * A toy-example data framework for managing student IDs and grades.
 */
public class Student { //Define a new class called Student
	private int id; /*Initialize a new integer called id. This is private, meaning that classes outside of this one cannot
	access or modify it without using methods in this class*/
	public Student(int id) { /*Define a Constructor method for the class. Every time the class is run this method initializes
	Various Class Variables*/
		this.id = id; //this.id is the class variable id, as opposed to the id defined as an argument above
	}
	public int getId() { /*Define a method called getId() that returns an int. This method is public, meaning it can be 
	run by classes outside of this one.*/
		return this.id; //Return the class variable id.
	}
}
