package az.developia.spring_project_14aprel.entity;

import org.springframework.context.annotation.Bean; 
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Person person() {
        return new Person();
    }

	public char[] getVersion() {
		// TODO Auto-generated method stub
		return null;
	}

	public char[] getName() {
		// TODO Auto-generated method stub
		return null;
	}
}