package com.app.model;

import java.util.List;

public class Certificate {
	
	private List cname;
	
	/*public Certificate() {
		// TODO Auto-generated constructor stub
	}
	
	public Certificate(List cname) {
		this.cname=cname;
	}*/

	@Override
	public String toString() {
		return "Certificate [cname=" + cname + "]";
	}
	
	public void setCname(List cname) {
		this.cname=cname;
	}
	
	public List getCname() {
		return cname;
	}

	
	
}
