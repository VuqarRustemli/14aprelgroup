package main;

import java.util.Scanner;

public class Vuqar {

	public static void main(String[] args) {
		   Scanner sc = new Scanner(System.in);

	        System.out.print("Birinci ədədi daxil edin: ");
	        int a = sc.nextInt();

	        System.out.print("İkinci ədədi daxil edin: ");
	        int b = sc.nextInt();

	        int result = a * b;
	        System.out.println("Nəticə: " + result);
	}

}
