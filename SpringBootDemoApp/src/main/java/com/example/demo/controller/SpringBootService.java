package com.example.demo.controller;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

//
//import org.springframework.beans.factory.annotation.Autowired;
//
//import com.example.demo.controller.SpringBootController;
//import com.example.demo.entity.Student;
@Service
public class SpringBootService  {

//	
//	public String getCode() {
//		return "code";
//		
//	}


//	SpringBootController springBootController;
//	SpringBootRepository springBootRepository;
	
	
public List<Student> testGetMethod1() {
	
		ArrayList<Student> list=new ArrayList<Student>();
		
		Student studentt=new Student();
		Student studentt1=new Student();
		
//		SpringBootService springBootService=new SpringBootService();
		
		studentt.setId(1);
		studentt.setName("Krishna");
		studentt.setDob("01-04-1991");
		studentt.setAdress("kurnool");
		studentt.setMobile(987654321);
		
		studentt1.setId(2);
		studentt1.setName("Krishna");
		studentt1.setDob("01-04-1991");
		studentt1.setAdress("kurnool");
		studentt1.setMobile(987654321);
		list.add(studentt);
		list.add(studentt1);
		return list;
		

//		Student student1=springBootService.save(list);
		
//	return (List<Student>) springBootService.save(studentt);
	
}

	

	
	
	
	
	
//	@Override
//	public Student save(Student student) {
//		// TODO Auto-generated method stub
//		
//	
//		
//		
//	 	return  springBootRepository.save(student);
//	}
}
