package com.student.webapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.webapp.entity.Student;

public interface StudentRepository extends JpaRepository<Student,Integer> {

}
