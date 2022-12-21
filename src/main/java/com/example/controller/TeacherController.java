package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Teacher;
import com.example.service.TeacherService;

@RestController
@RequestMapping("/api/teacher")
@EnableCaching
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class TeacherController {

	@Autowired
	private TeacherService customerService;
	
	@PostMapping
	public Teacher addCustomer(@RequestBody Teacher teacher) {
		customerService.addTeacher(teacher);
		return teacher;
	}

	@DeleteMapping("/{userId}")
	public String deleteCustomer(@PathVariable int teacherId) {
		customerService.deleteTeacher(teacherId);
		return "xoá thành công id" + teacherId;
	}

	@PostMapping("/update")
	public Teacher updateCustomer(@RequestBody Teacher teacher) {
		Teacher teacher2 = customerService.updateTeacher(teacher);
		return teacher2;
	}

	@GetMapping("/{userId}")
	public Teacher getCustomerById(@PathVariable int id) {
		Teacher customer = customerService.getTeacherById(id);
		return customer;
	}

	@GetMapping
	public List<Teacher> getListCustomer() {
		List<Teacher> list = customerService.getListTeacher();
		return list;
	}
}
