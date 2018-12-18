package com.spring.factory;

import java.util.HashMap;
import java.util.Map;

public class StaticFactory {
	private static Map<String, Object> newInstance;
	public StaticFactory() {
		System.out.println("hello world");
	}
	static {
		newInstance = new HashMap<String, Object>();
		System.out.println(newInstance);
		System.out.println("222222222222");
	}
	
/*	public static void test() {
		System.out.println("hello world");
		int id = 1;
		System.out.println(id);
	}*/
	
}
