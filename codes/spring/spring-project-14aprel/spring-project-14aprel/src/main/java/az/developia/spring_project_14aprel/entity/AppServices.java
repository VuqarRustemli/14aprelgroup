package az.developia.spring_project_14aprel.entity;

import org.springframework.stereotype.Service;

@Service
public class AppServices {

    public AppServices(AppConfig appConfig) {
        System.out.println(appConfig.getName());
        System.out.println(appConfig.getVersion());
    }
}