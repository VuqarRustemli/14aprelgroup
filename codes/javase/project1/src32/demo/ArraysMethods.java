package demo;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysMethods {

	 public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        int[] arr = new int[10];
	        System.out.println("10 ədəd daxil edin:");

	        for (int i = 0; i < arr.length; i++) {
	            arr[i] = sc.nextInt();
	        }
	        
	        System.out.println("\nDaxil edilən massiv:");
	        System.out.println(Arrays.toString(arr));

	        Arrays.sort(arr);
	        System.out.println("\nSort olunmuş massiv:");
	        System.out.println(Arrays.toString(arr));

	        int[] yeni = Arrays.copyOf(arr, 5);
	        System.out.println("\nYeni massiv (ilk 5 element):");
	        System.out.println(Arrays.toString(yeni));

	        Arrays.fill(yeni, 7);
	        System.out.println("\nYeni massiv dolduruldu (7 ilə):");
	        System.out.println(Arrays.toString(yeni));

	        boolean beraberdir = Arrays.equals(arr, yeni);
	        System.out.println("\nMassivlər bərabərdir? " + beraberdir);

	        System.out.print("\nAxtarmaq istədiyiniz elementi daxil edin: ");
	        int axtar = sc.nextInt();

	        int index = Arrays.binarySearch(arr, axtar);

	        if (index >= 0) {
	            System.out.println("Bu element massivdə var.");
	        } else {
	            System.out.println("Bu element massivdə yoxdur.");
	        }

	    }

}
