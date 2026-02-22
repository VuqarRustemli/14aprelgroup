package demo;

import java.util.ArrayList;

public class Lessontask {
	public static void main(String[] args) {
		ArrayList<String> students = new ArrayList<>();
		students.add("Vuqar");
		students.add("Aslan");
		students.add("Əliimran");
		students.add("Ömər");
		students.add("Mustafa");
		students.add("Sexavet");
		students.add("Turqay");
		students.add("Yusif");
		students.add("Sema");
		
		ArrayList<Integer> grades = new ArrayList<>();
		grades.add(90);
		grades.add(70);
		grades.add(75);
		grades.add(85);
		grades.add(95);
		grades.add(100);
		grades.add(65);
		grades.add(75);
		grades.add(80);
		
		for(int i = 0; i < students.size(); i++ ) {
			System.out.println(students.get(i) + "-" + grades.get(i));
		}
	}

}
