


package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Model;
import com.example.demo.service.Service;

@RestController
public class Controller {
	@Autowired
   Service sser;
	
	@PostMapping("addstudent")
	public List<Model> adddetails(@RequestBody List<Model> m){
		return sser.addinfo(m);
	}
	//get details fully
	@GetMapping("showstudentdetails")
	public List<Model> show(){
		return sser.showinfo();
	}
	
	//get by id
	@GetMapping("showbyid/{id}")
	public Optional<Model> showId(@PathVariable int id){
		return sser.showbyid(id);
	}
	
	//update by id
	@PutMapping("updatestudbyId/{id}")
	public String modifybyid(@PathVariable int id,@RequestBody Model ss) {
		return sser.updateinfobyid(id, ss);
	}
	
	//delete by id
	@DeleteMapping("delid/{id}")
	public void deletemyid(@PathVariable int id) {
		sser.deleteById(id);
	}
	
}
