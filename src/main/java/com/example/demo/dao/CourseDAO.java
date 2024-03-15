package com.example.demo.dao;

import com.example.demo.entity.Course;

import java.util.List;

public interface CourseDAO {
    //Methods for the Course API
    List<Course> findCourses();

    void deleteStudentByID(int theId);

    void saveCourse(Course course);

    Course updateCourse(Course course);

    void deleteCourseByID(int theId);

    Course findCourseByID(int theId);

}
