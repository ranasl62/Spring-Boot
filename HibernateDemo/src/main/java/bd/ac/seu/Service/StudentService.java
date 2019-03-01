package bd.ac.seu.Service;

import bd.ac.seu.SessionFactorySingletone;
import bd.ac.seu.model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;
import java.util.Set;

public class StudentService {
    SessionFactory sessionFactory;
    public StudentService() {
    sessionFactory = SessionFactorySingletone.getSessionFactory();
    }

    //create
    public void addStudent(Student student){
        Session session = sessionFactory.openSession();
        session.getTransaction().begin();
        session.save(student);
        session.getTransaction().commit();
    }
    //create

    public void addAll(List<Student> studentList){
        Session session = sessionFactory.openSession();
        session.getTransaction().begin();
        for(Student student:studentList){
            session.save(student);
        }
        session.getTransaction().commit();
    }

    //Read
    public List<Student> getStudentSet(){
        Session session = sessionFactory.openSession();
        session.getTransaction().begin();
        List<Student> studentList = session.createQuery("from Student").getResultList();
        return studentList;
    }
    //Read
    public Student getStudent(int studentId){
        Session session = sessionFactory.openSession();
        session.getTransaction().begin();
        Student student=session.get(Student.class,studentId);
        session.getTransaction().commit();
        return student;
    }
    //Update
    public void updateStudent(Student student){

    }
}
