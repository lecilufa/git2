package com.ckk.model;

import java.util.ArrayList;
import java.util.List;

public class Cat {

	private String name;
	private String gender;
	private List<String> kids = new ArrayList<>();
	
	public Cat() {
		kids.add("miya");
		kids.add("萌猫~");
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public List<String> getKids() {
		return kids;
	}
	public void setKids(List<String> kids) {
		this.kids = kids;
	}
	
	
	
}
