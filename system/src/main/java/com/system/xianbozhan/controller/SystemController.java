package com.system.xianbozhan.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.system.xianbozhan.entity.Company;
import com.system.xianbozhan.entity.Department;
import com.system.xianbozhan.entity.Line;
import com.system.xianbozhan.entity.LineName;
import com.system.xianbozhan.entity.Picture;
import com.system.xianbozhan.entity.Role;
import com.system.xianbozhan.entity.Search;
import com.system.xianbozhan.entity.Tower;
import com.system.xianbozhan.entity.Tree;
import com.system.xianbozhan.service.LineService;
import com.system.xianbozhan.service.SystemService;
import com.system.xianbozhan.service.TowerService;
import com.system.xianbozhan.service.UserService;

/*
 * 系统类
 */
@Controller
public class SystemController {
	
	@Autowired
	private SystemService systemService;
	
	@Autowired
	private LineService lineService;
	
	@Autowired
	private TowerService towerService;
	
	@Autowired
	private UserService userService;

	@RequestMapping("getDepartmentName")
	@ResponseBody
	public Object getDepartmentName(HttpServletResponse response){
		List<Department> department = null;
		try {
			department = systemService.getDepartmentName();
		} catch (Exception e) {
			e.printStackTrace();
		}
		Object json = JSONObject.toJSON(department);
		
		return json;
	}
	
	@RequestMapping("getRoleName")
	@ResponseBody
	public Object getRoleName(HttpServletResponse response){
		List<Role> role = null;
		try {
			role = systemService.getRoleName();
		} catch (Exception e) {
			e.printStackTrace();
		}
		Object json = JSONObject.toJSON(role);
		
		return json;
	}
	
	
	@RequestMapping("getSearchList")
	@ResponseBody
	public Object getSearchList() {

		List<Search> search = null;
		try {
			search = systemService.getSearchList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		Object json = JSONObject.toJSON(search);
		return json;
	}
	
	
	/*
	 * 动态生成导航数
	 */
	//@RequestMapping("getTree")
	public void getTree(HttpServletResponse response) {
		//公司名称
		List<Company> companyList = systemService.getCompany();
		//线路名称
		List<LineName> lineNameList = lineService.getLineName();
		//电压等级
		List<Line> line = lineService.getLineList(1);
		//杆塔号
		List<Tower> towerList = towerService.getTowerName();
		List<String> list = new ArrayList<String>();
		for(Line l : line) {
			list.add(l.getVoltageGrade());
		}
		for(int i = 0; i < companyList.size(); i ++ ) {
			Tree tree = new Tree();
			Tree tree2 = new Tree();
			Tree tree3 = new Tree();
			List<Tree> firstList = new ArrayList<Tree>();
			List<Tree> secondList = new ArrayList<Tree>();
			List<Tree> thredList = new ArrayList<Tree>();
			List<Tree> fourList = new ArrayList<Tree>();
			//循环将电压等级名称存入集合
			for(int j = 0; j < list.size(); j ++) {
				//添加公司名称到数节点作为树的一级节点
				tree.setText(companyList.get(i).getCompanyName());
				//添加电压等级作为二级节点
				tree2.setText(list.get(j));
				//循环将线路名称存入集合
				for(int m = 0; m < lineNameList.size(); m ++) {
					tree3.setText(lineNameList.get(m).getLineName());
					//循环将杆塔名称存入集合
					for(int n = 0; n < towerList.size(); n ++) {
						Tree tree4 = new Tree();
						tree4.setText(towerList.get(n).getTowerName());
						fourList.add(tree4);
					}
					thredList.add(tree3);
				}
			}
//			tree.setChildren(line);
		}
		
	}
	
	//得到公司名称
	public Object pring() {
		List list = systemService.getCompany();
		System.out.println(list);
		Object obj = JSONObject.toJSON(list);
		System.out.println(obj);
		return obj;
	}
	
	
	/*
	 * 得到轮播图片地址
	 */
	@RequestMapping("getPictureUrl")
	@ResponseBody
	public Object getPictureUrl(int page) {
		List<Picture> list = null;
		try {
			list = systemService.getPicture(page);
		} catch (Exception e) {
			e.printStackTrace();
		}
		Object obj = JSONObject.toJSON(list);
		System.out.println(obj);
		return obj;
	}
}
