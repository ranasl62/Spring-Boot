package bd.ac.seu.model;

import java.util.Comparator;

public class StudentComparatorBaseOnNameLegnth implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        int lenght1 = s1.getName().getFirstName().length()+s1.getName().getLastName().length();
        int lenght2 = s2.getName().getFirstName().length()+s2.getName().getLastName().length();

        return lenght1==lenght2 ?s1.getName().getFirstName().compareTo(s2.getName().getFirstName()):lenght1-lenght2;
    }
}
