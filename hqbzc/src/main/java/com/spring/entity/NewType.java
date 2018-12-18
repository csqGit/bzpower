package com.spring.entity;
/**
 * 新闻类型
 * @author Admin
 *
 */
public class NewType {
	private Integer id;
	private String typeName;
	public NewType() {
		
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	@Override
	public String toString() {
		return "NewType [id=" + id + ", type=" + typeName + "]";
	}
	
}
