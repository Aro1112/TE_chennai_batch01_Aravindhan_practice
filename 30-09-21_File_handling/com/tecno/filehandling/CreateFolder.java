package com.tecno.filehandling;

import java.io.File;

public class CreateFolder {

	public void calling() {
		try {
			folder();
		} catch ( FolderAlreadyExists e) {
			System.out.println(e.getMessage());
		}
	}

	public void folder()    {
		File ref = new File("C:\\Aravind\\aro");
		boolean isThere = ref.exists();
		if (!isThere) {
			ref.mkdir();
			System.out.println("Floder was created");
		} else {
			throw new FolderAlreadyExists("Folder already exist!!!");
		}
	}
}
