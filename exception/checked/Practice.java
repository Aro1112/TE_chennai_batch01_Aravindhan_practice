package com.te.exception.checked;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Practice {

	public void getData(int a, int b, String fileName) {
		System.out.println(divide(a, b));
		fileRead(fileName);

	}

	public int divide(int a, int b) {
		if(a>0 && b>0) {
			return a/b;
		} else {
			return 0; 
		}
		
	}

	public void fileRead(String fileName) {
		try {
			//File file = new File("C:\\Users\\aravi\\OneDrive\\Desktop\\java.txt");
			Scanner sc = new Scanner(new File(fileName));

			while (sc.hasNext()) {
				System.out.println(sc.nextLine());
			}
			sc.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
