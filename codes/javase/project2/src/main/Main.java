package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Söz daxil edin: ");
        String word = sc.nextLine();

        String reversed = new StringBuilder(word).reverse().toString();

        if (word.equalsIgnoreCase(reversed)) {
            System.out.println("Palindrom sözdür");
        } else {
            System.out.println("Palindrom deyil");
        }
    }
}