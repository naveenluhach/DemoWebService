package com.example.DemoWebService.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


@Component
public class DatabaseConnectionManager {

    @Value("${spring.datasource.url}")
    public String url;

    @Value("${spring.datasource.username}")
    public String username;

    @Value("${spring.datasource.password}")
    public String password;


//    public DatabaseConnectionManager(){
//        this.url = "jdbc:mysql://localhost:3306/university";
//        this.password="qwertyuiop";
//        this.username="root";
//    }

    public Connection getConnection() throws SQLException{
        return DriverManager.getConnection(this.url, this.username, this.password);
    }
}
