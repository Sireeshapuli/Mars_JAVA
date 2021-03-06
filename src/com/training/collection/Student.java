package com.training.collection;

public class Student implements Comparable{
	
	private String name;
	private int rollNo;
	private String grade;
	
	public Student(String name, int rollNo, String grade) {
		super();
		this.name = name;
		this.rollNo = rollNo;
		this.grade = grade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	@Override
	public int compareTo(Object o) {
		Student stud = (Student)o;
		
		return this.getName().compareTo(stud.getName());
	
	
	}
}