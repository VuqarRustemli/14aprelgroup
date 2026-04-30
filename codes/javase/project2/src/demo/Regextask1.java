package demo;

import java.util.Scanner;

public class Regextask1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("String tipinde eded daxil et: ");
        
        String yazi = sc.nextLine();

        boolean cavab = yazi.matches("\\d+");

        System.out.println(cavab);
    }
}