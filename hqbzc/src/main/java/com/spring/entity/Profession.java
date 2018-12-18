package com.spring.entity;
/**
 * 各学院专业
 * @author Admin
 *
 */
public class Profession {

	private int id;
	private String profession_name; //专业名称
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProfession_name() {
		return profession_name;
	}
	public void setProfession_name(String profession_name) {
		this.profession_name = profession_name;
	}
	
	
}
