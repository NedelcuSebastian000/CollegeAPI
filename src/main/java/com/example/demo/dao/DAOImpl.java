package com.example.demo.dao;

import com.example.demo.entity.*;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class DAOImpl implements StudentsDAO, InstructorDAO, ReviewDAO, CourseDAO,CommonMethodsDAO {
    EntityManager entityManager;

    @Autowired
    public DAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Student> findStudents() {
        // Find all the students
        TypedQuery<Student> query = entityManager.createQuery("SELECT s FROM Student s", Student.class);
        // Retrieve the students
        List<Student> list = query.getResultList();
        return list;
    }

    @Override
    public Student findStudentByID(int theId) {
        return entityManager.find(Student.class, theId);
    }

    @Transactional
    @Override
    public void saveStudent(Student student) {
        entityManager.persist(student);

    }

    @Transactional
    @Override
    public Student updateStudent(Student student) {
        return entityManager.merge(student);
    }

    @Transactional
    @Override
    public void deleteStudentByID(int theId) {
        //find the student by id
        Student student = entityManager.find(Student.class, theId);
        //delete the student
        entityManager.remove(student);
    }

    @Override
    public List<Course> findCourses() {
        // Find the courses
        TypedQuery<Course> query = entityManager.createQuery("SELECT c FROM Course c", Course.class);
        // Retrieve the courses
        List<Course> list = query.getResultList();
        return list;
    }

    @Transactional
    @Override
    public void saveCourse(Course course) {
        entityManager.persist(course);
    }

    @Transactional
    @Override
    public Course updateCourse(Course course) {
        return entityManager.merge(course);
    }

    @Transactional
    @Override
    public void deleteCourseByID(int theId) {
        //find the course by
        Course course = entityManager.find(Course.class, theId);
        //remove the course
        entityManager.remove(course);
    }

    @Override
    public Course findCourseByID(int theId) {
        return entityManager.find(Course.class, theId);
    }

    @Override
    public Course findCourseAndStudentsByCourseId(int id) {
        //Find all the students that are enrolled to a course
        TypedQuery<Course> query = entityManager.createQuery("select c from Course c " + "JOIN FETCH c.studentins " +
                "where c.id=:data", Course.class
        );
        //Retrieve the data
        query.setParameter("data", id);
        Course course = query.getSingleResult();
        return course;
    }

    @Override
    public List<Instructor> findInstructors() {
        TypedQuery<Instructor> query = entityManager.createQuery("SELECT i FROM Instructor i", Instructor.class);
        return query.getResultList();
    }

    @Override
    public Instructor findInstructorById(int theId) {
        return entityManager.find(Instructor.class, theId);
    }

    @Transactional
    @Override
    public void saveInstructor(Instructor instructor) {
        entityManager.persist(instructor);
    }

    @Override
    public Instructor updateInstructor(Instructor instructor) {
        return entityManager.merge(instructor);
    }

    @Override
    public void deleteInstructorById(int theId) {
        Instructor instructor = entityManager.find(Instructor.class, theId);
        entityManager.remove(instructor);
    }

    @Override
    public List<Instructor_detail> findInstructorDetails() {
        TypedQuery<Instructor_detail> query = entityManager.createQuery("SELECT id FROM Instructor_detail id", Instructor_detail.class);
        return query.getResultList();
    }

    @Override
    public Instructor_detail findInstructorDetailById(int theId) {
        return entityManager.find(Instructor_detail.class, theId);
    }

    @Transactional
    @Override
    public void saveInstructorDetail(Instructor_detail instructorDetail) {
        entityManager.persist(instructorDetail);
    }

    @Override
    public Instructor_detail updateInstructorDetail(Instructor_detail instructorDetail) {
        return entityManager.merge(instructorDetail);
    }

    @Override
    public void deleteInstructorDetailById(int theId) {
        Instructor_detail instructorDetail = entityManager.find(Instructor_detail.class, theId);
        entityManager.remove(instructorDetail);
    }

    @Override
    public List<Review> findReviews() {
        TypedQuery<Review> query = entityManager.createQuery("SELECT r FROM Review r", Review.class);
        return query.getResultList();
    }

    @Override
    public Review findReviewById(int theId) {
        return entityManager.find(Review.class, theId);
    }

    @Transactional
    @Override
    public void saveReview(Review review) {
        entityManager.persist(review);
    }

    @Override
    public Review updateReview(Review review) {
        return entityManager.merge(review);
    }

    @Override
    public void deleteReviewById(int theId) {
        Review review = entityManager.find(Review.class, theId);
        entityManager.remove(review);
    }
}
