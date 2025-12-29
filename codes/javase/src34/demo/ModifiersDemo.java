package demo;

public class ModifiersDemo {

    public static void main(String[] args) {
        Personn p1 = new Personn("Vusal");

        Personn p2 = new Personn("Araz", 25);

        Personn p3 = new Personn("Kamran", 30, 2000.0, "Azerbaijan");

        System.out.println("Ümumi Person obyektlərinin sayı: " + Personn.count);

        p1.publicMethod();
        p2.protectedMethod();
        p3.defaultMethod();

        p1.printFinalValue(50);
    }
}