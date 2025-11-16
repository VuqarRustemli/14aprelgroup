package main;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Yaşınızı daxil edin: ");
        if (scanner.hasNextInt()) {
            int age = scanner.nextInt();

            if (age < 18) {
                System.out.println("Access denied");
            } else {
                System.out.println("Access granted");
            }
        } else {
            System.out.println("Zəhmət olmasa tam ədəd daxil edin.");
        }

        scanner.close();

	}

}
