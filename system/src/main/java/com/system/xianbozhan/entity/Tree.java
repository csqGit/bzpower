package com.system.xianbozhan.entity;

import java.util.List;

/*
 * 树形菜单
 */
public class Tree {
	private Integer id;
	private String text;
	private List<Tree> children;
	private boolean checked;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	
	public List<Tree> getChildren() {
		return children;
	}
	public void setChildren(List<Tree> children) {
		this.children = children;
	}
	public boolean isChecked() {
		return checked;
	}
	public void setChecked(boolean checked) {
		this.checked = checked;
	}
	@Override
	public String toString() {
		return "Tree [id=" + id + ", text=" + text + ", children=" + children + ", checked=" + checked + "]";
	}
	
	

}
