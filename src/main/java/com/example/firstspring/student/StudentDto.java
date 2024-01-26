package com.example.firstspring.student;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentDto {
    @Id
    private Long id;
    private String name;
    private String email;
    private LocalDate dob;
    private Integer age;
    private Integer version;
}
