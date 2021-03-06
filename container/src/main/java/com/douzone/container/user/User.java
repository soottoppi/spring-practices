package com.douzone.container.user;

import java.util.List;

public class User {
	private Long no = 0L;
	private String name = "κΉμν";
	private Friend friend;
	private List<Friend> friends;

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
		return "User [no=" + no + ", name=" + name + ", friend=" + friend + ", friends=" + friends + "]";
	}

	public void setNo(Long no) {
		this.no = no;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setFriend(Friend friend) {
		this.friend = friend;
	}

	public void setFriends(List<Friend> friends) {
		this.friends = friends;
	}

}
