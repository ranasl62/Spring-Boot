package bd.ac.seu.aj.springbootdemo.controller;

import bd.ac.seu.aj.springbootdemo.model.Phone;
import bd.ac.seu.aj.springbootdemo.model.Student;
import bd.ac.seu.aj.springbootdemo.repository.PhoneRepository;
import bd.ac.seu.aj.springbootdemo.repository.StudentRepository;
import org.springframework.data.util.Pair;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class StudentServiceController {
    private StudentRepository studentRepository;
    private PhoneRepository phoneRepository;

    public StudentServiceController(StudentRepository studentRepository, PhoneRepository phoneRepository)
    {
        this.studentRepository = studentRepository;
        this.phoneRepository=phoneRepository;
    }
    @GetMapping(value="/")
    @ResponseBody
    public String index(){
        return "<h1 style='text-align:center;'>Welcome to Student Service</h1>";
    }
    @GetMapping(value = "/students")
    @ResponseBody
    public Iterable<Student> getAllStudents()
    {
        return studentRepository.findAll();
    }

    @GetMapping(value = "/student")
    @ResponseBody
    public Student getStudent(@RequestParam long id) {
        return studentRepository
                .findById(id)
                .get();
    }
    @RequestMapping(value="/getstudenbycgpa")
    @ResponseBody
    public Iterable<Student> getStudentsByCgpaRange(@RequestParam double start,
                                                    @RequestParam double end){
        return studentRepository.findAllByCgpaBetween(start,end);

    }


    @PostMapping(value = "/createstudent")
    @ResponseBody
    public Student insertStudent(@RequestBody Student student) {
        List<Phone> phoneList = student.getPhoneList();
        for (Phone phone :phoneList) {
            phoneRepository.save(phone);
        }
        return studentRepository.save(student);
    }
    @DeleteMapping(value="/deletestudent/{id}")
    @ResponseBody
    public void deleteStudent(@PathVariable  long id) {
        studentRepository.deleteById(id);
    }
    @PutMapping(value="/updatestudent/{id}")
    @ResponseBody
    public Student updateStudent(@RequestBody Student student,
                                 @PathVariable long id) {
        List<Phone> phoneList = student.getPhoneList();
        for (Phone phone :phoneList) {
            if(phoneRepository.findById(phone.getId())!=null)
                 phoneRepository.save(phone);
        }
        student.setId(id);
        studentRepository.save(student);
        return student;
    }
    @PostMapping(value="/test")
    @ResponseBody
    public String pairTest(@RequestParam Pair<String,Short> id) {
       return (id.getFirst()+"   "+id.getSecond());
    }
}
