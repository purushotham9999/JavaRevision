package com.collections;

import java.util.List;

public class Employee implements Comparable<Employee> {

	String name;

	int age;

	double salary;

	List<String> phoneNumbers;

	public Employee(String name, int age, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public Employee(String name, int age, double salary, List<String> phoneNumbers) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.phoneNumbers = phoneNumbers;
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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}

	public List<String> getPhoneNumbers() {
		return phoneNumbers;
	}

	public void setPhoneNumbers(List<String> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}

	// @Override
	public int compareTo(Employee emp2) {
		// TODO Auto-generated method stub
//
//		if (this.age > emp2.age) {
//			return 1;
//		} else {
//			return -1;
//		}

		return (this.age > emp2.age) ? 1 : -1;
	}

}
