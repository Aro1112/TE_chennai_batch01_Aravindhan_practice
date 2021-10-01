package com.tecno.filehandling;

public class FolderAlreadyExists extends RuntimeException {

	public FolderAlreadyExists(String mesg) {
		super(mesg);
	}
}
