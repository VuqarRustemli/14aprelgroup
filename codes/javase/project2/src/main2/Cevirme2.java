package main2;

import java.util.Scanner;

public class Cevirme2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Binary eded daxil edin: ");
        String binary = sc.nextLine();

        int decimal = Integer.parseInt(binary, 2);

        System.out.println(decimal);
    }
}