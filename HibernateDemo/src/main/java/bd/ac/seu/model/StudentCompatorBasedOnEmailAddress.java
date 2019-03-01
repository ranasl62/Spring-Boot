package bd.ac.seu.model;

import java.util.Comparator;

public class StudentCompatorBasedOnEmailAddress implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        return s1.getEmailAddress().compareTo(s2.getEmailAddress());
    }
}
