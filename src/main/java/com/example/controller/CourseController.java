package com.example.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.Exception.UserNotFoundException;
import com.example.Service.CourseService;
import com.example.course.Electronics;

@RestController
public class CourseController {
	private CourseService courseservice;
	@RequestMapping("/electronics")
	public List<Electronics> getAllCourses()
	{
		List<Electronics> course = courseservice.getAllCourses();
		
		if(course.size() <= 0)
			throw new UserNotFoundException("electronics device are not available, please update first.");
			
	  return course;
	}
	@GetMapping("/electronics/{id}")
	public Electronics getCourse(@PathVariable Integer id)
	{
		Electronics course = courseservice.getCourse(id);
		
		if(course ==  null)
			throw new UserNotFoundException("electronics device ID are not present");
			
	  return course;
	}
	@RequestMapping(method =RequestMethod.POST , value="/electronics" )
	public void addcourse(@RequestBody Electronics course)
	{
		courseservice.addcourse(course);
	}
	@RequestMapping(method =RequestMethod.PUT , value="/electronics/{id}" )
	public void updatecourse(@PathVariable Integer id ,@RequestBody Electronics course)
	{
		courseservice.updatecourse(id,course);
	}
	@RequestMapping(method =RequestMethod.DELETE , value="/electronics/{id}" )
	public void DeleteCourse(@PathVariable Integer id)
	{
		courseservice.deletecourse(id);
	}
}

