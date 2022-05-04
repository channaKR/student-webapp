package com.student.webapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.student.webapp.entity.Student;
import com.student.webapp.repository.StudentRepository;

@SpringBootApplication
public class StudentWebappApplication implements CommandLineRunner {
   
	public static void main(String[] args) {
		SpringApplication.run(StudentWebappApplication.class, args);
	}
  @Autowired 
  private StudentRepository studentrepository;
	@Override
	public void run(String... args) throws Exception {
		
		
	}

}
