package com.project.sm.controllers;

import com.project.sm.DAO.StudentDAO;
import com.project.sm.api.Student;
import com.project.sm.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// Presentation Layer
@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    //@GetMapping("/showStudent")
    @RequestMapping(value = "/showStudent", method = RequestMethod.GET)
    public String showStudentList(Model model) {

        // Call the service to get the data
        List<Student> studentList = studentService.loadStudent();

        /*
        for (Student tempStudent : studentList) {

            System.out.println(tempStudent);

        } */

        model.addAttribute("students", studentList);

        return "student-list";
    }

    @RequestMapping(value = "/showAddStudentPage", method = RequestMethod.GET)
    public String addStudent(Model model) {

        Student student = new Student();

        model.addAttribute("student", student);

        return "add-student";
    }


    // Data Binding is done in this method
    @RequestMapping(value = "/save-student", method = RequestMethod.POST)
    public String saveStudent (Student student){

        // Write the logic to save the data(studentDTO) to the database
        System.out.println(student);

        // Doing a condition check
        // if the user does have an id -> do an update
        // if the user doesn't have an id then do an insert

        if (student.getId() == 0) {
            // Do a service call to save the students
            // Insert a new record
            studentService.saveStudent(student);
        }   else {
            // if id is not 0, if we already have and id do an update
            studentService.update(student);
        }


        return "redirect:/showStudent";
    }


    @RequestMapping(value = "/updateStudent", method = RequestMethod.GET)
    public String updateStudent(@RequestParam("userId") int id, Model model){

        // We should give the user object who clicked on the update button
        System.out.println("Looking data for the student having id :" + id);

        Student theStudent = studentService.getStudent(id);
        System.out.println(theStudent);

        model.addAttribute("student", theStudent);

        return "add-student";
    }

    @RequestMapping(value = "/deleteStudent", method = RequestMethod.GET)
    public String deleteStudent(@RequestParam("userId") int id){

        // Capture the id of the student whom you are trying to delete
        // Once captured the id, do a service call to delete the student
        studentService.deleteStudent(id);

        return "add-student";
    }
    /*
    @ResponseBody
    @GetMapping("/thankyou")
    public String thankYou() {

        return "Thank you... Your record has been added to the database";
    } */


}
