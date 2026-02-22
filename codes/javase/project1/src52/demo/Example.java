package demo;

public class Example {

    public static int divide(int a, int b) throws CustomException {
        if (b == 0) {
            throw new CustomException("0-a bölmə qadağandır!");
        }
        return a / b;
    }
}