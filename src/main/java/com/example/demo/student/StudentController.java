package com.example.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/student")
public class StudentController {

  @GetMapping()
  public List<Student> getStudents() {
    return List.of(
        new Student(
            1L,
            "James Bond",
            "james@email.com",
            LocalDate.of(2000, Month.JANUARY, 5),
            21),
        new Student(
            2L,
            "Maria Jones",
            "maria@email.com",
            LocalDate.of(2004, Month.JANUARY, 5),
            17));
  }
  
}
