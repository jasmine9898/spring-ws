package com.bstek.bdf.webservice.demo;

public class Dept {
	private Byte deptNo;
	private String deptName;
	private String location;

	public Dept() {
	}

	public Dept(Byte deptNo, String deptName, String location) {
		super();
		this.deptNo = deptNo;
		this.deptName = deptName;
		this.location = location;
	}

	public Byte getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(Byte deptNo) {
		this.deptNo = deptNo;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
}
