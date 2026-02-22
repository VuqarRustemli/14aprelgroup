package demo;

import java.util.Arrays;

public class ArraysDemoHome {

    public static void main(String[] args) {
        int[] numbers = {12, 7, 20, 5};

        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("Massivin cəmi (for): " + sum);

        System.out.print("Massivin elementləri (foreach): ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println("\n");

        double average = (double) sum / numbers.length;
        System.out.println("Ədədi orta: " + average);

        int min = numbers[0];
        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("Ən kiçik element: " + min);
        System.out.println("Ən böyük element: " + max);

        System.out.print("Tək ədədlər: ");
        for (int num : numbers) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }

        System.out.print("\nCüt ədədlər: ");
        for (int num : numbers) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println("\n");

        System.out.print("Sadə ədədlər: ");
        for (int num : numbers) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
        System.out.println("\n");

        int[] descending = Arrays.copyOf(numbers, numbers.length);

        for (int i = 0; i < descending.length - 1; i++) {
            for (int j = 0; j < descending.length - 1 - i; j++) {
                if (descending[j] < descending[j + 1]) {
                    int temp = descending[j];
                    descending[j] = descending[j + 1];
                    descending[j + 1] = temp;
                }
            }
        }

        System.out.println("Azalan sıra ilə: " + Arrays.toString(descending));
    }


    private static boolean isPrime(int number) {
        if (number <= 1) return false;
        if (number == 2) return true;

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
  }

	

}
