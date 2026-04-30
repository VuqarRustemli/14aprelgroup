package demo;

import java.util.Scanner;

public class Regextask2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Tarix daxil et: ");
        
        String tarix = sc.nextLine();

        boolean cavab = tarix.matches("(0[1-9]|[12][0-9]|3[01])-(0[1-9]|1[0-2])-\\d{4}");

        System.out.println(cavab);
    }
}