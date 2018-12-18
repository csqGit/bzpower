package com.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.entity.GoodLost;
import com.spring.service.GoodLostService;

@Controller
public class GoodLostController {
	
	
	@Autowired
	private GoodLostService goodLostService;
	

	
	
	//得到所有的物品信息
	@RequestMapping("/getGoodList")
	public String getGoodList(Model model, int startPosition) {
		
		List<GoodLost> list = goodLostService.getGoodList(startPosition,null, null);
		model.addAttribute("goodList", list);
		//得到总页数
		model.addAttribute("page", goodLostService.getCount());
		//得到当前页数
		model.addAttribute("curPage", startPosition);
		return "page/swzl";
	}

}
