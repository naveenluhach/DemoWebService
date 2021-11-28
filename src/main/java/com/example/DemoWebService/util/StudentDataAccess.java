//package com.example.DemoWebService.util;
//
//import com.example.DemoWebService.model.Student;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.stereotype.Repository;
//
//import java.sql.*;
//import java.util.ArrayList;
//import java.util.List;
//
//@Repository
//public class StudentDataAccess {
//
//    @Autowired
//    DatabaseConnectionManager databaseConnectionManager;
//
//    public void getStudentDetails(){
//        //DatabaseConnectionManager databaseConnectionManager = new DatabaseConnectionManager();
//        try{
//            Connection connection = databaseConnectionManager.getConnection();
//            Statement statement = connection.createStatement();
//            ResultSet resultSet = statement.executeQuery("SELECT count(*) FROM abcd");
//            while(resultSet.next()){
//                System.out.println("The output we got is " + resultSet.getInt(1));
//            }
//        }catch(SQLException sqlException){
//            sqlException.printStackTrace();
//        }
//    }
//
//    public List<Student> getStudentList() throws SQLException{
//        //DatabaseConnectionManager databaseConnectionManager = new DatabaseConnectionManager();
//        List<Student> studentList = new ArrayList<>();
//        try{
//            Connection connection = databaseConnectionManager.getConnection();
//            Statement statement = connection.createStatement();
//            ResultSet resultSet = statement.executeQuery("SELECT * FROM student limit 5");
//            while(resultSet.next()){
//                Student student = new Student();
//                student.setId(resultSet.getInt("id"));
//                student.setName(resultSet.getString("name"));
//                student.setAge(resultSet.getString("age"));
//                student.setCity(resultSet.getString("city"));
//                student.setState(resultSet.getString("state"));
//                studentList.add(student);
//                //processing
//            }
//        }catch(SQLException sqlException){
//            throw sqlException;
//        }
//        return studentList;
//    }
//
//    public int addStudent(Student student) {
//        //DatabaseConnectionManager databaseConnectionManager = new DatabaseConnectionManager();
//        int rowCount =0;
//        try{
//            Connection connection = databaseConnectionManager.getConnection();
//            //Statement statement = connection.createStatement();
//            String sql = "INSERT INTO student (name, age, city, state) VALUES (?,?,?,?)";
//            PreparedStatement preparedStatement = connection.prepareStatement(sql);
//            preparedStatement.setString(1, student.getName());
//            preparedStatement.setString(2, student.getAge());
//            preparedStatement.setString(3, student.getCity());
//            preparedStatement.setString(4, student.getState());
//            rowCount = preparedStatement.executeUpdate();
//            //ResultSet resultSet = statement.executeQuery("INSERT INTO student (name, age, city, state) VALUES (?,?,?,?)");
//
//        }catch(SQLException sqlException){
//            sqlException.printStackTrace();
//        }
//        return rowCount;
//    }
//}
