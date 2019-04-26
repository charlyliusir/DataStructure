package com.liuchaolong;

public class Person {
	
	private int age;
	private String name;
	
	public Person(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Person [age=" + age +" ,name" + name + "]";
	}

	
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		
	}
}
