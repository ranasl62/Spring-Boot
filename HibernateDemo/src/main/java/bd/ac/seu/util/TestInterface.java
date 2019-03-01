package bd.ac.seu.util;

import bd.ac.seu.model.Student;
//only one abstruct method and zero or more default method
@FunctionalInterface
public interface TestInterface {
    public boolean test(Student student);
}
