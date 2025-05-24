package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student_details {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer stu_id;
	@Column(length=50)
	private String stu_name;
	@Column(length=200)
	private String stu_address;
	@Column(length=10)
	private String stu_phone;
	@Column(length=50)
	private String stu_department;
	@Column(length=20)
	private String stu_class;
	public Integer getStu_id() {
		return stu_id;
	}
	public void setStu_id(Integer stu_id) {
		this.stu_id = stu_id;
	}
	public String getStu_name() {
		return stu_name;
	}
	public void setStu_name(String stu_name) {
		this.stu_name = stu_name;
	}
	public String getStu_address() {
		return stu_address;
	}
	public void setStu_address(String stu_address) {
		this.stu_address = stu_address;
	}
	public String getStu_phone() {
		return stu_phone;
	}
	public void setStu_phone(String stu_phone) {
		this.stu_phone = stu_phone;
	}
	public String getStu_department() {
		return stu_department;
	}
	public void setStu_department(String stu_department) {
		this.stu_department = stu_department;
	}
	public String getStu_class() {
		return stu_class;
	}
	public void setStu_class(String stu_class) {
		this.stu_class = stu_class;
	}
	
	
}
