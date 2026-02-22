package demo;

public class Factorial2 {
    public static void main(String[] args) {

        Factorial f = new Factorial();

        int result1 = f.calculateFactorial(5);
        System.out.println("2! = " + result1);

        int result2 = f.calculateFactorial(7);
        System.out.println("4! = " + result2);
    }
}
