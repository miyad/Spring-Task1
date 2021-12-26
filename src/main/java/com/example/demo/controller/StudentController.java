package com.example.demo.controller;


import com.example.demo.model.Student;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/")
public class StudentController {
    @Autowired
    public StudentService studentService;


    @GetMapping("/student/all")
    public Iterable<Student> getMappingAllStudents(){
      //  List<Student> ls = (List<Student>) studentService.getAllStudents();
       // System.out.println(ls.size());
       // System.out.println(ls.get(0));
        System.out.println("get exec");
        return studentService.getAllStudents();
    }

    @PostMapping("/newStudent")
    public void postMappingNewStudent(@RequestBody Student student){
        System.out.println("post exec");        
        studentService.saveNewStudent(student);
    }
}
