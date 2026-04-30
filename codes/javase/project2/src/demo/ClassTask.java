package demo;

import java.util.Scanner;

public class ClassTask {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Decimal ededi daxil edin: ");
        int number = sc.nextInt();

        String binary = Integer.toBinaryString(number);
        String octal = Integer.toOctalString(number);
        String hex = Integer.toHexString(number);

        System.out.println("Binary: " + binary);
        System.out.println("Octal: " + octal);
        System.out.println("Hexadecimal: " + hex);
    }
}