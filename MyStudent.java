package com.day10;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class MyStudent {

	public static void main(String[] args) {
		Student st1=new Student(1001,"Naier",90);
		Student st2=new Student(1002,"Abid",80.5);
		Student st3=new Student(1003,"Sushma",85.5);
		Student st4=new Student(1004,"Sharukh",95);
		Student st5=new Student(1005,"Saif",82);
		Student st6=new Student(1006,"Taushifr",79.5);
		Student st7=new Student(1007,"Deepak",75);
		Student st8=new Student(1008,"Salman",89);
		Student st9=new Student(1009,"Ganpati",77.5);
		Student st10=new Student(1010,"Sonu",91.5);
		
		Map<Integer, Student> studentsHashTable = new Hashtable<Integer, Student>();
		
		studentsHashTable.put(1,st1);
		studentsHashTable.put(2,st2);
		studentsHashTable.put(3,st3);
		studentsHashTable.put(4,st4);
		studentsHashTable.put(5,st5);
		studentsHashTable.put(6,st6);
		studentsHashTable.put(7,st7);
		studentsHashTable.put(8,st8);
		studentsHashTable.put(9,st9);
		studentsHashTable.put(10,st10);
		
		 Iterator<Map.Entry<Integer, Student>> iterator = studentsHashTable.entrySet().iterator();
	        while (iterator.hasNext()) {
	            Map.Entry<Integer, Student> entry = iterator.next();
	            int rollNumber = entry.getKey();
	            Student student = entry.getValue();

	            System.out.println("Roll Number: " + rollNumber);
	            System.out.println("Name: " + student.getStudentName());
	            System.out.println("Marks Obtained: " + student.getMarksObtained());
	            System.out.println();
	        }

	}

}
