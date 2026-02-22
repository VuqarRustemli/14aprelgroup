package main;

import java.util.Scanner;

public class Mission5 {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);

        System.out.print("Ədədi daxil edin: ");
        int n = sc.nextInt();

        int sum = 0;

        while (n > 0) {
            sum += n % 10;  
            n /= 10;        
        }

        System.out.println("Rəqəmlərin cəmi: " + sum);

	}

}
