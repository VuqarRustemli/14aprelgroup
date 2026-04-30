package main2;

import java.util.Scanner;

public class Cevirme {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Decimal eded daxil edin: ");
        int number = sc.nextInt();

        String binary = Integer.toBinaryString(number);
        String octal = Integer.toOctalString(number);
        String hexadecimal = Integer.toHexString(number);

        System.out.println(binary);
        System.out.println(octal);
        System.out.println(hexadecimal);
    }
}
