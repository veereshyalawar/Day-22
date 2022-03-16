package adressbook;

import java.util.ArrayList;
import java.util.Scanner;

class C {

	void dataAdd() {

		/*
		 *  scanner to take user input
		 */
		
		try (Scanner scanner = new Scanner(System.in)) {
			ArrayList<String> contacts = new ArrayList<String>();

			System.out.print("Enter First Name: ");
			String firstname = scanner.nextLine();
			contacts.add(firstname);

			System.out.print("Enter Last Name: ");
			String lastname = scanner.nextLine();
			contacts.add(lastname);

			System.out.print("Enter Address: ");
			String address = scanner.nextLine();
			contacts.add(address);

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
			String phonenum = scanner.nextLine();
			contacts.add(phonenum);

			System.out.print("Enter Email: ");
			String email = scanner.nextLine();
			contacts.add(email);

			/*
			 *  display or print a array list
			 */
			
			System.out.println("Contact Added");
			System.out.println(contacts);

			System.out.println("Enter the first name of contact you want to edit :");
			String fn1 = scanner.nextLine();
           /*
            * we can edit contact details by entering first name or last name
            */
			if (fn1.equals(firstname)||fn1.equals(lastname)) {
				dataAdd();
			} else {
				System.out.println("NO contact exists by this name !!! Please try again");
			}

		}

	}

}

public class AdressBook3 {

	public static void main(String[] args) {
		System.out.println("PhoneBook");
		/*
		 *  creating object
		 */
		
		C person1 = new C();
		/*
		 *  calling method
		 */
		person1.dataAdd();

	}
}