package main3;

import java.util.Arrays;
import java.util.List;

public class ClassTask {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(12, 13, 14, 15, 16);
		
		List<Integer> list2 = list.stream()
				.filter(x -> x%2 == 0)
				.map(b -> b*2)
				.toList();
				
		System.out.println(list2);
 
	}

}
