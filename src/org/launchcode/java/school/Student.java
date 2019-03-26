package org.launchcode.java.school;
import java.util.Scanner;
public class Student {

    private static int nextStudentId = 1;
    private String name;
    private final int studentId;
    private int numberOfCredits;
    private double gpa;
    Scanner in = new Scanner(System.in);

    public void setName(String tempName) {
        this.name = tempName;
    }

    public String getName() {
        return name;
    }

    private void setStudentID() {
        int studentId = nextStudentId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setNumberOfCredits() {
        int numberOfCredits = this.numberOfCredits;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public void setGpa() {
        double gpa = this.gpa;
    }

    public double getGpa() {
        return gpa;
    }

    public Student(String name, int studentId, int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public Student(String name, int studentId) {
        this(name, studentId, 0, 0);
    }

    public Student(String name) {
        this(name, nextStudentId);
        nextStudentId++;
    }

    /* getters and setters omitted */

}