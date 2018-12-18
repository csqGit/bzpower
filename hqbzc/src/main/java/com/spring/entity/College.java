package com.spring.entity;

import java.util.Set;

/**
 * 学院信息
 * @author Admin
 *
 */
public class College {
	private int id;
	private String college_name; //学院名称
	private Set<Profession> profession; //专业
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCollege_name() {
		return college_name;
	}
	public void setCollege_name(String college_name) {
		this.college_name = college_name;
	}
	public Set<Profession> getProfession() {
		return profession;
	}
	public void setProfession(Set<Profession> profession) {
		this.profession = profession;
	}
	
}
