package com.system.xianbozhan.entity;

import java.util.List;

/**
 * 所属公司类
 * @author Admin
 *
 */
public class Company {
	private Integer id;
	private String companyName;
	private List<VoltageGrade> voltageGrade;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public List<VoltageGrade> getVoltageGrade() {
		return voltageGrade;
	}
	public void setVoltageGrade(List<VoltageGrade> voltageGrade) {
		this.voltageGrade = voltageGrade;
	}
	@Override
	public String toString() {
		return "Company [id=" + id + ", companyName=" + companyName + ", voltageGrade=" + voltageGrade + "]";
	}
	

}
