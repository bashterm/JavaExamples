/*
 * StudentTester.java
 * By Aidan Sciortino
 * 
 * A class demonstrating the use of the Student toy-example data framework defined in Student.java
 */
public class StudentTester { //Define a new class calld StudentTester
	public static void main(String[] args) { //Define the main method. No constructor here. 
		Student stewart = new Student(1); //Define a new student with ID 1
		Student steward = new Student(2); //Define a new student with ID 2
		
		System.out.println("Stewart's ID is: " + stewart.getId()); //Print out the first student's ID using the getId() method
		System.out.println("Stewards ID is: " + steward.getId()); //Do the same for the second student.
	}

}
