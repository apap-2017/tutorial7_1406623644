package com.example.tutorial7.service;

import java.util.List;

import com.example.tutorial7.model.CourseModel;

public interface CourseService
{
    CourseModel selectCourse (String id_course  );
    List<CourseModel> selectAllCourses ();


}