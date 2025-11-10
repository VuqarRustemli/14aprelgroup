package main;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Birinci ədədi daxil edin: ");
        int a = sc.nextInt();

        System.out.print("İkinci ədədi daxil edin: ");
        int b = sc.nextInt();

        if (a > b) {
            System.out.println("Birinci ədəd böyükdür");
        } else if (a == b) {
            System.out.println("İki ədəd bərabərdir");
        } else {
            System.out.println("İkinci ədəd böyükdür");
        }
    }
}
