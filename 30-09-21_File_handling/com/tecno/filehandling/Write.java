package com.tecno.filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class Write {
	
	public void calling() {
		
		try {
			writefile();
			System.out.println("successfully wrote to the file");
		} catch (IOException e) {
			System.out.println("error occured");
		}
		
	}

	public void writefile() throws IOException {
		
		FileWriter fileWriter = new FileWriter("C:\\Aravind\\aro\\java.txt");
		fileWriter.write("Hi Hellooo alll !!!!");
		fileWriter.close();
		
	}
}
