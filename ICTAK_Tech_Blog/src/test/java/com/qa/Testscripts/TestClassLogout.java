package com.qa.Testscripts;

import org.testng.annotations.Test;

import com.qa.ictak_techblog.Base;
import com.qa.pages.LoginPage;
import com.qa.pages.LogoutPage;
import com.qa.utils.ExcelUtility;

public class TestClassLogout extends Base {
	
	LoginPage login;
	LogoutPage logout;
	
	@Test(priority=1)
	public void Logoutasadmin()throws Exception {
		
		login=new LoginPage(driver);
		logout=new LogoutPage(driver);
	
		logout.clickDropdown();
		logout.clickLogin();
		
	String username=ExcelUtility.getCellData(0, 0, System.getProperty("user.dir")+"\\src\\main\\resources\\TechBlog.xlsx", 2);
	String password=ExcelUtility.getAdminPassword(0, 1, System.getProperty("user.dir")+"\\src\\main\\resources\\TechBlog.xlsx",2);
	login.enteruserame(username);
	login.enterpassword(password);
	login.Login();
	logout.clickLogout();
	
	}
	
	@Test(priority=2)
	public void LogoutasUser()throws Exception {
		login=new LoginPage(driver);
		logout=new LogoutPage(driver);
		login.clickDropdown();
		login.clickLogin();
		
	String username=ExcelUtility.getCellData(0, 1, System.getProperty("user.dir")+"\\src\\main\\resources\\TechBlog.xlsx", 0);
	String password=ExcelUtility.getCellData(0, 2, System.getProperty("user.dir")+"\\src\\main\\resources\\TechBlog.xlsx", 0);
	login.enteruserame(username);
	login.enterpassword(password);
	login.Login();
	logout.clickLogout();
   
	}
	
	@Test(priority=3)
	public void LogoutasTrainer()throws Exception {
		login=new LoginPage(driver);
		logout=new LogoutPage(driver);
		login.clickDropdown();
		login.clickLogin();
		
	String username=ExcelUtility.getCellData(0, 1, System.getProperty("user.dir")+"\\src\\main\\resources\\TechBlog.xlsx", 1);
	String password=ExcelUtility.getCellData(0, 2, System.getProperty("user.dir")+"\\src\\main\\resources\\TechBlog.xlsx", 1);
	login.enteruserame(username);
	login.enterpassword(password);
	login.Login();
	logout.clickLogout();
	
	
	}
	
		
	}
	
	


