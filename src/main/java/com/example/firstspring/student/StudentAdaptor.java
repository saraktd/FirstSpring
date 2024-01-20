package com.example.firstspring.student;

import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;



@Mapper(componentModel="Spring")
public interface StudentAdaptor {
    StudentEntity convert (StudentDto dto);
    StudentDto convert (StudentEntity dto);
}
