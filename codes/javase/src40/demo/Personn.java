package demo;

public class Personn {

    int id;
    String name;
    String surname;
    int age;
    String phone;
    String address;

    void printInfo() {
        System.out.println("ID: " + id);
        System.out.println("Ad: " + name);
        System.out.println("Soyad: " + surname);
        System.out.println("Yaş: " + age);
        System.out.println("Telefon: " + phone);
        System.out.println("Ünvan: " + address);
    }
}