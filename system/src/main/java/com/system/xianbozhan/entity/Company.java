package com.system.xianbozhan.entity;
/**
 * 所属公司类
 * @author Admin
 *
 */
public class Company {
	private Integer id;
	private String companyName;
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
	@Override
	public String toString() {
		return "Company [id=" + id + ", companyName=" + companyName + "]";
	}
	

}
