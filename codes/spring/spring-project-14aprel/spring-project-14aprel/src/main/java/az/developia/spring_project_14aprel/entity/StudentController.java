package az.developia.spring_project_14aprel.entity;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {

    @GetMapping("/students")
    public String studentsPage() {
        return "student";
    }
    
    @GetMapping("/studentinfo")
    public String getStudentInfo(Model model) {
        Student student = new Student("James", "Brown", "6");
        
        model.addAttribute("student", student);
        
		return "student"; 
        
    }
}