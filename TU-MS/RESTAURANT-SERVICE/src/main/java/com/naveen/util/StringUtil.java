package com.naveen.util;

import org.springframework.stereotype.Component;

@Component
public class StringUtil {
	
	public  static boolean isEmpty(String value) {
	  return "".equals(value.trim()) && value==null;
	}
	public static boolean isNotEmpty(String value) {
		return !isEmpty(value);
	}
}
