package com.spring.dao.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Marks {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Integer hindi;
	private Integer english;
	private Integer math;
	private Integer physics;
	private Integer chemestry;
	@OneToOne(mappedBy = "marks")
	private Student student;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getHindi() {
		return hindi;
	}
	public void setHindi(Integer hindi) {
		this.hindi = hindi;
	}
	public Integer getEnglish() {
		return english;
	}
	public void setEnglish(Integer english) {
		this.english = english;
	}
	public Integer getMath() {
		return math;
	}
	public void setMath(Integer math) {
		this.math = math;
	}
	public Integer getPhysics() {
		return physics;
	}
	public void setPhysics(Integer physics) {
		this.physics = physics;
	}
	public Integer getChemestry() {
		return chemestry;
	}
	public void setChemestry(Integer chemestry) {
		this.chemestry = chemestry;
	}
	
	
}
