package demo;

public class Calculator {

    public void calculateCircleLength(Circle c) {
        double pi = 3.14;
        double result = 2 * pi * c.radius;
        c.length = result;
    }
}
