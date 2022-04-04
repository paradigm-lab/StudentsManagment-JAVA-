package com.project.sm.controllers;

import com.project.sm.DAO.StudentDAO;
import com.project.sm.api.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

// Presentation Layer
@Controller
public class StudentController {

    @Autowired
    StudentDAO studentDAO;

    //@GetMapping("/showStudent")
    @RequestMapping(value = "/showStudent", method = RequestMethod.GET)
    public String showStudentList() {

        // Call the DAO method to get the data
        List<Student> studentList = studentDAO.loadStudent();

        return "student-list";
    }

}
