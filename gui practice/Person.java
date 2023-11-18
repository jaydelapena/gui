package Practice;

import java.util.Scanner;

public class Person{
	
	String firstName;
	String lastName;
	String middleName;
	String Birthdate;
	String sex;

	public void introduceYourself(){

		Scanner s = new Scanner(System.in);

		System.out.print("Enter your firstName: ");
		String firstName = s.nextLine();

		System.out.print("Enter your middleName: ");
		String middleName = s.nextLine();

		System.out.print("Enter your lastName: ");
		String lastName = s.nextLine();


		System.out.print("Hello, I am " + firstName + " " + middleName + " " + lastName + " " + "a person");
	}
}