package main;

public class MyTaskcagir {

	public static void main(String[] args) {
		MyTask m = new MyTask();
		
		int square = m.square(5);
		System.out.println("5in kvadrati:" + square);
		
		int maxNumber = m.maxNumber(15, 20);
		System.out.println("Max number:" + maxNumber);
		
		int isOdd = m.isOdd(9);
		System.out.println("9 tekdirmi?" + isOdd);

	}

}
