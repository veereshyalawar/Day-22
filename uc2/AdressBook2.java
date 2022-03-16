package adressbook;


import java.util.ArrayList;
import java.util.Scanner;

class B {

	void dataAdd() {
         /*
		  *scanner to take user input of all required details
          *
          */		
		try (Scanner scanner = new Scanner(System.in)) {
			ArrayList<String> contacts = new ArrayList<String>();

			System.out.print("Enter First Name: ");
			String firstn = scanner.nextLine();
			contacts.add(firstn);

			System.out.print("Enter Last Name: ");
			String lastn = scanner.nextLine();
			contacts.add(lastn);

			System.out.print("Enter Address: ");
			String add = scanner.nextLine();
			contacts.add(add);

			System.out.print("Enter City: ");
			String city = scanner.nextLine();
			contacts.add(city);

			System.out.print("Enter State: ");
			String state = scanner.nextLine();
			contacts.add(state);

			System.out.print("Enter Zip Code: ");
			String zip = scanner.nextLine();
			contacts.add(zip);

			System.out.print("Enter Phone No: ");
			String phoneno = scanner.nextLine();
			contacts.add(phoneno);

			System.out.print("Enter Email: ");
			String email = scanner.nextLine();
			contacts.add(email);

			/*
			 *  display or print a array list 
			 */
			System.out.println("Contact Added");
			System.out.println(contacts);
		}
	}
}

public class AdressBook2 {

	public static void main(String[] args) {
		System.out.println("PhoneBook");
		/*
		 *  creating object
		 */
		B person1 = new B();
		/*
		 *  calling method
		 */
		person1.dataAdd();
	}
}