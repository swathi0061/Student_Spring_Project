package com.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Student_details;
import com.service.StudentService;

@RestController
@RequestMapping("student/details")
public class StudentController {

	@Autowired
	private StudentService serv;
	
	@GetMapping("/get_student")
	public Optional<Student_details> get_student(Integer stu_id){
		return serv.get_student(stu_id);
	}
	
	@PostMapping("/insert_student")
	public Student_details insert_student(@RequestBody Student_details stu_dto) {
		return serv.insert_student(stu_dto);
	}
	
	@PutMapping("/update_student")
	public Student_details update_student(@RequestBody Student_details stu_dto) {
		
		return serv.update_student(stu_dto);
	}
	
	@DeleteMapping("/delete_student")
	public void delete_student(Integer stu_id) {
		 serv.delete_student(stu_id);
	}
}
