package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.Student_details;

public interface StudentRepository extends JpaRepository<Student_details, Integer>{

}
