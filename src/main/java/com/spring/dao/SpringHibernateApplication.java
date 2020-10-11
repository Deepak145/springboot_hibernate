package com.spring.dao;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.spring.dao.controller.StudentController;
import com.spring.dao.model.Conference;
import com.spring.dao.model.Marks;
import com.spring.dao.model.Student;
import com.spring.dao.model.Subject;

@SpringBootApplication
@EnableJpaRepositories
public class SpringHibernateApplication implements CommandLineRunner{
	
	@Autowired StudentController controller;

	public static void main(String[] args) {
		SpringApplication.run(SpringHibernateApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Marks m1= new Marks();m1.setChemestry(67); m1.setEnglish(56);m1.setHindi(87);m1.setMath(87);m1.setPhysics(90);
		Marks m2= new Marks();m2.setChemestry(72); m2.setEnglish(52);m2.setHindi(82);m2.setMath(89);m2.setPhysics(92);
		Marks m3= new Marks();m3.setChemestry(67); m3.setEnglish(53);m3.setHindi(83);m3.setMath(83);m3.setPhysics(93);
		
		Student s = new Student();
		s.setName("Deepak");
		s.setMarks(m1);
		
		Student s2 = new Student();
		s2.setName("Karan");
		s2.setMarks(m2);
		
		Student s3 = new Student();
		s3.setName("Shanky");
		s3.setMarks(m3);
		
		List<Student> stList = new ArrayList<>();  stList.add(s2);
		List<Student> stList1 = new ArrayList<>();  stList1.add(s3);
		Conference c1= new Conference();
		c1.setDetail("Cloud conference");
		c1.setStudents(stList);
		
		Conference c3= new Conference();
		c3.setDetail("AZURE conference");
		c3.setStudents(stList1);
		
		Subject sub = new Subject();
		sub.setName("Computer Science");
		sub.setStudent(s);
		
		Subject sub1 = new Subject();
		sub1.setName("Informational Technology");
		sub1.setStudent(s);
		
		Subject sub2 = new Subject();
		sub2.setName("Data Science");
		sub2.setStudent(s);
		
		Set<Subject> sList = new HashSet<>(); sList.add(sub); sList.add(sub1);
		Set<Subject> sList2 = new HashSet<>(); sList2.add(sub); sList2.add(sub1);
		Set<Subject> sList3 = new HashSet<>(); sList3.add(sub); sList3.add(sub1);
		
		List<Conference> cList = new ArrayList<>();  cList.add(c1); cList.add(c3);
		List<Conference> cList1 = new ArrayList<>();  cList1.add(c1);
		List<Conference> cList2 = new ArrayList<>();  cList2.add(c3);
		
		s.setSubjects(sList);
		s.setConf(cList); 
		
		s3.setSubjects(sList2);
		s3.setConf(cList1); 
		
		s2.setSubjects(sList3);
		s2.setConf(cList2); 

		controller.push(s);
		
	}

}
