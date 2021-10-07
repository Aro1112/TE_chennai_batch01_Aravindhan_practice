package com.te.exception;

import java.nio.file.FileAlreadyExistsException;

public class ThrowKey {
	
	public void getInput(String Username, String pwd) {
		try {
			logIn(Username, pwd);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void logIn(String Username, String pwd) throws  Exception {
		
		if (Username.equalsIgnoreCase("admin")) {
			if (pwd.equalsIgnoreCase("admin123")) {
				System.out.println("Logged in successfully");
			} else {
				throw new IllegalAccessException("wrong password");
			} 
		} else {
			throw new FileAlreadyExistsException("wrong credential");
			
		}
	}

}
