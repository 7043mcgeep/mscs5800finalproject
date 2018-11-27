package com.domain;

import java.math.BigDecimal;

public class LibraryBranch {

	private BigDecimal branchid;
	private String branchname;
	private String address;
	
	public LibraryBranch(BigDecimal branchid, String branchname, String address) {
		super();
		this.branchid = branchid;
		this.branchname = branchname;
		this.address = address;
	}

	public BigDecimal getBranchid() {
		return branchid;
	}

	public void setBranchid(BigDecimal branchid) {
		this.branchid = branchid;
	}

	public String getBranchname() {
		return branchname;
	}

	public void setBranchname(String branchname) {
		this.branchname = branchname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "LibraryBranch [branchid=" + branchid + ", branchname=" + branchname + ", address=" + address + "]";
	}
	
}
