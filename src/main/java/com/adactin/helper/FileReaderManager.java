package com.adactin.helper;

public class FileReaderManager {
	private FileReaderManager() {
	}

	public static FileReaderManager getInstance() {
		FileReaderManager helper = new FileReaderManager();
		return helper;
	}

//	public  Confinguration_Reader getInstanceReader()  {
//		Confinguration_Reader reader = new Confinguration_Reader();
//		return reader;
//	}
	
	
	public Confinguration_Reader getInstanceReader() throws Throwable {

		Confinguration_Reader reader = new Confinguration_Reader();
		return reader;
		
		
	}
}
