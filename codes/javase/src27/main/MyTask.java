package main;

public class MyTask {
	public int square(int number) {
		return number * number;
	}
	
	public static int maxNumber(int a, int b) {
	    if (a > b) {
	        return a;
	    } else {
	        return b;
	    }
	}
	
	public boolean isOdd(int number) {
	    return number % 2 != 0;
	}
}
