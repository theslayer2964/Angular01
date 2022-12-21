package com.example.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.entity.Teacher;

@Service
public interface TeacherService {
	public Teacher addTeacher(Teacher techer);

	public String deleteTeacher(int teacherId);

	public Teacher updateTeacher(Teacher teacher);

	public Teacher getTeacherById(int id);

	public List<Teacher> getListTeacher();
}
