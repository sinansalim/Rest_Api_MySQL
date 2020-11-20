package com.example.REST.resource;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.REST.model.user_manager;
import com.example.REST.repository.user_manager_repository;

@RestController
public class user_manager_resource {
	
	@Autowired
	user_manager_repository u_m_r;
	
	@RequestMapping(value="/user_manager")
	public List<user_manager> getAll(){
		//for insertion of data fields
		/*user_manager mn = new user_manager();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter id :");
		int id = scan.nextInt();	
		mn.setEmployeeID(id);
		System.out.println("Enter First name :");
		String firstName = scan.next();
		mn.setFirstName(firstName);
		System.out.println("Enter Last Name :");
		String LastName = scan.next();
		mn.setLastName(LastName);
		scan.close();
		*/
		//for dispay of data
		return u_m_r.findAll();
	
	}	
}
