package az.developia.spring_project_14aprel.entity;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentController2 {

    List<Student> students = new ArrayList<>();

    @GetMapping("/")
    public String page(Model model) {

        model.addAttribute("student", new Studentt());
        model.addAttribute("students", students);

        return "index";
    }

    @PostMapping("/add")
    public String addStudent(@ModelAttribute Student student) {

        students.add(student);

        return "student";
    }
}