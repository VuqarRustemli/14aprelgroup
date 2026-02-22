package main;

import java.util.Stack;

public class StackClass {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		
		stack.push("A");
		stack.push("B");
		stack.push("C");
		stack.push("D");
		
		String lastElement = stack.peek();
		
		System.out.println("EN son elave edilen element: " + lastElement);

	}

}
