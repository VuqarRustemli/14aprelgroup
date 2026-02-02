package main;

public class CheckRange {

    public void checkValueRange(int value) throws OutOfRangeValueException {
        int min = 10;
        int max = 50;

        if (value < min || value > max) {
            throw new OutOfRangeValueException(
                    "Xeta: Deyer icaze verilen aralıqda deyil! (" + min + " - " + max + ")"
            );
        } else {
            System.out.println("Deyer mueyyen aralıqdadır");
        }
    }
}