package com.example.tutorial7.dao;

import java.util.List;

import com.example.tutorial7.model.StudentModel;

public interface StudentDAO
{
	StudentModel selectStudent (String npm);
	List<StudentModel> selectAllStudents ();
}
