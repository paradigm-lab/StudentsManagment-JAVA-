package com.project.sm.service;

import com.project.sm.api.Student;

import java.util.List;

public interface StudentService {

    List<Student> loadStudent();

    void saveStudent(Student student);

    Student getStudent(int id);

    void update(Student student);

    void deleteStudent(int id);
}
