package com.app.model;

import java.util.List;

public class Color {
	
	private List colorname;
	
	public Color() {
		// TODO Auto-generated constructor stub
	}
	
	public Color(List colorname) {
		 this.colorname = colorname;
	}
	
	public String toString() {
		return "[colorname= "+ colorname +"]";
	}
	

}
