package com.spring.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.spring.entity.RepairInfo;
import com.spring.service.RepairInfoService;
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
	@ResponseBody
	public Map<String, Object> getRepairInfoAll (HttpServletRequest req,HttpServletResponse response, int page) {
		List<RepairInfo> list = repairInfoService.getRepairInfo(page);
		int pages = repairInfoService.getPages();
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("current", page);
		map.put("pages", pages);
		map.put("list", list);
		System.out.println(list);
		return map;
		/*Map<String, Object> map = new HashMap<String, Object>();
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
		session.setAttribute("repairCount", count);*/
		
	}
	
	//得到报修信息
	@RequestMapping("/saveRepairInfo")
	public String saveRepairInfo(HttpServletRequest req,RepairInfo repairInfo) {
		//HttpSession session = req.getSession();
		
			boolean flag = repairInfoService.saveRepairInfo(repairInfo);
			if(flag)
				req.setAttribute("msg", "添加成功！");
			else
				req.setAttribute("msg", "添加失败！");
		
		return "page/hqgzbx";
	}
	

}
