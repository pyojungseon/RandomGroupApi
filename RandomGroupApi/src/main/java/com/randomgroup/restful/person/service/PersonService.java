package com.randomgroup.restful.person.service;

import com.randomgroup.restful.person.vo.Group;
import com.randomgroup.restful.person.vo.Person;

public interface PersonService {

	public boolean addPerson(Person person);
	public Person[] getAllPerson();
	public boolean deletePerson(String personName);
	public Group[] getRandom(int groupSize, int sizeLimit);
	
}
