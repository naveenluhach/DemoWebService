package com.example.DemoWebService.service;

import com.example.DemoWebService.model.Student;
import com.example.DemoWebService.repository.StudentRepository;
//import com.example.DemoWebService.util.StudentDataAccess;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentService {
    /*
    Purpose: To interact between controller and data source/ data maintaining layer
     */

//   @Autowired
//   private StudentDataAccess studentDataAccess;

   @Autowired
   private StudentRepository studentRepository;

    public List<Student> getStudentList(){
            return studentRepository.findAll();
    }

    public int addStudent(Student student) {
        return studentRepository.save(student);
    }


    public int deleteStudentById(int rollid) {
        return studentRepository.deleteById((long) rollid);
    }
}
