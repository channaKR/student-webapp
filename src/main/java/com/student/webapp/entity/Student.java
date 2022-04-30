package com.student.webapp.entity;

import javax.persistence.*;


@Entity
@Table(name="student_information")
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	private int age;
	private String course;
	
	
	public Student() {
		super();
	
	}
	
	public Student(String name, int age, String course) {
		super();
		this.name = name;
		this.age = age;
		this.course = course;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	
	
	
}
