package com.qa.Testscripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.ictak_techblog.Base;
import com.qa.pages.SignUp;
import com.qa.utils.ExcelUtility;

public class TestClassSignup extends Base{
	
	SignUp signup;
	@Test(priority=1)
	public void singup_userVerification() throws Exception
	{
		//valid Data
		signup=new SignUp(driver);
		signup.clickDropdown();
		signup.clickSignup();
		String Uname=ExcelUtility.getCellData(0,0,System.getProperty("user.dir")+"\\src/main/resources/TechBlog.xlsx",0);
		signup.enterName(Uname);
		signup.clickAccountType();
		String Uemail=ExcelUtility.getCellData(0,1,System.getProperty("user.dir")+"\\src/main/resources/TechBlog.xlsx",0);
		signup.enterEmail(Uemail);
		String Upassword=ExcelUtility.getCellData(0,2,System.getProperty("user.dir")+"\\src/main/resources/TechBlog.xlsx",0);
		signup.enterPassword(Upassword);
		boolean expected=true;
		boolean actual=signup.isEnabledSubmit();
		Assert.assertEquals(actual, expected);
		signup.clickSubmit();
		driver.switchTo().alert().accept();
		signup.clickDropdown();
		signup.clickSignup();
		signup.clearData();
		
		//invalid password
		String Uname1=ExcelUtility.getCellData(1,0,System.getProperty("user.dir")+"\\src/main/resources/TechBlog.xlsx",0);
		signup.enterName(Uname1);
		signup.clickAccountType();
		String Uemail1=ExcelUtility.getCellData(1,1,System.getProperty("user.dir")+"\\src/main/resources/TechBlog.xlsx",0);
		signup.enterEmail(Uemail1);
		String Upassword1=ExcelUtility.getCellData(1,2,System.getProperty("user.dir")+"\\src/main/resources/TechBlog.xlsx",0);
		signup.enterPassword(Upassword1);
		signup.clickSubmit();
		signup.clickDropdown();
		signup.clickSignup();
		signup.clearData();
		
		
		//invalid Data
		String Uname2=ExcelUtility.getCellData(2,0,System.getProperty("user.dir")+"\\src/main/resources/TechBlog.xlsx",0);
		signup.enterName(Uname2);
		signup.clickAccountType();
		String Uemail2=ExcelUtility.getCellData(2,1,System.getProperty("user.dir")+"\\src/main/resources/TechBlog.xlsx",0);
		signup.enterEmail(Uemail2);
		String actualmessage=signup.getTextofemail();
		String expectedmessage="Enter Valid Email";
		Assert.assertEquals(actualmessage, expectedmessage);
		String Upassword2=ExcelUtility.getAdminPassword(2,2,System.getProperty("user.dir")+"\\src/main/resources/TechBlog.xlsx",0);
		signup.enterPassword(Upassword2);
		
		signup.clickSubmit();
		signup.clickDropdown();
		signup.clickSignup();
		signup.clearData();
		
		
		//invalid Email
		String Uname3=ExcelUtility.getCellData(3,0,System.getProperty("user.dir")+"\\src/main/resources/TechBlog.xlsx",0);
		signup.enterName(Uname3);
		signup.clickAccountType();
		String Uemail3=ExcelUtility.getCellData(3,1,System.getProperty("user.dir")+"\\src/main/resources/TechBlog.xlsx",0);
		signup.enterEmail(Uemail3);
		String Upassword3=ExcelUtility.getCellData(3,2,System.getProperty("user.dir")+"\\src/main/resources/TechBlog.xlsx",0);
		signup.enterPassword(Upassword3);
		signup.clickSubmit();
		String actualmessage1=signup.getTextofemail();
		String expectedmessage1="Enter Valid Email";
		Assert.assertEquals(actualmessage1, expectedmessage1);
		signup.clickDropdown();
		signup.clickSignup();
		signup.clearData();
		
		
		//full blank	
		
		signup.clickSubmit();	
		
	}
	
	
	@Test(priority=2)
	public void signup_trainerVerification() throws Exception
	{
		//valid data
		signup=new SignUp(driver);
		signup.clickDropdown();
		signup.clickSignup();
		String Tname=ExcelUtility.getCellData(0,0,System.getProperty("user.dir")+"\\src/main/resources/TechBlog.xlsx",1);
		signup.enterName(Tname);
		signup.clickAccountType();
		String data="UNDER GRADUATE";
		signup.clickQualification(data);
		String Temail=ExcelUtility.getCellData(0,1,System.getProperty("user.dir")+"\\src/main/resources/TechBlog.xlsx",1);
		signup.enterEmail(Temail);
		String Tpassword=ExcelUtility.getCellData(0,2,System.getProperty("user.dir")+"\\src/main/resources/TechBlog.xlsx",1);
		signup.enterPassword(Tpassword);
		
		signup.clickSubmit();
		boolean expected=true;
		boolean actual=signup.isEnabledSubmit();
		Assert.assertEquals(actual, expected);
		signup.clickDropdown();
		signup.clickSignup();
		signup.clearData();
		
		//invalid password
				String Tname1=ExcelUtility.getCellData(1,0,System.getProperty("user.dir")+"\\src/main/resources/TechBlog.xlsx",1);
				signup.enterName(Tname1);
				signup.clickAccountType();
				String data1="UNDER GRADUATE";
				signup.clickQualification(data1);				
				String Temail1=ExcelUtility.getCellData(1,1,System.getProperty("user.dir")+"\\src/main/resources/TechBlog.xlsx",1);
				signup.enterEmail(Temail1);
				String Tpassword1=ExcelUtility.getCellData(1,2,System.getProperty("user.dir")+"\\src/main/resources/TechBlog.xlsx",1);
				signup.enterPassword(Tpassword1);
				signup.clickSubmit();
				signup.clickDropdown();
				signup.clickSignup();
				signup.clearData();
				
				
			//invalid Data
				String Tname2=ExcelUtility.getCellData(2,0,System.getProperty("user.dir")+"\\src/main/resources/TechBlog.xlsx",1);
				signup.enterName(Tname2);
				signup.clickAccountType();
				String data2="UNDER GRADUATE";
				signup.clickQualification(data2);
				String Temail2=ExcelUtility.getCellData(2,1,System.getProperty("user.dir")+"\\src/main/resources/TechBlog.xlsx",1);
				signup.enterEmail(Temail2);
				String Tpassword2=ExcelUtility.getCellData(2,2,System.getProperty("user.dir")+"\\src/main/resources/TechBlog.xlsx",1);
				signup.enterPassword(Tpassword2);
				signup.clickSubmit();
				String actualmessage=signup.getTextofemail();
				String expectedmessage="Enter Valid Email";
				Assert.assertEquals(actualmessage, expectedmessage);
				signup.clickDropdown();
				signup.clickSignup();
				signup.clearData();
				
				
				//invalid Email
				String Tname3=ExcelUtility.getCellData(3,0,System.getProperty("user.dir")+"\\src/main/resources/TechBlog.xlsx",1);
				signup.enterName(Tname3);
				signup.clickAccountType();
				String data3="UNDER GRADUATE";
				signup.clickQualification(data3);
				String Temail3=ExcelUtility.getCellData(3,1,System.getProperty("user.dir")+"\\src/main/resources/TechBlog.xlsx",1);
				signup.enterEmail(Temail3);
				String Tpassword3=ExcelUtility.getCellData(3,2,System.getProperty("user.dir")+"\\src/main/resources/TechBlog.xlsx",1);
				signup.enterPassword(Tpassword3);
				signup.clickSubmit();
				String actualmessage1=signup.getTextofemail();
				String expectedmessage1="Enter Valid Email";
				Assert.assertEquals(actualmessage1, expectedmessage1);
				signup.clickDropdown();
				signup.clickSignup();
				signup.clearData();
				
				
 			//full blank

			    signup.clickSubmit();

		
	}
}
	
	