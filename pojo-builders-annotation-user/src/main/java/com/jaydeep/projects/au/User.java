package com.jaydeep.projects.au;

import com.jaydeep.projects.ap.BuilderProperty;

public class User {

	private int id;
	private String name;

	public User() {
	}

	public User(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	@BuilderProperty
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	@BuilderProperty
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + "]";
	}
}
