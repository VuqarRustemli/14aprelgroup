package az.developia.spring_project_14aprel.entity;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
@Scope("prototype")
public class Home {

    private int id;
    private String address;
    private String color;

    public Home() {
        this.id = 1;
        this.address = "Baki";
        this.color = "Blue";
    }

    @PostConstruct
    public void init() {
    	System.out.println("init");
    }
    
    @PreDestroy
    public void destroy() {
        System.out.println("destroy");
    }

    public int getId() {
    	return id; 
    }
    
    public void setId(int id) {
    	this.id = id; 
    }

    public String getAddress() {
    	return address; 
    }
    
    public void setAddress(String address) {
    	this.address = address; 
    }

    public String getColor() {
    	return color; 
    }
    
    public void setColor(String color) {
    	this.color = color; 
    }
}