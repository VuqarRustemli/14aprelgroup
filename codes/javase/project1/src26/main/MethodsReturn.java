package main;

public class MethodsReturn {

    public static void main(String[] args) {

        Calculator calc = new Calculator();

        int result1 = calc.average(10, 20);
        System.out.println("1-ci ortalama: " + result1);

        int result2 = calc.average(50, 70);
        System.out.println("2-ci ortalama: " + result2);
    }
}