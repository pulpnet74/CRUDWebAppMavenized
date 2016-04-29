package com.fabio.dao;

import java.util.List;

import com.fabio.model.Student;

public interface StudentDAO {
	public void add(Student student);
	public void edit(Student student);
	public void delete(int studentId);
	public Student getStudent(int studentId);
	public List<Student> getAllStudent();
}
