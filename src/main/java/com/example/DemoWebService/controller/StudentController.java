package com.example.DemoWebService.controller;

import com.example.DemoWebService.model.Student;
import com.example.DemoWebService.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("student")
public class StudentController {

    /*
    I want to read the data
    I want to add to the existing data
    I want to manipulate the data - update and delete
    //List<Student> studentList = new ArrayList<>();
    1xx-informational
    2xx-success
    3xx-redirection
    4xx-client errors
    5xx-server error
     */
    @Autowired
    private StudentService studentService;

    @RequestMapping("/students")
    public ResponseEntity<List<Student>> getAllStudents(){
        return new ResponseEntity<List<Student>>(studentService.getStudentList(), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST, value="/addStudent")
    public ResponseEntity<Integer> addStudent(@RequestBody Student student){
        //studentService.addStudent(student);
        return new ResponseEntity<Integer>((Integer) studentService.addStudent(student), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.DELETE, value="/deleteStudent/{rollid}")
    public ResponseEntity<Integer> deleteStudent(@PathVariable("rollid") int rollid){
        return new ResponseEntity<>(studentService.deleteStudentById(rollid), HttpStatus.OK);
    }



    //client ------http(s)-------server[security layer(oauth) + spring boot layer+storage mysql+redis+kafka]


}
