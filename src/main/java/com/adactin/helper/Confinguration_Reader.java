package com.adactin.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Confinguration_Reader {
	public static Properties p = new Properties();

	public Confinguration_Reader() throws Throwable {

		File f = new File(
				"C:\\Users\\91805\\eclipse-workspace\\Acucumber\\src\\main\\java\\com\\adactin\\properties\\adactin.properties");
		FileInputStream fis = new FileInputStream(f);
		p.load(fis);
	}

	public String getBrowser() {
		String driver = p.getProperty("browser");
		return driver;

	}

	public String getURL() {
		String url = p.getProperty("url");
		return url;
	}

	public String getUser_Name() {
		String username = p.getProperty("db_username");
		return username;
	}

	public String getPassword() {
		String password = p.getProperty("db_password");
		return password;
	}
}
