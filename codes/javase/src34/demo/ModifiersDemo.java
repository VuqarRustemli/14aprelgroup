package demo;

public class ModifiersDemo {

    public static void main(String[] args) {
        Person p1 = new Person("Vusal");

        Person p2 = new Person("Araz", 25);

        Person p3 = new Person("Kamran", 30, 2000.0, "Azerbaijan");

        System.out.println("Ümumi Person obyektlərinin sayı: " + Person.count);

        p1.publicMethod();
        p2.protectedMethod();
        p3.defaultMethod();

        p1.printFinalValue(50);
    }
}