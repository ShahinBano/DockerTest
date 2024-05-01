package com.sb.docker.payload;

public class Employee {
	private Integer id;
	private String name;
	private String department;
	private Double salary;
	private Address address;
	public Employee(Integer id, String name, String department, Double salary, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
		this.address = address;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", department=" + department + ", salary=" + salary
				+ ", address=" + address + "]";
	}
}
