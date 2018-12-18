package com.spring.controller;

/**
 * 所有的方法都以getXXX开头get+保存数据对应的实体类名称
 * 所有的保存方法都以saveXXX开头
 */
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.spring.entity.ApplyClass;
import com.spring.entity.FreeClass;
import com.spring.entity.InterIdea;
import com.spring.entity.PictureInfo;
import com.spring.entity.SystemInfo;
import com.spring.service.NewInfoService;
import com.spring.service.SystemInfoService;

@Controller
public class SystemInfoController {
	@Autowired
	private SystemInfoService systemInfoService;
	
	@Autowired
	private NewInfoService newInfoService;
	
	
//	@RequestMapping("/getSystemInfo")
	public void getSystemInfo(HttpServletRequest req, HttpServletResponse resp) {
		HttpSession session = req.getSession();
		// 得到网站导航信息
		List<SystemInfo> list = systemInfoService.getSystemInfo();
		session.setAttribute("system", list);

		// 得到网络调查的详细信息
		List<InterIdea> interIdea = systemInfoService.getInterIdea();
		session.setAttribute("interIdea", interIdea);

		// 得到轮播图片路径
		List<PictureInfo> url = systemInfoService.getPicUrl();
		session.setAttribute("picUrl", url);
		try {
			resp.getWriter().write("success");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//保存新闻路径
		session.setAttribute("newInfo", newInfoService.getNewInfoList(1, null));
		System.out.println(newInfoService.getNewInfoList(1, "1"));
//		return "index";
	}

	/*
	 * 申请教室
	 */
	@RequestMapping("/saveApplyClass")
	public String saveApplyClass(Model model, ApplyClass applyClass) {
	
		String msg = "";
		boolean flag = false;
		System.out.println(applyClass);
		if(!applyClass.getApplyName().isEmpty()) {
			flag = systemInfoService.saveApplyClass(applyClass);
		}
		if(flag) {
			msg =  "申请成功";
		}else 
			msg = "申请失败";
		model.addAttribute("msg", msg);
		return "redirect:getApplyClass";
	}

	/*
	 * 申请教室信息查询
	 */
	@RequestMapping("/getApplyClass")
	public ModelAndView getApplyClass(HttpServletRequest request, HttpServletResponse response, String msg) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/page/class");
		List<ApplyClass> list = systemInfoService.getApplyClass();
		if (list != null) {
			request.getSession().setAttribute("applyClass", list);
			try {
				response.getWriter().write("true");
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			try {
				response.getWriter().write("没有数据");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		request.setAttribute("msg", msg);
		return mav;
	}
	
	/*
	 * 空闲教室查询
	 */
	@RequestMapping("/getFreeClass")
	public ModelAndView getFreeClass(int page, String classid) {
		if(classid==null) {
			classid="1";
		}
		int classId = Integer.parseInt(classid);
		ModelAndView mav = new ModelAndView();
		mav.setViewName("page/freeClass");
		List<FreeClass> freeClass = systemInfoService.getFreeClass(page, classId);
		mav.addObject("freeClass", freeClass);
		return mav;
	}
	
	

	// 遍历文件夹，得到轮播图片的相对地址
	public void save(String path) {
		File file = new File(path);
		File[] files = file.listFiles();// 遍历该目录所有文件和文件夹
		List<String> list = new ArrayList<String>();
		for (int i = 0; i < files.length; i++) {
			// 判断是否是文件夹
			if (files[i].isDirectory()) {
				save(files[i].toString());
			} else {
				if (!files[i].isDirectory()) {// 是文件
					String fileName = files[i].getName();
					fileName = "images" + File.separator + "lbimages" + File.separator + fileName;
					list.add(fileName);
				}
			}
		}
		// 保存图片路径
		systemInfoService.savePicInfo(list);
	}

}
