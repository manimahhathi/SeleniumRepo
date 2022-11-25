package com.training.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.training.base.Basepage;
import com.training.base.Basetest;

public class LoginPage extends Basepage{
	static WebDriver driver;
public LoginPage()
{
super(driver=Basetest.getDriver());
	//Method which accepts String and By object 
addObject("Username", By.id("username"));
addObject("Password", By.id("password"));


}
}