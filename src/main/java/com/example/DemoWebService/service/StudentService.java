package com.example.DemoWebService.service;

import com.example.DemoWebService.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentService {
    /*
    Purpose: To interact between controller and data source/ data maintaining layer
     */

    private List<Student> studentList = new ArrayList<>(Arrays.asList(new Student(1, "studentName", "cs"), new Student(2, "studentName2", "mech")));

    public List<Student> getStudentList(){
        return studentList;
    }

    public void addStudent(Student student) {
        if(student.getName()!="") {
            studentList.add(student);
        }else {
            System.out.println("name is empty, class name, addStudent");
            //write to file some text file.
        }
    }

    public void deleteStudent(int id) {
        studentList = studentList.stream().filter(student->student.getRollid()!=id).collect(Collectors.toList());

//        studentList.stream().filter(student->student.getRollid()!=id).forEach(student -> {
//            studentList.remove(student);
//        });
    }
}
