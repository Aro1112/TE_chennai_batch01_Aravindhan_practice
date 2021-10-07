package com.te.collection.set;

public class EmplTreeSet implements Comparable<EmplTreeSet> {
	
	private Integer id;
	
	private String  name;
	
	private String role;
	
	private Double salary;
	
	private String client;
	
	

	public EmplTreeSet() {
		super();
	}

	
	public EmplTreeSet(Integer id, String name, String role, Double salary, String client) {
		super();
		this.id = id;
		this.name = name;
		this.role = role;
		this.salary = salary;
		this.client = client;
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

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public String getClient() {
		return client;
	}

	public void setClient(String client) {
		this.client = client;
	}

	@Override
	public String toString() {
		return "EmplTreeSet [id=" + id + ", name=" + name + ", role=" + role + ", salary=" + salary + ", client="
				+ client + "]";
	}

	

	@Override
	public int hashCode() {
		
		return this.id;
	}


	@Override
	public int compareTo(EmplTreeSet o) {
		
		return this.hashCode() - o.hashCode()  ;
	}

	
	
}
