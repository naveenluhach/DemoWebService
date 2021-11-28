package com.example.DemoWebService.repository;

import com.example.DemoWebService.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class JdbcStudentRepository implements StudentRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int save(Student student) {
        //"INSERT INTO student (name, age, city, state) VALUES (?,?,?,?)",
        return jdbcTemplate.update("INSERT INTO student (name, age, city, state) VALUES (?,?,?,?)", new Object[]{
                student.getName(), student.getAge(), student.getCity(), student.getState()
        });
    }

    @Override
    public int update(Student student) {
        return jdbcTemplate.update("UPDATE student SET age=? where id=?", new Object[]{
                student.getAge(), student.getId()
        });
    }

    @Override
    public Student findById(Long id) {
        try {
            Student student = jdbcTemplate.queryForObject("SELECT * FROM student where id=?",
                    BeanPropertyRowMapper.newInstance(Student.class), id);
            return student;
        }catch(Exception exception){
            System.out.print(exception);
            return null;
        }
    }

    @Override
    public int deleteById(Long id) {
        return jdbcTemplate.update("DELETE FROM student where id=?", id);
    }

    @Override
    public List<Student> findAll() {
        return jdbcTemplate.query("SELECT * FROM student", BeanPropertyRowMapper.newInstance(Student.class));
    }
}
