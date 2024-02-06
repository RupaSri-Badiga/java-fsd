package demo.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.example.entity","com.example.repositry","com.example.controller","com.example.config"})
public class SpringJpaAdvancedApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaAdvancedApplication.class, args);
	}

}
