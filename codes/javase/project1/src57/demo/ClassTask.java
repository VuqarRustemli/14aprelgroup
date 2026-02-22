package demo;

import java.util.HashSet;
import java.util.Set;

public class ClassTask {
	public static void main(String[] args) {
		Set<String> colors = new HashSet<>();
		
		colors.add("Qara");
		colors.add("Mavi");
		colors.add("Yaşıl");
		
		for(String color : colors) {
			System.out.println(color);
		}
	}
}

