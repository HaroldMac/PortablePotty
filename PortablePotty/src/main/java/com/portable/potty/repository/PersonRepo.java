package com.portable.potty.repository;

import java.util.List;

import com.portable.potty.model.Person;

public interface PersonRepo {

	List<Person> findAll();

}