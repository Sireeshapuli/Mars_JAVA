package com.training.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class StudentCollectionAssignment {

	public static void main(String[] args) {
		
		//Set<Integer> values = new HashSet<>();
		
				Student stud1 = new Student("Sara", 12, "B");
				Student stud2 = new Student("Mark", 14, "C");
				Student stud3 = new Student("Dave", 15, "A");
				Student stud4 = new Student("Kevin", 23, "B");
				Student stud5 = new Student("Sara", 12, "B");
				
				Set<Student> studenSet  = new TreeSet<>(); 
				
				
//				Map<String, Student> studentMap = new HashMap<>();
				
				studenSet.add(stud1);
				studenSet.add(stud2);
				studenSet.add(stud3);
				studenSet.add(stud4);
				studenSet.add(stud5);
				System.out.println("................");
				
				for(Student student:studenSet) {
					System.out.println(student.getName());
				}
//				for(Map.Entry<String, Student>entry : studentMap.entrySet()) {
//					String key = entry.getKey();
//					Student student = entry.getValue();
//					System.out.println("NAME: "+student.getName()+" GRADE: "+student.getGrade());
//				}
				
//				List<Student> studentList = new ArrayList<>();
//				
//				studentList.add(stud1);
//				studentList.add(stud2);
//				studentList.add(stud3);
//				studentList.add(stud4);
//				
//				for(Student student : studentList) {
//					System.out.println(student.getName());
//				}
//				

			}

		


	}


