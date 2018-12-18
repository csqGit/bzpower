package com.spring.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.spring.entity.RepairInfo;
import com.spring.service.RepairInfoService;
import com.spring.util.FastJsonUtil;
/**
 * 如果工程一直报错，找不到类异常，解决方法为：
 * 1.右击工程properties，搜索Deployment Assembly，点击add,选择Java Build Path Entries，选择Maven Dependencies，点击apply即可。
 * @author Admin
 *
 */
@Controller("repairInfoController")
public class RepairInfoController {

	
	@Autowired
	private RepairInfoService repairInfoService;
	
	@RequestMapping("/getRepairInfoAll")
	public void getRepairInfoAll(HttpServletRequest req,HttpServletResponse response, int page, int limit) {
		List<RepairInfo> list = repairInfoService.getRepairInfo(page, limit);
		Map<String, Object> map = new HashMap<String, Object>();
		int count = repairInfoService.getCount();
		map.put("code", 0);
		map.put("count", count);
		map.put("msg", "");
		map.put("data", list);
		String jsonString = FastJsonUtil.toJSONString(map);
		System.out.println(jsonString);
		jsonString = FastJsonUtil.JsonFormatterAddPrefix(jsonString, "", null);
		System.out.println(jsonString);
		FastJsonUtil.write_json(response, jsonString);
		HttpSession session = req.getSession();
		session.setAttribute("repairCount", count);
		
	}
	
	//得到报修信息
	@RequestMapping("/saveRepairInfo")
	public String saveRepairInfo(HttpServletRequest req,RepairInfo repairInfo) {
		HttpSession session = req.getSession();
		if(repairInfo != null && repairInfo.getRepair_name() != null && "".equals(repairInfo.getRepair_name())) {
			boolean flag = repairInfoService.saveRepairInfo(repairInfo);
			if(flag)
				session.setAttribute("msg", "添加成功！");
			else
				session.setAttribute("msg", "添加失败！");
		}
		return "page/hqgzbx";
	}
	

}
