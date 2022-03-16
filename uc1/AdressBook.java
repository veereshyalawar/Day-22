package adressbook;

class A {

	/*
	 *  Method creation
	 */
	void firstname(String firstname) //constructor
	{

		System.out.println("first name:" + firstname);
	}

	/*
	 *  Method creation
	 */
	void lastname(String lastname) // constructor
	{

		System.out.println("Last Name :" + lastname);
	}

	void city(String address) {
		System.out.println("address city :" + address);
	}

	void zip(Long zip) {
		System.out.println("zip code :" + zip);
	}

	void number(Long num) {
		System.out.println("number :" + num);
	}

	void email(String mail) {
		System.out.println("Email :" + mail);
	}

}

public class AdressBook {

	public static void main(String[] args) {
		A obj = new A();

		/*
		 *  Method calling by object
		 */
		obj.firstname("veeresh");
		obj.lastname("yalawar");
		obj.city("bagalkot");
		obj.zip(587101l);
		obj.number(8867743684l);
		obj.email("veereshyalawar2@gmail.com");
	}

}