package main4;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {

	public static void main(String[] args) {
		Student s1 = new Student("Ali", 70);
		Student s2 = new Student("Veli", 40);
		Student s3 = new Student("Aysel", 85);
		Student s4 = new Student("Murad", 30);

		List<Student> students = Arrays.asList(s1, s2, s3, s4);

		Function<Student, String> getNameFunction = new Function<Student, String>() {
			@Override
			public String apply(Student s) {
				return s.getName();
			}
		};

		Predicate<Student> passPredicate = new Predicate<Student>() {
			@Override
			public boolean test(Student s) {
				return s.getScore() >= 50;
			}
		};

		Consumer<String> printConsumer = new Consumer<String>() {
			@Override
			public void accept(String name) {
				System.out.println(name);
			}
		};

		students.stream()
			.filter(passPredicate)
			.map(getNameFunction)
			.forEach(printConsumer);
	}
}
