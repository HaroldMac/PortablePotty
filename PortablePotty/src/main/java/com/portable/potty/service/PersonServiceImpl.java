package com.portable.potty.service;

import java.util.List;

import com.portable.potty.model.Person;
import com.portable.potty.repository.PersonRepo;
import com.portable.potty.repository.PersonRepoImpl;

public class PersonServiceImpl implements PersonService {
	
	private PersonRepo personRepo = new PersonRepoImpl();
	
	/* (non-Javadoc)
	 * @see com.portable.potty.service.PersonService#findAll()
	 */
	@Override
	public List<Person> findAll(){
		return personRepo.findAll();
		
	}

}
