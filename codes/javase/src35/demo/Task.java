package demo;

public class Task {

	public static void main(String[] args) {
	       String name = "Məhərrəm";
	        System.out.println(name);

	        String message = "Java dilini öyrənmək maraqlı və faydalıdır";
	        System.out.println(message);

	        System.out.println("Simvol sayı: " + message.length());

	        System.out.println("7-ci simvol: " + message.charAt(6));

	        System.out.println("'n' simvolunun indeksi: " + message.indexOf('n'));

	        System.out.println("Kiçik hərflər: " + message.toLowerCase());

	        System.out.println("Böyük hərflər: " + message.toUpperCase());

	        System.out.println("'x' varmı?: " + message.contains("x"));

	        System.out.println("`faydalıdır` ilə bitir?: " + message.endsWith("faydalıdır"));

	        System.out.println("`Java` ilə başlayır?: " + message.startsWith("Java"));

	        name = " Ayxan ";
	        System.out.println(name);

	        System.out.println("Trim edilmiş: " + name.trim());

	        name = "Kamil";
	        System.out.println(name);

	    }

	}

