package com.student.webapp.service;

import java.util.List;

import com.student.webapp.entity.Student;

public interface StudentService {
List<Student> getAllStudents();
Student saveStudnet(Student student);
}
