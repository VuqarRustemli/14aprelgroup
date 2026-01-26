package demo;

public class MAin {
    public static void main(String[] args) {

        School school = new School();
        Student student = school.new Student();

        student.name = "Vuqar";
        student.grade = 7;

        student.showInfo();
    }
}
