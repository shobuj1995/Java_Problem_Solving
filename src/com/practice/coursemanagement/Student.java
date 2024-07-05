package com.practice.coursemanagement;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;

//Write a Java program to create a class called "Student" with a name, grade, and courses attributes,
//and methods to add and remove courses.
public class Student {
    private String studentName;
    private int studentGrade;
    public ArrayList<String> courseList;

    public Student(String studentName, int studentGrade) {
        this.studentName = studentName;
        this.studentGrade = studentGrade;
        this.courseList = new ArrayList<>();
    }

    public String getStudentName() {
        return studentName;
    }

    public int getStudentGrade() {
        return studentGrade;
    }

    public ArrayList<String> getCourseList() {
        return courseList;
    }
    public void addCourse( String courseName){
        courseList.add(courseName);
    }
    public void removeCourse(String courseName){
        courseList.remove(courseName);
    }
    public void printStudentInfo(){
        System.out.println("Student Name: "+studentName+" obtain the grade: "+studentGrade+" taken courses: "+getCourseList());
    }

    public static void main(String[] args) {
        Student student1=new Student("Jhon Hamond",75);
        Student student2=new Student("Alexsander",80);
        Student student3=new Student("Rohit",95);
        student3.addCourse("Math");
        student3.addCourse("English");
        student3.printStudentInfo();
        System.out.println(student2.getStudentName()+" taken some new course Science and Geography");
        student2.addCourse("Science");
        student2.addCourse("Geography");
        student2.printStudentInfo();
        System.out.println(student2.getStudentName()+" Change one course");
        student2.removeCourse("Geography");
        System.out.println("After removing Geography couse Alexsander has only one course: ");
        student2.printStudentInfo();
    }
}
