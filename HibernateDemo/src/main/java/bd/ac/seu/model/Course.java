package bd.ac.seu.model;

import javax.persistence.*;
import java.util.*;

@Entity
public class Course {
    @Id
    private String courseCode;
    private String courseTitle;
    private double creditHours;
    @ManyToMany
    @JoinTable(name = "Registration",
            joinColumns={@JoinColumn(name="courseCode")},
            inverseJoinColumns = {@JoinColumn(name = "studentId")})
    Set<Student> studentList;

    public Course(String courseCode, String courseTitle, double creditHours) {
        this();
        this.courseCode = courseCode;
        this.courseTitle = courseTitle;
        this.creditHours = creditHours;
    }

    public Course() { studentList=new HashSet<>();}

    public String getCourseCode() { return courseCode;}

    public void setCourseCode(String courseCode) {this.courseCode = courseCode;}

    public String getCourseTitle() { return courseTitle;}

    public void setCourseTitle(String courseTitle) {this.courseTitle = courseTitle;}

    public double getCreditHours() { return creditHours;}

    public void setCreditHours(double creditHours) {this.creditHours = creditHours;}

    public Set<Student> getStudentList() { return studentList; }

    @Override
    public String toString() {
        return "Course{" +
                "courseCode='" + courseCode + '\'' +
                ", courseTitle='" + courseTitle + '\'' +
                ", creditHours=" + creditHours +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return Objects.equals(courseCode, course.courseCode);
    }

    @Override
    public int hashCode() {return Objects.hash(courseCode);}
}
