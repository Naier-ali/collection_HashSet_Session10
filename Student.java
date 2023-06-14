package com.day10;

public class Student {
	private int studentRollNumer;
	private String studentName;
	private double marksObtained;

public Student( int studentRollNumer, String studentName,double marksObtained) {
		this.studentRollNumer = studentRollNumer;
		this.studentName =studentName;
		this.marksObtained=marksObtained;
	}

public int getStudentRollNumer() {
	return studentRollNumer;
}

public String getStudentName() {
	return studentName;
}

public double getMarksObtained() {
	return marksObtained;
}

}
