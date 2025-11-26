package pass_by_reference;

public class MainClass {

	public static void main(String[] args) {
		Person person = new Person();
		person.name = "Vuqar";
		person.surname = "Rustemli";
		person.experienceYear = 2013;
		person.salary = 600;
		person.phone = "0502618222";
		
		person.printInfo();
		
		
	}

}
