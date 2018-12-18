package com.spring.entity;
/**
 * 教室申请信息
 * @author Admin
 *
 */
public class ApplyClass {
	
	private Integer id;
	
	private String applyName;//申请人姓名
	
	private String applyStudentId;//申请人学号
	
	private String applyCollege;//申请人学院信息
	
	private String applyStudentClass;//申请人班级
	
	private String applyCourse;//申请课程
	
	private String applyTime;//申请时间
	
	private String applyClassAddress;//申请教室地址
	
	private Integer applyState;//审核状态

	

	public String getApplyName() {
		return applyName;
	}

	public void setApplyName(String applyName) {
		this.applyName = applyName;
	}

	public String getApplyStudentId() {
		return applyStudentId;
	}

	public void setApplyStudentId(String applyStudentId) {
		this.applyStudentId = applyStudentId;
	}

	public String getApplyCollege() {
		return applyCollege;
	}

	public void setApplyCollege(String applyCollege) {
		this.applyCollege = applyCollege;
	}

	

	public String getApplyStudentClass() {
		return applyStudentClass;
	}

	public void setApplyStudentClass(String applyStudentClass) {
		this.applyStudentClass = applyStudentClass;
	}

	public String getApplyCourse() {
		return applyCourse;
	}

	public void setApplyCourse(String applyCourse) {
		this.applyCourse = applyCourse;
	}

	public String getApplyTime() {
		return applyTime;
	}

	public void setApplyTime(String applyTime) {
		this.applyTime = applyTime;
	}

	public String getApplyClassAddress() {
		return applyClassAddress;
	}

	public void setApplyClassAddress(String applyClassAddress) {
		this.applyClassAddress = applyClassAddress;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getApplyState() {
		return applyState;
	}

	public void setApplyState(Integer applyState) {
		this.applyState = applyState;
	}

	@Override
	public String toString() {
		return "ApplyClass [id=" + id + ", applyName=" + applyName + ", applyStudentId=" + applyStudentId
				+ ", applyCollege=" + applyCollege + ", applyStudentClass=" + applyStudentClass + ", applyCourse="
				+ applyCourse + ", applyTime=" + applyTime + ", applyClassAddress=" + applyClassAddress
				+ ", applyState=" + applyState + "]";
	}



}
