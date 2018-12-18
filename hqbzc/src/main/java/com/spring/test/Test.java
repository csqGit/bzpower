package com.spring.test;

import java.io.File;

import javax.servlet.http.HttpServletRequest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Test {
	public static void main(String[] args) {
//		ApplicationContext app = new ClassPathXmlApplicationContext("bean.xml");
//		Student student = new Student();
//		student.setId(2);
//		student.setName("张三");
//		Student stu = (Student) app.getBean(Student.class, 2);
//		System.out.println(stu);
		
//		test("")
//		String path = "/images";
//		test(path);
		int t = mm(3);
		System.out.println(t);
		
	}
	static int mm(int temp) {
		if(temp == 1)
			return temp;
		
		return temp + mm(temp - 1);
	}
	
	//遍历文件夹
	public static void test(String path) {
		File file = new File(path);
		File[] files = file.listFiles();//遍历该目录所有文件和文件夹
		for(int i = 0; i < files.length; i ++) {
			//判断是否是文件夹
			if(files[i].isDirectory()) {
				test(files[i].toString());
			}
			else {
				if(!files[i].isDirectory()) {//是文件
					System.out.println(files[i]);
				}
			}
		}
	}

}
