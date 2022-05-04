package com.student.webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.student.webapp.entity.Student;
import com.student.webapp.service.StudentService;

@Controller
public class StudentController {

	private StudentService studentService;

	public StudentController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}
	@GetMapping("/students")
	public String listStudnets(Model model) {
		model.addAttribute("students",studentService.getAllStudents());
		return "students";
		
	}
	@GetMapping("/students/create")
	public String AddStudent(Model model) {
		Student student = new Student();
		model.addAttribute("student",student);
		return "create_account";
		
	}
	@PostMapping("/add")
	public String SaveStudentData(@ModelAttribute("student") Student student) {
		
		studentService.saveStudnet(student);
		return "redirect:/students";
	}
	
}
