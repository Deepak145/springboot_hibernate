package com.spring.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.dao.model.Student;

public interface StudentDao extends JpaRepository<Student, Integer>{}
