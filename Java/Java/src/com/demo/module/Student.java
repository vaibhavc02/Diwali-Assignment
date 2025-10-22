package com.demo.module;

import java.io.Serializable;

public class Student implements Serializable, Comparable<Student> {
  
	private int rollno;
	private String snmae;
	private String course;
	private float attendance_percentage;
	private float score;
	
	public Student(int rollno, String snmae, String course, float attendance_percentage, float score) throws LowAttendanceException {
		super();
		this.rollno = rollno;
		this.snmae = snmae;
		this.course = course;
		 if (attendance_percentage < 60) {
	            throw new LowAttendanceException("Attendance below 60% not allowed! Roll: " + rollno);
	        }

	        this.attendance_percentage = attendance_percentage;
		this.score = score;
	}
	public Student() {
		super();
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", snmae=" + snmae + ", course=" + course + ", attendance_percentage="
				+ attendance_percentage + ", score=" + score + "]";
	}
	public String calculateGrade() {
        if (score >= 90) return "A";
        else if (score >= 75) return "B";
        else if (score >= 60) return "C";
        else return "D";
    }

    public double getAttendance() {
        return attendance_percentage;
    }

    @Override
    public int compareTo(Student s) {
        return Double.compare(s.attendance_percentage, this.attendance_percentage);
    }
	

}
