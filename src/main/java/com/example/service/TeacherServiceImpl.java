package com.example.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Teacher;
import com.example.repository.TeacherRepository;

@Service
public class TeacherServiceImpl implements TeacherService {
	@Autowired
	private TeacherRepository teacherRepository;
	@Override
	@Transactional
	public Teacher addTeacher(Teacher teacher) {
		return teacherRepository.save(teacher);
	}

	@Override
	@Transactional
	public String deleteTeacher(int teacherId) {
		// TODO Auto-generated method stub
		teacherRepository.deleteById(teacherId);
		return "xoa thanh cong id" + teacherId;
	}

	@Override
	@Transactional
	public Teacher updateTeacher(Teacher teacher) {
		Teacher Customer2 = teacherRepository.saveAndFlush(teacher);
		return Customer2;
	}

	@Override
	@Transactional
	public Teacher getTeacherById(int id) {
		Teacher teacher = teacherRepository.findById(id).get();
		return teacher;
	}

	@Override
	@Transactional
	public List<Teacher> getListTeacher() {
		List<Teacher> list = teacherRepository.findAll();
		return list;
	}
}
