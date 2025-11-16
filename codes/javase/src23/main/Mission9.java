package main;

import java.util.Scanner;

public class Mission9 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Ədədi daxil edin: ");
	        int n = sc.nextInt();

	        if (n % 2 == 0) {
	            System.out.println("Bu ədəd cütdür.");
	        } else {
	            System.out.println("Bu ədəd təkdir.");
	        }

	}

}
