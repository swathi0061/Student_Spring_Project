package com.service;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Student_details;
import com.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository stu_repo;
	
	public Optional<Student_details> get_student(Integer stu_id){
		return stu_repo.findById(stu_id);
	}
	
	public Student_details insert_student(Student_details stu_dto) {
		return stu_repo.save(stu_dto);
	}
	
	public Student_details update_student(Student_details stu_dto) {
		if(stu_repo.existsById(stu_dto.getStu_id())) {
		return stu_repo.save(stu_dto);
		}
		else {
			throw new RuntimeException();
		}
	}
	
	public void delete_student(Integer stu_id) {
		 stu_repo.deleteById(stu_id);
	}
}
