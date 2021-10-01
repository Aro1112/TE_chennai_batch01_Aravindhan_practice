package com.tecno.filehandling;

import java.io.File;
import java.io.FileNotFoundException;

public class Delete {
	
	public void  calling() {
		try {
			deleteFile();
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());		}
		
	}

		public void deleteFile() throws FileNotFoundException {
			File file = new File("C:\\Aravind\\aro\\java.txt");
			boolean isThere= file.exists();
			if(isThere) {
				file.delete();
				System.out.println("File was deleted");
			} else {
				throw new FileNotFoundException("File not found");
			}
		
		}
	
}
