package com.douzone.container.user;

public class User {
	private Long no = 0L;
	private String name = "김수형";
	
	public User() {
	}
	public User(String name) {
		this.name = name;
	}
	
	public User(Long no, String name) {
		this.no = no;
		this.name = name;
	}
	
	
	@Override
	public String toString() {
		return "User [no=" + no + ", name=" + name + "]";
	}
	public void setNo(Long no) {
		this.no = no;
	}
	public void setName(String name) {
		this.name = name;
	}

	
	
}