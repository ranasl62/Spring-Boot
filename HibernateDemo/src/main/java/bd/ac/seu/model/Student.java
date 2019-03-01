package bd.ac.seu.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
public class Student {
    @Id
    private int id;
    private Name name;
    private String emailAddress;
    @Enumerated(EnumType.STRING)
    Sex sex;
    @Enumerated
    private Address address;
    @ManyToMany
    @JoinTable(name = "Registration",
            joinColumns={@JoinColumn(name="studentId")},
            inverseJoinColumns = {@JoinColumn(name = "courseCode")})
    private Set <Course> courseList;


    public Student() { courseList=new HashSet<Course>();}

    public Student(int id, Name name, String emailAddress, Sex sex, Address address) {
        this.id = id;
        this.name = name;
        this.emailAddress = emailAddress;
        this.sex = sex;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public Name getName() {
        return name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public Sex getSex() {
        return sex;
    }

    public Address getAddress() {
        return address;
    }

    public Set<Course> getCourseList() {
        return courseList;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setCourseList(Set<Course> courseList) {
        this.courseList = courseList;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name=" + name +
                ", emailAddress='" + emailAddress + '\'' +
                ", sex=" + sex +
                ", address=" + address +
                ", courseList=" + courseList +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id;
    }

    @Override
    public int hashCode() {

        return Objects.hash(id);
    }
}
