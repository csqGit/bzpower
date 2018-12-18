package com.spring.entity;

/**
 * 新闻类
 * @author Admin
 *
 */
public class NewInfo {

	private int id;
	private String title;//标题
	private NewType type;
//	@JSONField(format="yyy-MM-dd HH:mm:ss")
	private String time;//时间
	private String author;//发布人
	private String newSrc;//新闻存储地址
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public NewType getType() {
		return type;
	}
	public void setType(NewType type) {
		this.type = type;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getNewSrc() {
		return newSrc;
	}
	public void setNewSrc(String newSrc) {
		this.newSrc = newSrc;
	}
	
	

}
