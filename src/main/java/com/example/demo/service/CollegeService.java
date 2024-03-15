package com.example.demo.service;

import com.example.demo.entity.*;

import java.util.List;

public interface CollegeService {
    //Student
    List<Student> findStudents();

    Student findStudentByID(int theId);

    void saveStudent(Student student);

    Student updateStudent(Student student);

    void deleteStudentByID(int theId);

    //Course
    void saveCourse(Course course);

    List<Course> findCourses();

    Course updateCourse(Course course);

    void deleteCourseByID(int theId);

    Course findCourseByID(int theId);

    //Common Methods
    public Course findCourseandstudentsByCourseId(int id);


    //Reviews
    List<Review> findReviews();

    void deleteReviewById(int theId);

    void saveReview(Review review);

    Review updateReview(Review review);

    Review findReviewById(int theId);

    //Instructor
    List<Instructor> findInstructors();

    void deleteInstructorById(int theId);

    void saveInstructor(Instructor instructor);

    Instructor updateInstructor(Instructor instructor);

    Instructor findInstructorById(int theId);

    //Instructor_detail
    List<Instructor_detail> findInstructorDetails();

    void deleteInstructorDetailById(int theId);

    void saveInstructorDetail(Instructor_detail instructorDetail);

    Instructor_detail updateInstructorDetail(Instructor_detail instructorDetail);

    Instructor_detail findInstructorDetailById(int theId);

}
