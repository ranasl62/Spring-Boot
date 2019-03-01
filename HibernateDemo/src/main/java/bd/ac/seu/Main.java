package bd.ac.seu;

import bd.ac.seu.Service.StudentService;
import bd.ac.seu.model.Name;
import bd.ac.seu.model.Sex;
import bd.ac.seu.model.Student;
import bd.ac.seu.util.Filter;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class Main {
    private static final String DOMAINS[] = {".edu", ".com", ".net", ".org"};
    private StringBuilder stringBuilder;

    private String generateRandomName() {
        stringBuilder = new StringBuilder();
        int length = (int) (Math.random() * 10 + 3);
        stringBuilder.append((char) (Math.random() * 26 + 'A'));
        for (int i = 0; i < length; i++) {
            stringBuilder.append((char) (Math.random() * 26 + 'a'));
        }
        return stringBuilder.toString();
    }

    private String generateRandomEmailAddress() {
        stringBuilder = new StringBuilder();
        int length = (int) (Math.random() * 5 + 3);
        for (int i = 0; i < length; i++) {
            stringBuilder.append((char) (Math.random() * 26 + 'a'));
        }
        stringBuilder.append((char) '@');
        length = (int) (Math.random() * 5 + 3);
        for (int i = 0; i < length; i++) {
            stringBuilder.append((char) (Math.random() * 26 + 'a'));
        }
        stringBuilder.append(DOMAINS[(int) (Math.random() * DOMAINS.length)]);
        return stringBuilder.toString();
    }
    @Test
    public void  r(){

        BigDecimal a =new BigDecimal("0");

    }
    public Main() {
        StudentService studentService = new StudentService();
/*        List<Student> studentList = studentService.getStudentSet();
        //List <Student> femaleStudent = Filter.getSubset(studentList, Sex.MALE);
        List<Student> maleStudent = new ArrayList<>();
        List<Student> femaleStudent = Filter.getSubset(studentList, (s1) -> {
            return s1.getAddress() == null;
        });*/
                //studentList.forEach(System.out::println);
/*        for(int i=0;i<100000;i++){
            Student student =new Student(i,new Name(generateRandomName(),generateRandomName()),generateRandomEmailAddress(),Math.random()<0.5? Sex.MALE:Sex.FEMALE,null);
            studentService.addStudent(student);
        }*/
        //  System.out.println(studentList.size());
        int m = 0, f = 0;
        long currentTime, stopTime;
        currentTime = System.currentTimeMillis();

       /*
        System.out.println("Male ="+m+"        "+"Female "+f);
       stopTime = System.currentTimeMillis();
        System.out.printf("Time need %.6f",(double)((stopTime-currentTime)/1000.0));*/
        //Collections.sort(femaleStudent,new StudentComparatorBaseOnNameLegnth());
        //Collections.sort(femaleStudent,new StudentCompatorBasedOnEmailAddress());
        /*Collections.sort(femaleStudent, (s1, s2) -> s1.getEmailAddress().compareTo(s2.getEmailAddress()));
        for (int i = 0; i < 10; i++) {
            System.out.println(femaleStudent.get(i));
        }*/
        SessionFactorySingletone.getSessionFactory().close();
    }

    public static void main(String arg[]) {
        new Main();
        return;
    }
}
