package com.example.demo.service;


import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

        @Autowired
        public StudentRepository studentRepository;

        public Iterable<Student> getAllStudents(){
                return studentRepository.findAll();
        }

        public void saveNewStudent(Student student){
                studentRepository.save(student);
        }


}
