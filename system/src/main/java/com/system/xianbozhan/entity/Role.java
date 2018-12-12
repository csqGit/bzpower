package com.system.xianbozhan.entity;
/*
 * 角色类
 */
public class Role {

	private Integer id;
	private String roleName;
	private Integer jurisdiction;//访问权限	1：管理员	2：普通用户
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public Integer getJurisdiction() {
		return jurisdiction;
	}
	public void setJurisdiction(Integer jurisdiction) {
		this.jurisdiction = jurisdiction;
	}
	@Override
	public String toString() {
		return "Role [id=" + id + ", roleName=" + roleName + ", jurisdiction=" + jurisdiction + "]";
	}
	
	
}
