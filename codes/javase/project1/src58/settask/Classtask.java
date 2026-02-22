package settask;

import java.util.HashMap;
import java.util.Map;

public class Classtask {

	public static void main(String[] args) {
		  Map<String, Integer> developers = new HashMap<>();
		  
		  developers.put("Vuqar", 13);
		  developers.put("Omer", 14);
		  developers.put("Aslan", 14);
		  developers.put("Mustafa", 14);
		  developers.put("Sexavet", 14);
		  developers.put("Eliimran", 13);
		  developers.put("Turqay", 15);
		  developers.put("Sema", 13);
		  developers.put("Yusif", 14);
		  
		  System.out.println("Bütün uşaqlar:");

		  
		     System.out.println("Yaşı 12-dən böyük olanlar:");
		        for (Map.Entry<String, Integer> entry : developers.entrySet()) {
		            if (entry.getValue() > 12) {
		                System.out.println("Ad: " + entry.getKey() + ", Yaş: " + entry.getValue());
		            }
		        }
	}

}
