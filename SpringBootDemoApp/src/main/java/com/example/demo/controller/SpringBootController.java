package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//
//import com.example.demo.entity.Student;
//import com.example.demo.service.SpringBootService;
@RestController
@RequestMapping

public class SpringBootController {
//	@Autowired
//	SpringBootService springBootService;
	@GetMapping
String testGetMethod() {
	
	return "CodeBegun Institute";
	
}
//	@GetMapping
//public List<Student> getMethod(){
//		
//		return springBootService.testGetMethod1();
//	}

}
