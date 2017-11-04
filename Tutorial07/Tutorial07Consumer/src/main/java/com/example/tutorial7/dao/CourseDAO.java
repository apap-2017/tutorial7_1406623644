package com.example.tutorial7.dao;

import java.util.List;

import com.example.tutorial7.model.*;

public interface CourseDAO {
	

	CourseModel selectCourse(String id_course);

	List<CourseModel> selectAllCourse();
}