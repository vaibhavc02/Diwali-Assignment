package com.demo.test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.demo.module.LowAttendanceException;
import com.demo.module.Student;

public class TestStudent {

	public static void main(String[] args) {
          
		List<Student> studentList = new ArrayList<>();
		 try {
			studentList.add(new Student(1, "raj", "Java", 85, 76));
			studentList.add(new Student(2, "vai", "MySQL", 80, 87));
			studentList.add(new Student(3, "rahul", "C++", 95, 77));
			studentList.add(new Student(4, "ram", "Python", 75, 82));
			studentList.add(new Student(5, "sham", "HTML", 81, 98));

		} catch (LowAttendanceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("students.dat"))) {
	            oos.writeObject(studentList);
	            System.out.println("Students serialized successfully.");
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
		 Collections.sort(studentList);

	        System.out.println("\nStudents in decreasing attendance:");
	        for (Student s : studentList) {
	            System.out.println(s);
	        }
	}

}
