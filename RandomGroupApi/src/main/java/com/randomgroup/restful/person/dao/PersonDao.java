package com.randomgroup.restful.person.dao;

import com.randomgroup.restful.person.vo.Person;

public interface PersonDao {

	public Person[] getAllPerson();
	
	public boolean addPerson(Person person);
	
	public boolean deletePerson(String personName);
}
