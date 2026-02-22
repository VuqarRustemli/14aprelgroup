package main;

import java.util.Scanner;

public class Taskk2 {
	
	public enum Days {
	    BAZAR_ERTESI,
	    CERSENBE_AXSAMI,
	    CERSENBE,
	    CUME_AXSAMI,
	    CUME,
	    SENBE,
	    BAZAR
	}
	
	public static void main(String[] args) {		
        Scanner sc = new Scanner(System.in);

        System.out.println("Günü daxil edin: ");
        String input = sc.next().toUpperCase();

        Days day = Days.valueOf(input);

        if (day == Days.CUME || day == Days.SENBE) {
            System.out.println("Bu gün istirahət günüdür");
        } else {
            System.out.println("Bu gün dərs günüdür");
        }
	}

}
