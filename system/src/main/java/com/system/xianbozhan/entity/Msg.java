package com.system.xianbozhan.entity;

public class Msg {
	private int id;
	private String msg;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	@Override
	public String toString() {
		return "Msg [id=" + id + ", msg=" + msg + "]";
	}
	

}
