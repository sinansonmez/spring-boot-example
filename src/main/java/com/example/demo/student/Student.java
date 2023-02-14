package com.example.demo.student;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table
public class Student {
  @Id
  @SequenceGenerator(name = "student_squence", sequenceName = "student_squence", allocationSize = 1)
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "student_squence")
  private Long id;
  private String name;
  private String email;
  private LocalDate dob;
  private Integer age;

  public Student() {
  }

  public Student(
      Long id,
      String name,
      String email,
      LocalDate dob,
      Integer age) {
    this.id = id;
    this.name = name;
    this.email = email;
    this.dob = dob;
    this.age = age;
  }

  public Student(
      String name,
      String email,
      LocalDate dob,
      Integer age) {
    this.name = name;
    this.email = email;
    this.dob = dob;
    this.age = age;
  }

  public Long getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public LocalDate getDob() {
    return dob;
  }

  public void setDob(LocalDate dob) {
    this.dob = dob;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  @Override
  public String toString() {
    return "Student{" +
        "id=" + id +
        ", name='" + name + '\'' +
        ", email='" + email + '\'' +
        ", dob=" + dob +
        ", age=" + age +
        '}';
  }

}
