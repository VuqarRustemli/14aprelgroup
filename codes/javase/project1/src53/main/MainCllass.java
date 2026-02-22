package main;

public class MainCllass {

    public static void main(String[] args) {

        CheckRange checkRange = new CheckRange();

        try {
            checkRange.checkValueRange(60);
        } catch (OutOfRangeValueException e) {
            System.out.println(e.getMessage());
        }
    }
}