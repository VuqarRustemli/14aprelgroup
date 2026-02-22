package demo;

import java.util.Random;

public class DemoTask {

    public static void main(String[] args) {

        char[] symbols = {'J', 'a', 'v', 'a', '!'};
        String resultString = new String(symbols);
        System.out.println("1) String: " + resultString);


        String str1 = "AbC";
        boolean isValid = str1.matches("[A-Za-z]{3}");
        System.out.println("2) Yalnız 3 ingilis simvolu: " + isValid);


        String str2 = "";
        boolean isEmpty = str2.isEmpty();
        System.out.println("3) String boşdur: " + isEmpty);

        
        boolean endsResult = endsWithCheck("programming", "ing");
        System.out.println("4) Bitir mi?: " + endsResult);


        Random random = new Random();
        int randomNumber = random.nextInt(21) + 10;
        System.out.println("5) Random ədəd: " + randomNumber);


        double num = 12.34567;
        double rounded = Math.round(num * 100.0) / 100.0;
        System.out.println("6) Yuvarlaqlaşdırılmış: " + rounded);
    }


    public static boolean endsWithCheck(String s1, String s2) {
        return s1.endsWith(s2);
    }
}
