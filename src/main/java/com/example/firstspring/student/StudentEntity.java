package com.example.firstspring.student;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDate;


@Entity
@Table
@NoArgsConstructor
@AllArgsConstructor
public class StudentEntity {
    @Id
    private Long id;
    private String name;
    private String email;
    private LocalDate dob;
    private Integer age;

}
