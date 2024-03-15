package com.example.demo.rest;

import com.example.demo.entity.*;
import com.example.demo.service.CollegeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CollegeRestController {
    private CollegeService collegeService;

    public CollegeRestController(CollegeService collegeService) {
        this.collegeService = collegeService;
    }

    @GetMapping("/students/{studentID}")
    public Student getSingleStudent(@PathVariable int studentID){
        Student student=collegeService.findStudentByID(studentID);
        if(student==null){
            throw new GeneralNotFoundException("Student id no found - "+studentID);
        }
        return student;
    }
    @GetMapping("/students")
    public List<Student> getStudents() {
        List<Student>students=collegeService.findStudents();
        if(students==null){
            throw new GeneralNotFoundException("there are no students yet ");
        }
        return students;
    }

    @GetMapping("/courses/{courseId}/students")
    public Course findCourseandstudentsByCourseId(@PathVariable int courseId) {
        Course course = collegeService.findCourseandstudentsByCourseId(courseId);
        if (course == null) {
            throw new GeneralNotFoundException("Course id no found - "+courseId);
        }
        return course;
    }

    @PostMapping("/students")
    public void addStudent(@RequestBody Student student) {
        student.setId(0);
        collegeService.saveStudent(student);

    }

    @PutMapping("/students/")
    public Student updateStudent(@RequestBody Student student) {
        Student tempStudent = collegeService.updateStudent(student);
        System.out.println("The student was updated successfully");
        return tempStudent;
    }

    @DeleteMapping("/students/{studentId}")
    public String deleteStudent(@PathVariable int studentId) {
        Student tempStudent = collegeService.findStudentByID(studentId);
        collegeService.deleteStudentByID(studentId);
        return "the student " + tempStudent + "has been deleted";
    }

    @GetMapping("/courses/{courseID}")
    public Course getSingleCourse(@PathVariable int courseID){
        Course course=collegeService.findCourseByID(courseID);
        if(course==null){
            throw new GeneralNotFoundException("course not found  "+courseID);

        }
        return course;
    }
    @GetMapping("/courses")
    public List<Course> getCourses() {
        List<Course>courses=collegeService.findCourses();
        if(courses==null){
            throw new GeneralNotFoundException("there are no courses yet ");
        }
        return courses;
    }

    @PostMapping("/courses")
    public void addCourse(@RequestBody Course course) {
        course.setId(0);
        collegeService.saveCourse(course);
        System.out.println("the course was added to the list of courses");
    }

    @PutMapping("/Courses/")
    public Course updateCourse(@RequestBody Course course) {
        Course tempCourse = collegeService.updateCourse(course);
        System.out.println("The course was updated successfully");
        return tempCourse;
    }

    @DeleteMapping("/courses/{courseID}")
    public String deleteCourse(@PathVariable int courseID) {
        Course temp = collegeService.findCourseByID(courseID);
        collegeService.deleteStudentByID(courseID);
        return "the course " + temp + "has been deleted";
    }

    @GetMapping("/Reviews/{reviewID}")
    public Review getSingleReview(@PathVariable int reviewID){
        Review review=collegeService.findReviewById(reviewID);
        if(review==null){
            throw new GeneralNotFoundException("review not found "+reviewID);
        }
        return review;
    }
    @GetMapping("/Reviews")
    public List<Review> getReviews() {
        List<Review>reviews=collegeService.findReviews();
        if(reviews==null){
            throw new GeneralNotFoundException("there are no reviews yet ");
        }
        return reviews;
    }

    @PostMapping("/Reviews")
    public void addReview(@RequestBody Review review) {
        review.setId(0);
        collegeService.saveReview(review);
        System.out.println("Done!");
    }

    @PutMapping("/Reviews/")
    public Review updateReview(@RequestBody Review review) {
        Review tempReview = collegeService.updateReview(review);
        System.out.println("The review was updated successfully");
        return tempReview;
    }

    @DeleteMapping("/Reviews/{reviewID}")
    public String deleteReview(@PathVariable int reviewID) {
        Review temp = collegeService.findReviewById(reviewID);
        collegeService.deleteReviewById(reviewID);
        return "the review " + temp + "has been deleted";
    }


    @GetMapping("/Instructors/{instructorID}")
    public Instructor getSingleInstructor(@PathVariable int instructorID){
        Instructor instructor=collegeService.findInstructorById(instructorID);
        if(instructor==null){
            throw new GeneralNotFoundException("instructor not found "+instructorID);
        }
        return instructor;
    }
    @GetMapping("/Instructors")
    public List<Instructor> getInstructors() {
        List<Instructor>instructors=collegeService.findInstructors();
        if(instructors==null){
            throw new GeneralNotFoundException("there are no intructors to the list");
        }
        return instructors;
    }

    @PostMapping("/Instructors")
    public void addInstructor(@RequestBody Instructor instructors) {
        instructors.setId(0);
        collegeService.saveInstructor(instructors);
        System.out.println("Done!");
    }

    @PutMapping("/Instructors/")
    public Instructor updateInstructor(@RequestBody Instructor instructor) {
        Instructor tempInstructor = collegeService.updateInstructor(instructor);
        System.out.println("The review was updated successfully");
        return tempInstructor;
    }

    @DeleteMapping("/Instructors/{instructorID}")
    public String deleteInstructor(@PathVariable int instructorID) {
        Instructor temp = collegeService.findInstructorById(instructorID);
        collegeService.deleteInstructorById(instructorID);
        return "the Instructor " + temp + "has been deleted";
    }

    @GetMapping("/Instructor_detail/{InstructorDetailID}")
    public Instructor_detail getSingleInstructorDetail(@PathVariable int InstructorDetailID){
        Instructor_detail instructorDetail=collegeService.findInstructorDetailById(InstructorDetailID);
        if(instructorDetail==null){
            throw new GeneralNotFoundException("this instructor doesn_t have a detail "+InstructorDetailID);
        }
        return instructorDetail;
    }
    @GetMapping("/Instructor_detail")
    public List<Instructor_detail> getInstructorDetail() {
        List<Instructor_detail>instructorDetails=collegeService.findInstructorDetails();
        if(instructorDetails==null){
            throw new GeneralNotFoundException("there are no details about any instructor");
        }
        return instructorDetails;
    }

    @PostMapping("/Instructor_detail")
    public void addInstructorDetail(@RequestBody Instructor_detail instructorDetail) {
        instructorDetail.setId(0);
        collegeService.saveInstructorDetail(instructorDetail);
        System.out.println("Done!");
    }

    @PutMapping("/Instructor_detail/")
    public Instructor updateInstructorDetail(@RequestBody Instructor instructor) {
        Instructor tempInstructor = collegeService.updateInstructor(instructor);
        System.out.println("The review was updated successfully");
        return tempInstructor;
    }

    @DeleteMapping("/Instructor_detail/{InstructorDetailID}")
    public String deleteInstructorDetail(@PathVariable int InstructorDetailID) {
        Instructor_detail temp = collegeService.findInstructorDetailById(InstructorDetailID);
        collegeService.deleteInstructorDetailById(InstructorDetailID);
        return "the details  " + temp + "have been deleted";
    }




    @ExceptionHandler
    public ResponseEntity<GeneralErrorResponse> handleException(GeneralNotFoundException exception){
        GeneralErrorResponse error=new GeneralErrorResponse();
        error.setStatus(HttpStatus.NOT_FOUND.value());
        error.setMessage(exception.getMessage());
        error.setTimeStamp(System.currentTimeMillis());
        return new ResponseEntity<>(error,HttpStatus.NOT_FOUND);
    }


    @ExceptionHandler
    public ResponseEntity<GeneralErrorResponse> handleException(Exception exception){
        GeneralErrorResponse error=new GeneralErrorResponse();
        error.setStatus(HttpStatus.BAD_REQUEST.value());
        error.setMessage(exception.getMessage());
        error.setTimeStamp(System.currentTimeMillis());
        return new ResponseEntity<>(error,HttpStatus.BAD_REQUEST);
    }
}
