package main;

public class MethodsHome {
    public void printNumbers(int begin, int end) {
        for (int i = begin; i <= end; i++) {
            System.out.println(i);
        }
        System.out.println("------------------");
    }

    public static void main(String[] args) {
        MethodsHome obj = new MethodsHome();
        
        obj.printNumbers(1, 5);
        obj.printNumbers(10, 15);
        obj.printNumbers(20, 25);
    }
}