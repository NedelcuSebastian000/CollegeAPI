package com.example.demo.service;

import com.example.demo.dao.*;
import com.example.demo.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CollegeServiceImpl implements CollegeService {
    StudentsDAO studentsDAO;
    CourseDAO courseDAO;
    ReviewDAO reviewDAO;
    InstructorDAO instructorDAO;
    CommonMethodsDAO commonMethodsDAO;

    @Autowired
    public CollegeServiceImpl(StudentsDAO studentsDAO, CourseDAO courseDAO, ReviewDAO reviewDAO, InstructorDAO instructorDAO, CommonMethodsDAO commonMethodsDAO) {
        this.studentsDAO = studentsDAO;
        this.courseDAO = courseDAO;
        this.reviewDAO = reviewDAO;
        this.instructorDAO = instructorDAO;
        this.commonMethodsDAO=commonMethodsDAO;
    }


    @Override
    public List<Student> findStudents() {
        return studentsDAO.findStudents();
    }

    @Override
    public Student findStudentByID(int theId) {
        return studentsDAO.findStudentByID(theId);
    }

    @Override
    public void saveStudent(Student student) {
        studentsDAO.saveStudent(student);
    }

    @Override
    public Student updateStudent(Student student) {
        return studentsDAO.updateStudent(student);
    }

    @Override
    public void deleteStudentByID(int theId) {
        courseDAO.deleteStudentByID(theId);

    }

    @Override
    public void saveCourse(Course course) {
        courseDAO.saveCourse(course);
    }

    @Override
    public List<Course> findCourses() {
        return courseDAO.findCourses();
    }

    @Override
    public Course updateCourse(Course course) {
        return courseDAO.updateCourse(course);
    }

    @Transactional
    @Override
    public void deleteCourseByID(int theId) {
        courseDAO.deleteCourseByID(theId);
    }

    @Override
    public Course findCourseByID(int theId) {
        return courseDAO.findCourseByID(theId);
    }

    @Override
    public Course findCourseandstudentsByCourseId(int id) {
        return commonMethodsDAO.findCourseAndStudentsByCourseId(id);
    }


    public List<Review> findReviews() {
        return reviewDAO.findReviews();
    }

    @Override
    public Review findReviewById(int theId) {
        return reviewDAO.findReviewById(theId);
    }

    @Transactional
    @Override
    public void saveReview(Review review) {
        reviewDAO.saveReview(review);
    }

    @Transactional
    @Override
    public Review updateReview(Review review) {
        return reviewDAO.updateReview(review);
    }

    @Transactional
    @Override
    public void deleteReviewById(int theId) {
        reviewDAO.deleteReviewById(theId);
    }

    @Override
    public List<Instructor> findInstructors() {
        return instructorDAO.findInstructors();
    }

    @Override
    public Instructor findInstructorById(int theId) {
        return instructorDAO.findInstructorById(theId);
    }

    @Override
    public List<Instructor_detail> findInstructorDetails() {
        return instructorDAO.findInstructorDetails();
    }

    @Transactional
    @Override
    public void deleteInstructorDetailById(int theId) {
        instructorDAO.deleteInstructorDetailById(theId);
    }

    @Transactional
    @Override
    public void saveInstructorDetail(Instructor_detail instructorDetail) {
        instructorDAO.saveInstructorDetail(instructorDetail);
    }

    @Transactional
    @Override
    public Instructor_detail updateInstructorDetail(Instructor_detail instructorDetail) {
        return instructorDAO.updateInstructorDetail(instructorDetail);
    }

    @Override
    public Instructor_detail findInstructorDetailById(int theId) {
        return instructorDAO.findInstructorDetailById(theId);
    }

    @Transactional
    @Override
    public void saveInstructor(Instructor instructor) {
        instructorDAO.saveInstructor(instructor);
    }

    @Transactional
    @Override
    public Instructor updateInstructor(Instructor instructor) {
        return instructorDAO.updateInstructor(instructor);
    }

    @Transactional
    @Override
    public void deleteInstructorById(int theId) {
        instructorDAO.deleteInstructorById(theId);
    }


}
