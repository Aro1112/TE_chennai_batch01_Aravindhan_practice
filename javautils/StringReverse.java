package com.te.javautils;

public class StringReverse {
		
		public String reverse(String str) {
			String str2 = "";
			for (int i = str.length() - 1; i >= 0; i--) {
				  str2 = str2+ str.charAt(i);
			}
			return str2;
		}
	

}
