package demo;

public class Mainmethod {
    public static void main(String[] args) throws CloneNotSupportedException {

        Carr car1 = new Carr("Camry", "Toyota");
        System.out.println(car1.hashCode());

        Carr car2 = (Carr) car1.clone();
        System.out.println(car2.hashCode());
    }
}
