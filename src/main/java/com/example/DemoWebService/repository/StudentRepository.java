package com.example.DemoWebService.repository;

import com.example.DemoWebService.model.Student;

import java.util.List;

public interface StudentRepository {

    int save(Student student);

    int update(Student student);

    Student findById(Long id);

    int deleteById(Long id);

    List<Student> findAll();
}
