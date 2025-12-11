package demo;

public class Person {
    public String name;
    private int age;
    protected double salary;
    String country;

    public static int count = 0;

    public void printFinalValue(final int value) {
        System.out.println("Final parametrin dəyəri: " + value);
    }

    public void publicMethod() {
        System.out.println("Bu public metoddur");
    }

    private void privateMethod() {
        System.out.println("Bu private metoddur");
    }

    protected void protectedMethod() {
        System.out.println("Bu protected metoddur");
    }

    void defaultMethod() {
        System.out.println("Bu default metoddur");
    }

    public Person(String name) {
        this.name = name;
        count++;
    }

    private Person(int age) {
        this.age = age;
        count++;
    }

    protected Person(String name, int age) {
        this.name = name;
        this.age = age;
        count++;
    }

    Person(String name, int age, double salary, String country) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.country = country;
        count++;
    }
}