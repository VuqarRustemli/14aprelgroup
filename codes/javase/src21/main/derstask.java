package main;

import java.util.Scanner;

public class derstask {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
				 
		System.out.println("2 reqemli bir eded daxil edin: ");
        int eded = scanner.nextInt();
        
        while(eded < 100) {
        	System.out.println(eded);
        	eded+=7;
        }
	}
}
