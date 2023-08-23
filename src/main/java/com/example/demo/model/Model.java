package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="STUDENT_DETAILS")
public class Model {
	@Id
  private int id;
  private String Studentname;
  private String Dept;
  private String mailId;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getStudentanme() {
	return Studentname;
}
public void setStudentanme(String studentanme) {
	Studentname = studentanme;
}
public String getDept() {
	return Dept;
}
public void setDept(String dept) {
	Dept = dept;
}
public String getMailId() {
	return mailId;
}
public void setMailId(String mailId) {
	this.mailId = mailId;
}
public Model() {
	super();
	// TODO Auto-generated constructor stub
}
public Model(int id, String studentanme, String dept, String mailId) {
	super();
	this.id = id;
	Studentname = studentanme;
	Dept = dept;
	this.mailId = mailId;
}
  
}
