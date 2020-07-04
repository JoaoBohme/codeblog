package com.spring.codeblog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.spring.codeblog.confuguration.SecurityConfig;
@Import({SecurityConfig.class})
@SpringBootApplication
public class CodeblogApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(CodeblogApplication.class, args);
	}

}
