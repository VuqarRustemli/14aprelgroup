package az.developia.spring_project_14aprel.entity;

import lombok.Data;

@Data
public class Studentk {

    private String name;
    private int grade;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
}