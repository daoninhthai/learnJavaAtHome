package com.company;

class Student{
    private int studentId;
    private String firstName;
    private String lastName;

    public Student(int studentId, String firstName, String lastName) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getStudentId() {
        return studentId;
    }



    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
public class Main {

    public static void main(String[] args) {
        Student student = new Student(1,"nguyen","trai") ;
        student.setFirstName("Nguyen");
        student.setLastName("Trai");
    }
}
