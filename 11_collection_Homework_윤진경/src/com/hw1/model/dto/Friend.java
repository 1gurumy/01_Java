package com.hw1.model.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Friend {
	
	/*- name: String
	+ Friend()
	+ Friend(String name)
	+ pickLeader() : void*/
	
	
	private String name;
	
	public Friend() {}

	public Friend(String name) {
		super();
		this.name = name;
	}
	
	

	
	
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
public void pickLeader() {
		
		System.out.println(name + "가 떡잎방범대 대장이다!");
		
	}
	
}
