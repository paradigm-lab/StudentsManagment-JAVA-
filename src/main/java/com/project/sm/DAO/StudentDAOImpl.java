package com.project.sm.DAO;

import com.project.sm.api.Student;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository // Help in exception handling
public class StudentDAOImpl implements StudentDAO{

    @Override
    public List<Student> loadStudent() {
        // I will write same logic to get me the studentData from the database
        
        return null;
    }

}
