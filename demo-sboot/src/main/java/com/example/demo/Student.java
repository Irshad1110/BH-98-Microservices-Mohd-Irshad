package com.example.demo;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Student {
	
	private @Id @GeneratedValue Long id;
	private String name;
	private int pmarks;
	private int cmarks;
	private int mmarks;
	private char grade;
	
	public Student() {
		
	}

	public Student(Long id, String name, int pmarks, int cmarks, int mmarks) {
		super();
		this.id = id;
		this.name = name;
		this.pmarks = pmarks;
		this.cmarks = cmarks;
		this.mmarks = mmarks;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPmarks() {
		return pmarks;
	}

	public void setPmarks(int pmarks) {
		this.pmarks = pmarks;
	}

	public int getCmarks() {
		return cmarks;
	}

	public void setCmarks(int cmarks) {
		this.cmarks = cmarks;
	}

	public int getMmarks() {
		return mmarks;
	}

	public void setMmarks(int mmarks) {
		this.mmarks = mmarks;
	}
	
	

	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", pmarks=" + pmarks + ", cmarks=" + cmarks + ", mmarks="
				+ mmarks + ", grade=" + grade + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(cmarks, grade, id, mmarks, name, pmarks);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return cmarks == other.cmarks && grade == other.grade && Objects.equals(id, other.id) && mmarks == other.mmarks
				&& Objects.equals(name, other.name) && pmarks == other.pmarks;
	}
	
}
