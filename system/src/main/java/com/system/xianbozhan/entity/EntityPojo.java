package com.system.xianbozhan.entity;

import java.util.List;

public class EntityPojo {
	private List list;
	private Integer pages;//总页数
	private Integer current;//当前页数
	private Integer count;//总条数
	private Integer now;//当前为第几条
	private Integer size;//至第几条
	
	
	public List getList() {
		return list;
	}
	public void setList(List list) {
		this.list = list;
	}
	public Integer getPages() {
		return pages;
	}
	public void setPages(Integer pages) {
		this.pages = pages;
	}
	public Integer getCurrent() {
		return current;
	}
	public void setCurrent(Integer current) {
		this.current = current;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	
	public Integer getNow() {
		return now;
	}
	public void setNow(Integer now) {
		this.now = now;
	}
	public Integer getSize() {
		return size;
	}
	public void setSize(Integer size) {
		this.size = size;
	}
	@Override
	public String toString() {
		return "EntityPojo [list=" + list + ", pages=" + pages + ", current=" + current + ", count=" + count + ", now="
				+ now + ", size=" + size + "]";
	}
	 

}
