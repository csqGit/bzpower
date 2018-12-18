package com.spring.entity;

public class Admin {
	private int id;
	private String admin_name;
	private String admin_id;
	private String admin_university;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAdmin_name() {
		return admin_name;
	}
	public void setAdmin_name(String admin_name) {
		this.admin_name = admin_name;
	}
	public String getAdmin_id() {
		return admin_id;
	}
	public void setAdmin_id(String admin_id) {
		this.admin_id = admin_id;
	}
	public String getAdmin_university() {
		return admin_university;
	}
	public void setAdmin_university(String admin_university) {
		this.admin_university = admin_university;
	}
	@Override
	public String toString() {
		return "Admin [id=" + id + ", admin_name=" + admin_name + ", admin_id=" + admin_id + ", admin_university="
				+ admin_university + "]";
	}

}
