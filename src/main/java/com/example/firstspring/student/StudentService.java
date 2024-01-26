package com.example.firstspring.student;


import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class StudentService {
@Autowired
    private  StudentRepository studentRepository;


@Transactional
    public StudentEntity save(StudentEntity studentEntity){

        return studentRepository.save(studentEntity);
    }


}
