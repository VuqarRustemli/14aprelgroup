package settask;

import java.util.HashSet;
import java.util.Set;

public class Hometask {

	   public static void main(String[] args) {

	        int[] array = {1, 2, 3, 2, 4, 1, 5};

	        Set<Integer> uniqueNumbers = new HashSet<>();

	        for (int num : array) {
	            uniqueNumbers.add(num);
	        }

	        int sum = 0;
	        
	        for (int num : uniqueNumbers) {
	            sum += num;
	        }

	        System.out.println("Təkrarsız ədədlər: " + uniqueNumbers);
	        System.out.println("Cəm: " + sum);
	    }

}