package az.developia.spring_project_14aprel.entity;

import org.springframework.stereotype.Controller; 
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MyController {

    @GetMapping("/")
    public String home() {
        return "Hello Spring Boot";
    }
}