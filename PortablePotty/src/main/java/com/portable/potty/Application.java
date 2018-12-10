package com.portable.potty;

import com.portable.potty.service.PersonService;
import com.portable.potty.service.PersonServiceImpl;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonService service = new PersonServiceImpl();
		System.out.println(service.findAll().get(0).getFirstName());
		

	}
	
	
	

}
