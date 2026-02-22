package pass_by_reference;

public class Person {
	String name;
	String surname;
	int experienceYear;
	double salary;
	String phone;
	
	void printInfo() {
		System.out.println("Ad;" + name);
		System.out.println("Soyad;" + surname);
		System.out.println("il;" + experienceYear);
		System.out.println("Ad;" + salary);
		System.out.println("Telefon;" + phone);
	}
}
