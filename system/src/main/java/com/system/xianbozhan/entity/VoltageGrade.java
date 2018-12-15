package com.system.xianbozhan.entity;

import java.util.List;

/*
 * 电压类
 */
public class VoltageGrade {
	private Integer id;
	private List<Line> line;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public List<Line> getLine() {
		return line;
	}
	public void setLine(List<Line> line) {
		this.line = line;
	}
	@Override
	public String toString() {
		return "VoltageGrade [id=" + id + ", line=" + line + "]";
	}
	
	
}
