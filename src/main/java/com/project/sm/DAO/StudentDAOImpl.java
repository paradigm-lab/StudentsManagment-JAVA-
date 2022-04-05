package com.project.sm.DAO;

import com.project.sm.api.Student;
import com.project.sm.rowmapper.StudentRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;



// DAO layer
@Repository // Help in exception handling
public class StudentDAOImpl implements StudentDAO{

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public List<Student> loadStudent() {

        List<Student> studentList = new ArrayList<Student>();

        String sql = "SELECT * FROM students";

        // I will write same logic to get me the studentData from the database
        List<Student> theListOfStudent = jdbcTemplate.query(sql, new StudentRowMapper());


        return theListOfStudent;
    }

}
