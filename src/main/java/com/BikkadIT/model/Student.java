package com.BikkadIT.model;

public class Student {

	private int sId;
	
	private String sName;
	
	private String sAdd;
	
	private long sPhoneNo;

	public int getsId() {
		return sId;
	}

	public void setsId(int sId) {
		this.sId = sId;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getsAdd() {
		return sAdd;
	}

	public void setsAdd(String sAdd) {
		this.sAdd = sAdd;
	}

	public long getsPhoneNo() {
		return sPhoneNo;
	}

	public void setsPhoneNo(long sPhoneNo) {
		this.sPhoneNo = sPhoneNo;
	}

	@Override
	public String toString() {
		return "Student [sId=" + sId + ", sName=" + sName + ", sAdd=" + sAdd + ", sPhoneNo=" + sPhoneNo + "]";
	}
	
	
	
}
