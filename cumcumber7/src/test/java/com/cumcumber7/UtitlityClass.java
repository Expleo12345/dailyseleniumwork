package com.cumcumber7;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
 
public class UtitlityClass {
	String strUserName,strPassword,strUrl;
	public UtitlityClass(){
		credentials();
	}
	public void credentials() {
File file = new File("C:\\Users\\vbalamurugan\\eclipse-workspace\\cumcumber7\\src\\test\\resources\\Features\\Logincrendentials.properties");

		
		FileInputStream fileInput = null;
		try {
			fileInput = new FileInputStream(file);
		} catch(FileNotFoundException e) {
			e.printStackTrace();			
		}
		
		Properties property = new Properties();
		
		try {
			property.load(fileInput);
		} catch(IOException e) {
			e.printStackTrace();
		}
		strUrl=property.getProperty("url");
		strUserName = property.getProperty("username");
		strPassword = property.getProperty("password");
	}
 
}
