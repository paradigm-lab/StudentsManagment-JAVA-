package com.project.sm.controllers;

import com.project.sm.DAO.StudentDAO;
import com.project.sm.api.Student;
import com.project.sm.api.StudentDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

// Presentation Layer
@Controller
public class StudentController {

    @Autowired
    StudentDAO studentDAO;

    //@GetMapping("/showStudent")
    @RequestMapping(value = "/showStudent", method = RequestMethod.GET)
    public String showStudentList(Model model) {

        // Call the DAO method to get the data
        List<Student> studentList = studentDAO.loadStudent();

        for (Student tempStudent : studentList) {

            System.out.println(tempStudent);

        }

        model.addAttribute("students", studentList);

        return "student-list";
    }

    @RequestMapping(value = "/showAddStudentPage", method = RequestMethod.GET)
    public String addStudent(Model model) {

        StudentDTO studentDTO = new StudentDTO();

        model.addAttribute("student", studentDTO);

        return "add-student";
    }


    @ResponseBody
    @RequestMapping(value = "/save-student", method = RequestMethod.GET)
    public String saveStudent (Student student){

        // Write the logic to save the data(studentDTO) to the database
        System.out.println(student);

        return "student saved...";
    }
}
