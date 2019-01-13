package com.spring.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import javax.servlet.http.HttpServletResponse;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Test2 {
	//绝地求生
	
	@RequestMapping("outPut")
	public void outPut(HttpServletResponse response) {
		InputStream in = (InputStream) Test2.class.getClassLoader().getResourceAsStream("cs.txt");
        byte[] bytes = new byte[1024];
        int length;
        try {
			while((length = in.read(bytes)) != -1) {
			    System.out.write(bytes, 0, length);
			    response.setContentType("text/txt;charset=utf-8");
			    response.getOutputStream().write(bytes, 0, length);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       
	}
}
