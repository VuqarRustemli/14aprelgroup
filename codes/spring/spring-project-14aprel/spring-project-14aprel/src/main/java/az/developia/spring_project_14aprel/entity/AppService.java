package az.developia.spring_project_14aprel.entity;

import org.springframework.beans.factory.annotation.Value; 
import org.springframework.stereotype.Component;

@Component
public class AppService {

    @Value("${app.name}")
    private String appName;

    @Value("${app.version}")
    private int appVersion;

    @Value("${app.active}")
    private boolean appActive;

    public void printAppInfo() {
        System.out.println("App Name: " + appName);
        System.out.println("App Version: " + appVersion);
        System.out.println("App Active: " + appActive);
    }
  
}