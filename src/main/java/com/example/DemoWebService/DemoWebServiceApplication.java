package com.example.DemoWebService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoWebServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoWebServiceApplication.class, args);
		System.out.println("Hello World");
	}

}

/*
Concepts:
@SpringBootApplication annotation
= configuration + component scan + enableautoconfiguration
 */

/*
browser :    www.google.com/users ---------------- controller ---- service  -------dao ------db
 */
