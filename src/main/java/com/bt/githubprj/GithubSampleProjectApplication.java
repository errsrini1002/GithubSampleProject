package com.bt.githubprj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GithubSampleProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(GithubSampleProjectApplication.class, args);
	}
	
	@GetMapping("/githubprj")
	public String getMessage() {
		return "Git hub project " ; 
	}

}
