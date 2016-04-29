package com.fabio.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.fabio.dao.StudentDAO;
import com.fabio.model.Student;

@Repository
public class StudentDaoImpl implements StudentDAO {
	@Autowired
	private SessionFactory session;
	
	@Override
	public void add(Student student) {
		session.getCurrentSession().save(student);
	}

	@Override
	public void edit(Student student) {
		session.getCurrentSession().update(student);
	}

	@Override
	public void delete(int studentId) {
		session.getCurrentSession().delete(getStudent(studentId));
	}

	@Override
	public Student getStudent(int studentId) {
		return (Student)session.getCurrentSession().get(Student.class, studentId);
	}

	@Override
	public List<Student> getAllStudent() {
		return (List<Student>) session.getCurrentSession().createQuery("from Student").list();
	}

}
