package az.developia.spring_project_14aprel.entity;

public class Student {
    private String name;
    private String surname;
    private String grade;

    public Student(String name, String surname, String string) {
        this.name = name;
        this.surname = surname;
        this.grade = string;
    }

    public String getName() {
    	return name; 
    }
    public String getSurname() {
    	return surname; 
    }
    public String getGrade() {
    	return grade; 
    }
}