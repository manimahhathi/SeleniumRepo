
package com.training.base;

import java.util.HashMap;

import org.bouncycastle.jcajce.provider.digest.GOST3411.HashMac;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Basepage {
	WebDriver driver;
	public HashMap<String,By> ObjRep= new HashMap<String,By>();
	public Basepage(WebDriver driver) {
		this.driver=driver;
	}

	public void addObject(String logicalname,By by)
	{
		ObjRep.put(logicalname, by);
	}
	private WebElement getWebElement(String logicalname) {
		By by=ObjRep.get(logicalname);
		WebElement element=driver.findElement(by);
		return element;
		
	}
	
}
