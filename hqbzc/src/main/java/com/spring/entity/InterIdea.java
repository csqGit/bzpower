package com.spring.entity;
/**
 * 网络建议
 * @author Admin
 *
 */
public class InterIdea {

	public int id;
	private String idea_name;
	private String idea_content;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getIdea_name() {
		return idea_name;
	}
	public void setIdea_name(String idea_name) {
		this.idea_name = idea_name;
	}
	public String getIdea_content() {
		return idea_content;
	}
	public void setIdea_content(String idea_content) {
		this.idea_content = idea_content;
	}
}
