package com.stackroute.springdi.bean.Hobby;

public class CAB {
	private String name;
	private int age;
	public CAB() {
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "CAB [name=" + name + ", age=" + age + "]";
	}
	
}
