package demo;

public class Factorial {

    public int calculateFactorial(int p) {
        int result = 1;

        for(int i = 1; i <= p; i++) {
            result *= i;
        }

        return result;
    }
}
