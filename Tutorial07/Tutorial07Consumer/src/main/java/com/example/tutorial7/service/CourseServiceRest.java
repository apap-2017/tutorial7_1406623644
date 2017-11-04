package com.example.tutorial7.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.example.tutorial7.dao.CourseDAO;
import com.example.tutorial7.model.CourseModel;
import com.example.tutorial7.model.StudentModel;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@Primary
public class CourseServiceRest implements CourseService {

	@Autowired
	private CourseDAO courseDAO;
	
	@Override
    public     CourseModel    selectCourse   ( String id_course)
       {
         log . info    ( "REST   -   select   course   with   id_course  {}" ,id_course );              
       return courseDAO.selectCourse(id_course);
       }
	
	@Override
        public     List < CourseModel >    selectAllCourses ()        
		{
          log . info    ( "REST   -   select   all   course" );
          List<CourseModel> courses = courseDAO.selectAllCourse();
          return courses;
		}

    public void addCourse (StudentModel  student ){}

    public void deleteCourse  (String npm ){}
	
	public void updateStudent (StudentModel student )     {}

	public void addCourse ( String npm, String idCourse )  {}

}