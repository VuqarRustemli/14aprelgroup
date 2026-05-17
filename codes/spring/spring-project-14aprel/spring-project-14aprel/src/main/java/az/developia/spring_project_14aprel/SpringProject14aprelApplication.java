package az.developia.spring_project_14aprel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import az.developia.spring_project_14aprel.entity.Book;
import az.developia.spring_project_14aprel.entity.Computer;
import az.developia.spring_project_14aprel.entity.Employee;
import az.developia.spring_project_14aprel.entity.Home;
import az.developia.spring_project_14aprel.entity.Person;

@SpringBootApplication
public class SpringProject14aprelApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringProject14aprelApplication.class, args);

        Book book = context.getBean(Book.class);
        
        Person person = context.getBean(Person.class);

        System.out.println("ID: " + person.getId());
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Salary: " + person.getSalary());


        System.out.println("id: " + book.getId());
        System.out.println("name: " + book.getName());
        System.out.println("price: " + book.getPrice());
        System.out.println("page count: " + book.getPageCount());
        
        
        
        ApplicationContext context1 = SpringApplication.run(SpringProject14aprelApplication.class, args);

        Home h1 = context1.getBean(Home.class);
        Home h2 = context1.getBean(Home.class);

        System.out.println(h1);
        System.out.println(h2);
        
        
        
        ApplicationContext context2 =
                new AnnotationConfigApplicationContext(SpringProject14aprelApplication.class);

        Computer computer = context2.getBean(Computer.class);

        System.out.println("ID: " + computer.getId());
        System.out.println("Brand: " + computer.getBrand());
        System.out.println("Price: " + computer.getPrice());
        System.out.println("Color: " + computer.getColor());        
        
        

        ApplicationContext context3 =
                new AnnotationConfigApplicationContext(SpringProject14aprelApplication.class);

        Employee employee = context3.getBean(Employee.class);

        System.out.println("Employee məlumatları:");
        System.out.println("ID: " + employee.getId());
        System.out.println("Name: " + employee.getName());
        System.out.println("Age: " + employee.getAge());
        System.out.println("Salary: " + employee.getSalary());

        System.out.println("Computer məlumatları:");
        System.out.println("Computer ID: " + employee.getComputer().getId());
        System.out.println("Brand: " + employee.getComputer().getBrand());
        System.out.println("Price: " + employee.getComputer().getPrice());
    }
}