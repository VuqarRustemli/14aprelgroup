package main3;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {

		ArrayList<Student> students = new ArrayList<>();

		students.add(new Student("Ali", 45));
		students.add(new Student("Veli", 78));
		students.add(new Student("Aysel", 90));
		students.add(new Student("Orxan", 30));
		students.add(new Student("Nigar", 65));
		
		List<String> list =  students.stream()
		.filter(s -> s.getScore() > 50)
		.map(a -> a.getName().toUpperCase())
		.toList();
		
		
		Integer max = students.stream()
		.map(s -> s.getScore())
		.reduce(0, (a,b) -> a > b ? a : b);

		System.out.println(max);
	}
}