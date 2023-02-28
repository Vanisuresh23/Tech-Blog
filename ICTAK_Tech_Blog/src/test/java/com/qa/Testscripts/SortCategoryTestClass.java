package com.qa.Testscripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.ictak_techblog.Base;
import com.qa.pages.LoginPage;
import com.qa.pages.SortCategory;
import com.qa.utils.ExcelUtility;

public class SortCategoryTestClass extends Base{
	
	LoginPage login;
	SortCategory sort;
	
	
	@Test(priority = 1)
	public void sortCategoryByAnyUserVerification() throws Exception
	{
		
		login=new LoginPage(driver);
		sort=new SortCategory(driver);
		
		sort.clickCategory();		
		sort.clickDropDown();
		login.scrollPageDown();
		String actual=sort.getTextofPost();
		String expected="DB";
		Assert.assertEquals(actual, expected);
		login.scrollPageDown();
		login.scrollPageUp();
		
	}
	
	@Test(priority = 2)
	public void sortCategoryByAdminVerification() throws Exception
	{
		
		login=new LoginPage(driver);
		sort=new SortCategory(driver);
		

		String email=ExcelUtility.getCellData(0, 0, System.getProperty("user.dir")+"\\src\\main\\resources\\TechBlog.xlsx", 2);
		String password=ExcelUtility.getAdminPassword(0,1, System.getProperty("user.dir")+"\\src\\main\\resources\\TechBlog.xlsx", 2);
		
		login.clickDropdown();
		login.clickLogin();		
		login.enteruserame(email);
		login.enterpassword(password);
		login.Login();
		
		
		sort.clickCategory();
		sort.clickDropDown();
		String actual=sort.getTextofPost();
		String expected="DB";
		Assert.assertEquals(actual, expected);
		login.scrollPageDown();
		login.scrollPageUp();
		login.clickLogout();
		
	}
	
	@Test(priority = 3)
	public void sortCategoryByUserVerification() throws Exception
	{
		
		login=new LoginPage(driver);
		sort=new SortCategory(driver);
		

		String email=ExcelUtility.getCellData(4, 0, System.getProperty("user.dir")+"\\src\\main\\resources\\TechBlog.xlsx", 0);
		String password=ExcelUtility.getCellData(4,1, System.getProperty("user.dir")+"\\src\\main\\resources\\TechBlog.xlsx", 0);
		
		login.clickDropdown();
		login.clickLogin();		
		login.enteruserame(email);
		login.enterpassword(password);
		login.Login();
		sort.clickCategory();
		sort.clickDropDown();
		String actual=sort.getTextofPost();
		String expected="DB";
		Assert.assertEquals(actual, expected);
		login.scrollPageDown();
		login.scrollPageUp();
		login.clickLogout();
		
	}
	
	@Test(priority = 4)
	public void sortCategoryByTrainerVerification() throws Exception
	{
		
		login=new LoginPage(driver);
		sort=new SortCategory(driver);
		

		String email=ExcelUtility.getCellData(4, 0, System.getProperty("user.dir")+"\\src\\main\\resources\\TechBlog.xlsx", 1);
		String password=ExcelUtility.getCellData(4,1, System.getProperty("user.dir")+"\\src\\main\\resources\\TechBlog.xlsx", 1);
		
		login.clickDropdown();
		login.clickLogin();		
		login.enteruserame(email);
		login.enterpassword(password);
		login.Login();
		
		
		sort.clickCategory();
		sort.clickDropDown();
		String actual=sort.getTextofPost();
		String expected="DB";
		Assert.assertEquals(actual, expected);
		login.scrollPageDown();
		login.scrollPageUp();
		login.clickLogout();
		
	}
	
	

}
