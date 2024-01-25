package com.example.firstspring.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @Autowired
    private StudentAdaptor adaptor;
  private StudentService studentService;




    @PostMapping()
    public void save(@RequestBody StudentDto studentDto) {
        studentService.save(adaptor.convert(studentDto));
    }



}
