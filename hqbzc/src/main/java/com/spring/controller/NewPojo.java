package com.spring.controller;

import java.util.List;

public class NewPojo {
	private List list;
	private int pages;
	private int currentPage;//当前页数
	public List getList() {
		return list;
	}
	public void setList(List list) {
		this.list = list;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	@Override
	public String toString() {
		return "NewPojo [list=" + list + ", pages=" + pages + ", currentPage=" + currentPage + "]";
	}
	
	

}
