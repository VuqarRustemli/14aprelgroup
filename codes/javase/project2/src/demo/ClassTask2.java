package demo;

import java.util.Scanner;

public class ClassTask2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Binary ededi daxil edin: ");
        String binary = sc.nextLine();

        int decimalFromBinary = Integer.parseInt(binary, 2);
        System.out.println("Decimal: " + decimalFromBinary);


        System.out.print("Hexadecimal ededi daxil edin: ");
        String hex = sc.nextLine();

        int decimalFromHex = Integer.parseInt(hex, 16);
        System.out.println("Decimal: " + decimalFromHex);
    }
}