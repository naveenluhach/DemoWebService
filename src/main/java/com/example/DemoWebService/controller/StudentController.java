package com.example.DemoWebService.controller;

import com.example.DemoWebService.model.Student;
import com.example.DemoWebService.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
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
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(studentService.getStudentList());
    }

    @RequestMapping(method = RequestMethod.POST, value="/addStudent")
    public void addStudent(@RequestBody Student student){
        studentService.addStudent(student);
    }

    @RequestMapping(method = RequestMethod.DELETE, value="/deleteStudent/{rollid}")
    public void deleteStudent(@PathVariable("rollid") int rollid){
        studentService.deleteStudent(rollid);
    }


}
