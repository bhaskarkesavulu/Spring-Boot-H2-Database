package com.student.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.web.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
