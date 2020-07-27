package com.test.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortListUsingComparableInterface {

	public static void main(String[] args) {
		List<Student> studentList = new ArrayList<>();
		studentList.add(new Student("111", "Ramu", "N", 400.0, "A"));
		studentList.add(new Student("222", "Suresh", "P", 500.0, "B"));
		studentList.add(new Student("223", "Rao", "G", 300.0, "A"));
		studentList.add(new Student("333", "Grahathi", "G", 560.0, "C"));
		studentList.add(new Student("444", "Amish", "N", 450.0, "A"));
		
		System.out.println("Sorting students based on marks............");
		System.out.println("Before sorting****************************");
		for(Student s :studentList) {
			System.out.println(s.getId() + "    "+s.getFirstName()+ "          "+s.getLastName()+"    "+s.getMarks() +"    "+s.getSection());
		}
		
		Collections.sort(studentList,new MarksComparator());
		System.out.println("After sorting****************************");
		for(Student s :studentList) {
			System.out.println(s.getId() + "    "+s.getFirstName()+ "          "+s.getLastName()+"    "+s.getMarks() +"    "+s.getSection());
		}
		
		System.out.println("Sorting students based on first name............");
		Collections.sort(studentList,new StudentFirstNameComparator());
		
		for(Student s :studentList) {
			System.out.println(s.getId() + "    "+s.getFirstName()+ "          "+s.getLastName()+"    "+s.getMarks() +"    "+s.getSection());
		}
		
	
	}

}
