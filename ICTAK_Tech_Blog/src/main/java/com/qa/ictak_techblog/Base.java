package com.qa.ictak_techblog;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Base {
	
	public WebDriver driver;
	public static Properties prop=null;
	@BeforeTest
	public void onSetup() throws IOException, InterruptedException 
	{
		prop=new Properties();
		FileInputStream pFile=new FileInputStream(System.getProperty("user.dir")+"//src//test//resources//config.properties");
		prop.load(pFile);
		 driver=new ChromeDriver();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}
	@AfterTest
	public void closeWebsite() throws InterruptedException
	{
		
		Thread.sleep(3000);
		driver.close();
		
	}

}



