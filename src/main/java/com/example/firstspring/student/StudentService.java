package com.example.firstspring.student;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class StudentService {
@Autowired
    private  StudentRepository studentRepository;



    public StudentEntity save( StudentEntity studentEntity){

        return studentRepository.save(studentEntity);
    }

}
