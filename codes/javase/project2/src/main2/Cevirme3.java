package main2;

import java.util.Scanner;

public class Cevirme3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Birinci ededi daxil edin: ");
        int a = sc.nextInt();

        System.out.print("Ikinci ededi daxil edin: ");
        int b = sc.nextInt();

        System.out.println(a & b);
        System.out.println(a | b);
        System.out.println(a ^ b);
    }
}