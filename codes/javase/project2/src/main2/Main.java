package main2;

public class Main {
	public static void main(String[] args) {

		SchoolBell bell1 = SchoolBell.getInstance();

		bell1.ring();

		SchoolBell bell2 = SchoolBell.getInstance();

		System.out.println(bell1 == bell2);
	}
}
