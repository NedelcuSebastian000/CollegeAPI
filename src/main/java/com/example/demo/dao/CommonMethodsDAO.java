package com.example.demo.dao;

import com.example.demo.entity.Course;

public interface CommonMethodsDAO {
    public Course findCourseAndStudentsByCourseId(int id);
}
