package demo;

public class Employee extends Personn {

    double salary;
    String department;
    String username;
    String password;

    @Override
    void printInfo() {
        super.printInfo();

        System.out.println("Maaş: " + salary);
        System.out.println("Departament: " + department);
        System.out.println("İstifadəçi adı: " + username);
        System.out.println("Şifrə: " + password);
    }
}