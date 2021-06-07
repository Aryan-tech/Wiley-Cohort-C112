package com.wiley;
import java.util.*;

public class Standard {
	Student student = new Student();
	Scanner sc = new Scanner(System.in);
	int[] RollNo = new int[8];
	String Name[] = new String[8] ;
	int[] MarksInScience = new int[8];
	int[] MarksInMaths = new int[8];
	int[] MarksInEng = new int[8];
	int[] average = new int[8];
	void EnterDetails(){
	for(int i = 0; i<8;i++) {
		RollNo[i] = i+1;
		System.out.println("Enter " + (i+1) +" student Name:");
		Name[i] = sc.next();
		System.out.println("Enter " + (i+1) +" Marks in Science:");
		MarksInScience[i] = sc.nextInt();
		System.out.println("Enter " + (i+1) +" Marks in Maths:");
		MarksInMaths[i] = sc.nextInt();
		System.out.println("Enter " + (i+1) +" Marks in English:");
		MarksInEng[i] = sc.nextInt();
		average[i] = (MarksInMaths[i] + MarksInScience[i] + MarksInEng[i])/3;
	}
	}
	void setDetails() {
		student.setRollNo(RollNo);
		student.setStudName(Name);
		student.setMarksInScience(MarksInScience);
		student.setMarksInMaths(MarksInMaths);
		student.setMarksInEng(MarksInEng);
	}
	void display() {
		System.out.println("Roll No.  Student Name   Marks in Science  Marks in Maths  Marks in English");
		for(int i = 0;i<8;i++) {
			System.out.println(student.getRollNo()[i]+"   			"+student.getStudName()[i]+"  			  "+student.getMarksInScience()[i]+" 		  "+student.getMarksInMaths()[i]+"   			"+student.getMarksInEng()[i]);
		}
	}
	void HighPercent() {
		int max = 0; int index = 0;
		for(int i =0;i < 8;i++) {
			if(average[i] > max) {
				max = average[i];
				index = i;
			}
		}
		System.out.println("Highest Percentage goes to "+Name[index]+" of Roll No." + RollNo[index]+" with "+max+" percentage");
	}
	void HighestMarkInMaths() {
		int max = 0; int index = 0;
		for(int i =0;i < 8;i++) {
			if(MarksInMaths[i] > max) {
				max = MarksInMaths[i];
				index = i;
			}
		}
		System.out.println("Highest Mark in Maths goes to "+Name[index]+" of Roll No." + RollNo[index]+" with "+max+" marks");
	}
}
