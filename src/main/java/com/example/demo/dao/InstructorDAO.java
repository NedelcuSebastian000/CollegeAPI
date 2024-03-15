package com.example.demo.dao;

import com.example.demo.entity.Instructor;
import com.example.demo.entity.Instructor_detail;

import java.util.List;

public interface InstructorDAO {
    List<Instructor> findInstructors();
    void deleteInstructorById(int theId);
    void saveInstructor(Instructor instructor);
    Instructor updateInstructor(Instructor instructor);
    Instructor findInstructorById(int theId);


    //Instructor_detail Methods


    List<Instructor_detail> findInstructorDetails();

    void deleteInstructorDetailById(int theId);

    void saveInstructorDetail(Instructor_detail instructorDetail);

    Instructor_detail updateInstructorDetail(Instructor_detail instructorDetail);

    Instructor_detail findInstructorDetailById(int theId);

}
