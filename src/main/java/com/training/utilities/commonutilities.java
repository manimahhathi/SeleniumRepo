package com.training.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public  class commonutilities {
	public String getproperty(String key) throws IOException
	{
		//file path
		//String spath="C:\\Users\\edara\\eUSER_DIRclipse-workspace\\CucumberSalesforce\\properties\\application.properties";
		
		String spath=Constants.USER_DIR+Constants.FILE_SEPARATOR+Constants.APPLICATION_PROPERTIES;
		
		//fileInputStream
		System.out.println(spath);
		FileInputStream fileput = new FileInputStream(spath);
		Properties properties=new Properties();
		properties.load(fileput);
		String value=properties.getProperty(key);
		return value;
	}
}
