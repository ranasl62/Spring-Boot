package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;
@Entity
public class Student {
    @Id
    private int studetnId;
    private String studentName;
    private double studentCgpa;

    public Student(int studetnId, String studentName, double studentCgpa) {
        this.setStudetnId(studetnId);
        this.setStudentName(studentName);
        this.setStudentCgpa(studentCgpa);
    }

    public int getStudetnId() {
        return studetnId;
    }

    public void setStudetnId(int studetnId) {
        this.studetnId = studetnId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public double getStudentCgpa() {
        return studentCgpa;
    }

    public void setStudentCgpa(double studentCgpa) {
        this.studentCgpa = studentCgpa;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return getStudetnId() == student.getStudetnId();
    }

    @Override
    public int hashCode() {

        return Objects.hash(getStudetnId());
    }

    @Override
    public String toString() {
        return "Student{" +
                "studetnId=" + studetnId +
                ", studentName='" + studentName + '\'' +
                ", studentCgpa=" + studentCgpa +
                '}';
    }
}
