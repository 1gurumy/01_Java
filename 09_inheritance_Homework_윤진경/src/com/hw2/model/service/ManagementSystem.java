package com.hw2.model.service;

import com.hw2.model.dto.Person;

public interface ManagementSystem {

	/*+ abstract addPerson(Person person) : void
		+ abstract removePerson(String id) : void
		+ abstract displayAllPersons() : void*/
	
	// 인터페이스에서 추상메서드 => [public abstract] 반환자료형 메소드명([자료형 매개변수])
	// 추상클래스에서 추상메서드 => [접근제한자] abstract 반환형 메소드명(자료형 변수명);
	void addPerson(Person person);
	
	public void remobePerson(String id);
	
	
}
