package com.portable.potty.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.portable.potty.model.Person;

@Repository
public class PersonRepoImpl implements PersonRepo {
	
	/* (non-Javadoc)
	 * @see com.portable.potty.repository.PersonRepo#findAll()
	 */
	@Override
	public List<Person> findAll(){
		List<Person> people = new ArrayList<>();
		Person p1 = new Person(1, "John", "Smith", "Owner");
		Person p2 = new Person(2, "Jane", "Saunders", "Adminstrator");
		Person p3 = new Person(3, "Tory", "Bird", "Dispatcher");
		Person p4 = new Person(4, "Fred", "Flintstone", "Driver");
		Person p5 = new Person(5, "Barney", "Rubble", "Driver");
		people.add(p1);
		people.add(p2);
		people.add(p3);
		people.add(p4);
		people.add(p5);
		return people;
	}
	

}
