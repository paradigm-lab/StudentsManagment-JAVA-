package com.project.sm.service;

import com.project.sm.DAO.StudentDAO;
import com.project.sm.api.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service // A Special annotation for service class
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentDAO studentDAO;

    @Override
    public List<Student> loadStudent() {

        List<Student> studentList = studentDAO.loadStudent();

        return studentList;

    }

    @Override
    public void saveStudent(Student student) {

        // Write the business logic
        // Company Criteria
        if (student.getCountry().equals("Tanzania")) {
            System.out.println("Email Sent: " + student.getName());
        }

        studentDAO.saveStudent(student);
    }

    @Override
    public Student getStudent(int id) {

        return studentDAO.getStudent(id);
    }

    @Override
    public void update(Student student) {
        studentDAO.update(student);
    }

}
