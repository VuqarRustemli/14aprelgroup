package main;

import java.util.Scanner;

public class Mission4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Radiusu daxil edin: ");
        double r = sc.nextDouble();

        double C = 2 * Math.PI * r;
        System.out.println("Çevrənin uzunluğu: " + C);

	}

}
