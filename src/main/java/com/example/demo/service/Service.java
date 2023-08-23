package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.model.Model;
import com.example.demo.repository.Repo;

@org.springframework.stereotype.Service

public class Service {
	@Autowired
     Repo sr;
     public Model saveinfo(Model ss) {
    	 return sr.save(ss);
     }
     public List<Model> showinfo(){
    	 return sr.findAll();
     }
     public Model changeinfo(Model ss) {
    	 return sr.saveAndFlush(ss);
     }
    
     public void deleteById(int id) {
    	 sr.deleteById(id);
     }
     public List<Model> addinfo(List<Model> ss)
     {
    	 return (List<Model>)sr.saveAll(ss);
     }
     public Optional<Model> showbyid(int id){
    	 return sr.findById(id);
     }
     public String updateinfobyid(int id,Model ss) {
    	 sr.saveAndFlush(ss);
    	 if(sr.existsById(id)) {
    		 return "UPDATED";
    	 }else {
    		 return "ENTER VALID STUDENT_ID";
    	 }
     }
}
