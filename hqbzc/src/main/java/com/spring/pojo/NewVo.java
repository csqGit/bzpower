package com.spring.pojo;

import java.util.Collection;
import java.util.List;

import com.spring.entity.NewInfo;

public class NewVo {
	private int code;
	private String msg;
	private int count;
	private List<NewInfo> data;
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public List<NewInfo> getData() {
		return data;
	}
	public void setData(List<NewInfo> data) {
		this.data = data;
	}

}
