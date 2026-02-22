package demo;

public class Mainn {
    public static void main(String[] args) {

        Employee emp = new Employee();

        emp.id = 1;
        emp.name = "Vüsal";
        emp.surname = "Rüstəmov";
        emp.age = 25;
        emp.phone = "050-123-45-67";
        emp.address = "Bakı";

        emp.salary = 1500.50;
        emp.department = "IT";
        emp.username = "vusal.r";
        emp.password = "12345";

        emp.printInfo();
    }
}