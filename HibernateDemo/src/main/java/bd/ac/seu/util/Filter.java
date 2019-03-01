package bd.ac.seu.util;

import bd.ac.seu.model.Course;
import bd.ac.seu.model.Sex;
import bd.ac.seu.model.Student;

import java.util.ArrayList;
import java.util.List;

public class Filter {
    public  static  List<Student> getSubset(List<Student> studentList,TestInterface testInterface){
        List<Student> newStudentList = new ArrayList<>();
        for (Student student:studentList) {
            if(testInterface.test(student)){
                newStudentList.add(student);
            }
        }
        return newStudentList;

    }
    public static List<Student> getSubset(List<Student> studentList, Sex sex){
        List<Student> newStudentList = new ArrayList<>();
        for(Student student:studentList){
            if(student.getSex()== sex){
                newStudentList.add(student);
            }
        }
        return newStudentList;
    }
    public static List<Student> getSubsetAddress(List<Student> studentList){
        List<Student> newStudentList = new ArrayList<>();
        for(Student student:studentList){
            if(student.getAddress()==null){
                newStudentList.add(student);
            }
        }
        return newStudentList;
    }
    public  static  List<Course> getSubset(List<Course> courseList,double creditHours){
        List<Course> newCourseList = new ArrayList<>();
        for (Course course:courseList) {
            if(course.getCreditHours()==creditHours){
                newCourseList.add(course);
            }
        }
        return newCourseList;

    }
    public  static  List<Course> getSubsetForPrefix(List<Course> courseList,String prefix){
        List<Course> newCourseList = new ArrayList<>();
        for (Course course:courseList) {
            if(course.getCourseTitle().startsWith(prefix)){
                newCourseList.add(course);
            }
        }
        return newCourseList;

    }
}
