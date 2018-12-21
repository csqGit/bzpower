package com.system.xianbozhan.controller;

import java.io.IOException;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.system.xianbozhan.entity.Admin;
import com.system.xianbozhan.service.UserLoginService;
import com.system.xianbozhan.service.UserService;
import com.system.xianbozhan.service.impl.UserServiceImpl;

@Controller
public class UserLoginController {
	
	private static int count = 0;
	
	@Autowired
	private UserLoginService userLoginService;
	@Autowired
	private UserService userService;

	@RequestMapping("adminLogin")
	public void login(HttpServletRequest req, HttpServletResponse resp,  String username, String password) {
		Admin admin = null;
		Cookie cook = null;
		String msg = "";
		try {
			 admin = userLoginService.getAdminByUserName(username);
			if(admin == null) {
				msg = "用户名输入错误!!!";
				req.setAttribute("msg", msg);
				cook = new Cookie("msg", msg);
				resp.addCookie(cook);
				//return "login.html";
				resp.sendRedirect("index.html");
			}else {
				admin = userLoginService.login(username, password);
				if(admin == null) {
					msg = "密码输入错误!!!";
					req.setAttribute("msg", msg);
					cook = new Cookie("msg", msg);
					resp.addCookie(cook);
					//return "login.html";
					resp.sendRedirect("login.html");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			msg = "登录失败!!!";
			cook = new Cookie("msg", msg);
			resp.addCookie(cook);
			//return "login.html";
			try {
				resp.sendRedirect("login.html");
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		req.getSession().setAttribute("admin", admin);
		Cookie name = new Cookie("name", admin.getName());
		//name.setMaxAge(30000);//30分钟自动销毁cookie
		//当管理员登陆时，累计次数加1
		count ++;
		//得到用户总数
		UserServiceImpl userServiceImpl = (UserServiceImpl) userService;
		int num = userServiceImpl.getCount();
		//总数
		Cookie numCookie = new Cookie("numCookie" , num + "");
		//当前数
		Cookie countCookie = new Cookie("countCookie", count + "");
		//离线数
		Cookie lxCookie = new Cookie("lxCookie", (num - count) + "");
		resp.addCookie(name);
		resp.addCookie(numCookie);
		resp.addCookie(countCookie);
		resp.addCookie(lxCookie);
		System.out.println("总数：" + num);
		System.out.println("当签署：" + count);
		System.out.println("离线数：" + (num - count));
		try {
			resp.sendRedirect("index.html");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//return "index.html";
	}
	
	//用户注销
	@RequestMapping("logOut")
	public String logOut(HttpServletRequest request) {
		HttpSession session = request.getSession();
		//Admin admin = (Admin) session.getAttribute("admin");
		//session.invalidate();
		session.removeAttribute("admin");
		return "login.html";
	}
}
