package main;

public class Taskk1 {

    public static void main(String[] args) {

        String word = "salam";
        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }

        System.out.println(reversed);
    }

}
