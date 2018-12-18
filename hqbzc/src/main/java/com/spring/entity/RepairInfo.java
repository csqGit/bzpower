package com.spring.entity;
/**
 * 	 报修信息类
 * @author Admin
 *
 */
public class RepairInfo {
	private Integer id ;
	private String repair_name;
	private String content;	//报修内容
	private String repair_type;	//报修内容
	private String time;	//报修时间
	private String repair_address;//报修地点

	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getRepair_type() {
		return repair_type;
	}
	public void setRepair_type(String repair_type) {
		this.repair_type = repair_type;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getRepair_name() {
		return repair_name;
	}
	public void setRepair_name(String repair_name) {
		this.repair_name = repair_name;
	}
	public String getRepair_address() {
		return repair_address;
	}
	public void setRepair_address(String repair_address) {
		this.repair_address = repair_address;
	}
	@Override
	public String toString() {
		return "RepairInfo [id=" + id + ", repair_name=" + repair_name + ", content=" + content + ", repair_type="
				+ repair_type + ", time=" + time + ", repair_address=" + repair_address + "]";
	}
	
	
	

}
