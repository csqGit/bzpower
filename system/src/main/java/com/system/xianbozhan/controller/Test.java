package com.system.xianbozhan.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.system.xianbozhan.entity.Tree;

@Controller
public class Test {
	
	@RequestMapping("getTree")
	@ResponseBody
	public Object print() {

		Tree t11 = new Tree();
		Tree t21 = new Tree();
		Tree t31 = new Tree();
		Tree t32 = new Tree();
		Tree t41 = new Tree();
		Tree t42 = new Tree();
		
		
		//设置一级菜单的内容
		t11.setId(1);
		t11.setText("西安博展电力");
		
		//设置二级菜单
		t21.setId(1);
		t21.setText("220kv");
		
		//设置三级菜单
		t31.setId(1);
		t32.setText("长堡线");
		
		t32.setId(2);
		t32.setText("平顺县");
		
		
		//设置司机菜单的内容
		t41.setId(1);
		t41.setText("220号（大号侧）");
		t42.setId(2);
		t42.setText("29号（小号测）");
		List l4 = new ArrayList();
		l4.add(t41);
		l4.add(t42);
		
		//将司机菜单添加到三级
		t31.setChildren(l4);
		
		//将三级菜单添加到二级
		List l3 = new ArrayList();
		l3.add(t31);
		l3.add(t32);
		t21.setChildren(l3);
		
		//将二级惨淡天津加到一级
		List l2 = new ArrayList();
		l2.add(t21);
		t11.setChildren(l2);
		Object obj = JSONObject.toJSON(t11);
		System.out.println(obj);
		
	return obj;
	}

	

	
	

}
