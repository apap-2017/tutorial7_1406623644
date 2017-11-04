package com.example.tutorial7.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.tutorial7.model.CourseModel;
import com.example.tutorial7.service.CourseService;

@RestController
@RequestMapping("/rest")
public class CourseRestController {
	@Autowired
	CourseService courseService;
	
	@RequestMapping("/course/view/{id_course}")
    public CourseModel viewPath (Model model,
            @PathVariable(value = "id_course") String id_course)
    {
        CourseModel course = courseService.selectCourse (id_course);
        CourseModel courseNot = courseService.selectCourse("0");
        if (course != null) {
            model.addAttribute ("course", course);
            return course;
        } else {
            model.addAttribute ("course", course);
            return courseNot;
        }
    }
	
	 @RequestMapping("/course/viewall")
	    public List<CourseModel> view (Model model)
	    {
	        List<CourseModel> courses = courseService.selectAllCourses();
	        model.addAttribute ("courses", courses);

	        return courses;
	    }
	
	
}
