package webdemo.controller;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import jakarta.transaction.Transactional;
import webdemo.model.Student;


@Controller
@RequestMapping("/")
public class Controller1 {
	@Autowired 
	SessionFactory sessionFactory;
	

	@GetMapping
	@Transactional
	public String Default() {
		Session session = sessionFactory.getCurrentSession(); 
		String sql = "from Student";
		List<Student> list = session.createQuery(sql, Student.class).getResultList();
		for(Student s : list) {
			System.out.println(s.toString());
		}
		return "demo";
	}
	
	
}

















