package settask;

import java.util.HashSet;
import java.util.Set;

public class Hometask2 {

    public static void main(String[] args) {

        String text = "hello world";

        Set<Character> letters = new HashSet<>();

        for (char c : text.toCharArray()) {

            if (Character.isLetter(c)) {
                letters.add(c);
            }
        }

        System.out.println("Fərqli hərflər: " + letters);
        System.out.println("Say: " + letters.size());
    }

}
