package com.te.practice.objectclass;

public class Employee implements Cloneable {
	
	private int eid;
	
	private String ename;
	
	private String role;
	
	private double sal;
	
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}



	@Override
	public int hashCode() {
		return this.eid;
	}
	

    @Override
	public boolean equals(Object k) {
		return this.hashCode() == k.hashCode();
	}



	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", role=" + role + ", sal=" + sal + "]";
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}
	

}
