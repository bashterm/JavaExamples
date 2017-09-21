import java.util.Scanner; //Import the Scanner class from the java.util package
public class QuestionPrompter {
	public static void main(String[] args) { //Main Method
		Scanner in = new Scanner(System.in); //Initialize a new scanner using the Standard Input
		
		System.out.print("Hello, what is your name? ");
		String name = in.nextLine();
		
		System.out.println("\nHello " + name + ", I'm pleased to meet you.");
	}
}
