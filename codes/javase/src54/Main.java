public class Main {
    public static void main(String[] args) {

        Box<Integer> intBox = new Box<>();
        intBox.setValue(100);
        System.out.println("Integer Box: " + intBox.getValue());

        Box<String> stringBox = new Box<>();
        stringBox.setValue("Salam Java");
        System.out.println("String Box: " + stringBox.getValue());

        Box<Double> doubleBox = new Box<>();
        doubleBox.setValue(25.5);
        System.out.println("Double Box: " + doubleBox.getValue());

        intBox.printAny("Hello");
        intBox.printAny(999);
        intBox.printAny(3.14);
    }
}