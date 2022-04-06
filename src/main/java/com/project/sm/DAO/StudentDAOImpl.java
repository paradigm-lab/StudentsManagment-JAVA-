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
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Student> loadStudent() {

        List<Student> studentList = new ArrayList<Student>();

        String sql = "SELECT * FROM students";

        // I will write same logic to get me the studentData from the database
        List<Student> theListOfStudent = jdbcTemplate.query(sql, new StudentRowMapper());


        return theListOfStudent;
    }

    @Override
    public void saveStudent(Student student) {
        // Write the logic to store the student object into the database

        // Object is the parent for every class in java so we can store any kind of object inside that!!
        Object[] sqlParameters = {student.getName(), student.getMobile(), student.getCountry()};

        String sql = "INSERT INTO students (name, mobile, country) VALUE (?, ?, ?)";

        jdbcTemplate.update(sql, sqlParameters);

        System.out.println("1 record updated....");

    }

}
