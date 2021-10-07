package com.te.exception.checked;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileRead {
	public static void main(String[] args) {
		
		try {
			File file = new File("C:\\Users\\aravi\\OneDrive\\Desktop\\java.txt");
			Scanner sc = new Scanner(file);
			
			while(sc.hasNext()) {
				System.out.println(sc.nextLine());
			}
			sc.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}