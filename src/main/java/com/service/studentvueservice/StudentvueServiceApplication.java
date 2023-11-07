package com.service.studentvueservice;

import com.service.studentvueservice.controlers.FamilyNameController;
import com.service.studentvueservice.controlers.RegistrationController;
import com.service.studentvueservice.controlers.gradeController;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackageClasses={FamilyNameController.class, RegistrationController.class, gradeController.class})
public class StudentvueServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentvueServiceApplication.class, args);
	}

}