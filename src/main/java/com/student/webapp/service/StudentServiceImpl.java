package com.student.webapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.student.webapp.entity.Student;
import com.student.webapp.repository.StudentRepository;
@Service
public class StudentServiceImpl implements StudentService{
     private StudentRepository studnetRepository;
     
     
	public StudentServiceImpl(StudentRepository studnetRepository) {
		super();
		this.studnetRepository = studnetRepository;
	}


	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return studnetRepository.findAll();
	}


	@Override
	public Student saveStudnet(Student student) {
		// TODO Auto-generated method stub
		return studnetRepository.save(student);
	}

	
}
