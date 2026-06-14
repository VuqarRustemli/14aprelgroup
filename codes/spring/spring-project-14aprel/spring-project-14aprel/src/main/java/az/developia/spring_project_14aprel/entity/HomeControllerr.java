package az.developia.spring_project_14aprel.entity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeControllerr {
    private static final Logger log = LoggerFactory.getLogger(HomeControllerr.class);
    
    @GetMapping("/salam")
    public String hello() {
        log.info("/salam endpoint cagirildi");
        return "Salam";
    }
}