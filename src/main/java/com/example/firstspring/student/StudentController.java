package com.example.firstspring.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentAdaptor adaptor;
    private final StudentRepository studentRepository;
@Autowired
    public StudentController( StudentRepository studentRepository) {
    this.studentRepository = studentRepository;

    }
    @PostMapping()
    public void save(@RequestBody StudentDto studentDto) {
        studentRepository.save(adaptor.convert(studentDto));
    }

}
