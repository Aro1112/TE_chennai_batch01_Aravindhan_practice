package com.tecno.filehandling;

import java.io.FileInputStream;

import java.io.FileReader;

public class Reader {

	public void calling() {

		try {
			fileReader();
			fileInput();
		} catch (Exception e) {
			System.out.println("error occured");
		}
	}

	public void fileReader() throws Exception {
		FileReader fileReader = new FileReader("C:\\Aravind\\aro\\java.txt");
		int i;
		while ((i = fileReader.read()) != -1) {
			System.out.print((char) i);
		}
		fileReader.close();
		System.out.println();
	}
	
	

	public void fileInput() throws Exception {
		FileInputStream fileInputStream = new FileInputStream("C:\\Aravind\\aro\\java.txt");
		int i;
		while ((i = fileInputStream.read()) != -1) {
			System.out.print((char) i);
		}
		fileInputStream.close();

	}

}
