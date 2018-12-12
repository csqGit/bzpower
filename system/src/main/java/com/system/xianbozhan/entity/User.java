package com.system.xianbozhan.entity;
/*
 * 管理员类
 */
public class User {

	private Integer id;
	private String company;//所属公司
	private Department department;//部门编号
	private Role role;//角色
	private String username;//用户名
	private String name;//姓名
	private String password;
	private String phone;//电话
	private String weChat;//微信
	private String weChatName;//微信名称
	private String enterpriseNumber;//企业编号
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getWeChat() {
		return weChat;
	}
	public void setWeChat(String weChat) {
		this.weChat = weChat;
	}
	public String getWeChatName() {
		return weChatName;
	}
	public void setWeChatName(String weChatName) {
		this.weChatName = weChatName;
	}
	public String getEnterpriseNumber() {
		return enterpriseNumber;
	}
	public void setEnterpriseNumber(String enterpriseNumber) {
		this.enterpriseNumber = enterpriseNumber;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Admin [id=" + id + ", company=" + company + ", department=" + department + ", role=" + role
				+ ", username=" + username + ", name=" + name + ", phone=" + phone + ", weChat=" + weChat
				+ ", weChatName=" + weChatName + ", enterpriseNumber=" + enterpriseNumber + ", jurisdiction=" + "]";
	}
	
	
}
