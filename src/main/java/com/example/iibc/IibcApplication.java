package com.example.iibc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class IibcApplication {

	public static void main(String[] args) {
		SpringApplication.run(IibcApplication.class, args);
	}

}
