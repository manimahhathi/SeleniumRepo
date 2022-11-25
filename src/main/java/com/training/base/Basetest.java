package com.training.base;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.training.utilities.commonutilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Basetest {
	static  WebDriver driver;
	
	static commonutilities common=new commonutilities();

	public static void launchapplication() throws IOException
	{
		String url=common.getproperty("url");
		getDriver().get(url);		
		}
	


	public static WebDriver getDriver() {
		if(driver==null) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			
		}
		return driver;
	}
}
