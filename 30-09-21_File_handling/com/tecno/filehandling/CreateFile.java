package com.tecno.filehandling;

import java.io.File;

public class CreateFile {

	public void calling() {
		try {
			newFile();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public void newFile() throws Exception {

		File file = new File("C:\\Aravind\\aro\\java.txt");
		boolean isThere = file.exists();
		if (!isThere) {
			file.createNewFile();
			System.out.println("File was created");
		} else {
			throw new Exception("File already exist");

		}
	}

}
