package demo;

public class MAin {
    public static void main(String[] args) {

        School school = new School();
        Student student = school.new Student();

        student.name = "Ali";
        student.grade = 9;

        student.showInfo();
    }
}
