package com.htglxt.controller;

import java.io.File;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.htglxt.entity.PictureInfo;
import com.htglxt.service.SystemService;

@Controller
public class SystemController {
	
	@Autowired
	private SystemService systemService;

	@RequestMapping("/upload")
	public ModelAndView uploadLbPic(HttpServletRequest request, HttpServletResponse response,
						@RequestParam("picture") MultipartFile picture, Integer state) {		
		
		String newFileName = "";
		ModelAndView mav = new ModelAndView();
		mav.setViewName("page/pictureupload");
		//String path = request.getServletContext().getRealPath("images");
		
		if(picture != null) {
			//	得到上传文件的名称
			String fileName = picture.getOriginalFilename();
			newFileName = UUID.randomUUID().toString() + fileName.substring(fileName.lastIndexOf("."));
			
			//设置保存的目录
			File images = new File("", newFileName);
			if(!images.exists()) {   
				images.mkdirs();
				
			}
			try {
				//保存文件
				picture.transferTo(images);
				PictureInfo info = new PictureInfo();
				String url = "" + File.separator +  newFileName;
				info.setPicUrl(url);
				info.setState(state);
				systemService.addUploadUrl(info);
				mav.addObject("msg", "上传成功");
				mav.addObject("url", url);
				System.out.println(url);
			} catch (Exception e) {
				mav.addObject("msg", "上传失败");
				e.printStackTrace();
			} 
			return mav;
		}
		return mav;
	}
	
}
