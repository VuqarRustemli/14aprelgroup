package main;

public class Methods {

    public void printName(int count, String name) {
        for (int i = 0; i < count; i++) {
            System.out.println(name);
        }
    }

    public static void main(String[] args) {

        Methods obj = new Methods();

        obj.printName(3, "Vuqar");
        obj.printName(2, "67");
        obj.printName(5, "Google");
    }
}