package main;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Riyaziyyat balınızı daxil edin: ");
        int riyaziyyat = sc.nextInt();

        System.out.print("Fizika balınızı daxil edin: ");
        int fizika = sc.nextInt();

        if (riyaziyyat >= 60 && fizika >= 70) {
            System.out.println("Hər iki dərsdən keçdiniz");
        } else if (riyaziyyat < 60 && fizika < 70) {
            System.out.println("Hər iki dərsdən kəsildiniz");
        } else {
            System.out.println("Bir fənndən uğurla keçdiniz, digər fənndən isə kəsildiniz");
        }
    }
}