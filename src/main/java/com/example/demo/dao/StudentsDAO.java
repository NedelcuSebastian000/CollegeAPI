package com.example.demo.dao;

import com.example.demo.entity.Course;
import com.example.demo.entity.Student;

import java.util.List;

public interface StudentsDAO {
    //Methods for the Student API
    List<Student> findStudents();

    Student findStudentByID(int theId);

    void saveStudent(Student student);

    Student updateStudent(Student student);


    //Common Student/Course API methods


    //


}