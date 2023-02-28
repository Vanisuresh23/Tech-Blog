package com.qa.Testscripts;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.qa.pages.AddNewPost;
import com.qa.utils.ExcelUtility;
import com.qa.ictak_techblog.Base;
import com.qa.pages.LoginPage;

public class NewPostTestClass extends Base{
	
	LoginPage login;
	AddNewPost newpost;
	
	
	// valid data for admin	
	
	@Test(priority = 1)
	public void adminNewPostVerification() throws Exception
	{
		login=new LoginPage(driver);
		newpost=new AddNewPost(driver);		
		
		String email=ExcelUtility.getCellData(0, 0, System.getProperty("user.dir")+"\\src\\main\\resources\\TechBlog.xlsx", 2);
		String password=ExcelUtility.getAdminPassword(0,1, System.getProperty("user.dir")+"\\src\\main\\resources\\TechBlog.xlsx", 2);
		String title=ExcelUtility.getCellData(0, 0, System.getProperty("user.dir")+"\\src\\main\\resources\\TechBlog.xlsx", 3);
		String url=ExcelUtility.getCellData(0, 1, System.getProperty("user.dir")+"\\src\\main\\resources\\TechBlog.xlsx", 3);
		String post=ExcelUtility.getCellData(0, 2, System.getProperty("user.dir")+"\\src\\main\\resources\\TechBlog.xlsx", 3);
		
		login.clickDropdown();
		login.clickLogin();		
		login.enteruserame(email);
		login.enterpassword(password);
		login.Login();
		
		newpost.clickActions();
		newpost.clickNewPost();
		newpost.setTitle(title);
		newpost.setUrl(url);
		newpost.selectCategory();
		newpost.setPost(post);
		newpost.scrollPageDown();
		newpost.clickSubmit();
		Alert alert = driver.switchTo().alert();
		String alertMessage = alert.getText();
		Assert.assertEquals(alertMessage, "New Post Added", "Not getting Alert Message");
		alert.accept();
		
		newpost.scrollPageUp();
		newpost.clickMyPost();
		newpost.scrollPageDown();
		String actual = newpost.getTextOfMyPost();
		String expected = "Cyber Security";
		Assert.assertEquals(actual, expected);
		newpost.scrollPageUp();
		
	//invalid newpost
		
		newpost.clickActions();
		newpost.clickNewPost();
		newpost.scrollPageDown();
		boolean expectedvalue=false;
		boolean actualvalue=newpost.isEnabledSubmitButton();
		Assert.assertEquals(actualvalue, expectedvalue);
		newpost.scrollPageUp();
		newpost.clickLogout();
		
	}
		
		// valid data for user
	
	@Test(priority = 2)	
	public void userNewPostVerification() throws Exception
	{
		login=new LoginPage(driver);
		newpost=new AddNewPost(driver);
		
		
		String email=ExcelUtility.getCellData(4, 0, System.getProperty("user.dir")+"\\src\\main\\resources\\TechBlog.xlsx", 0);
		String password=ExcelUtility.getCellData(4,1, System.getProperty("user.dir")+"\\src\\main\\resources\\TechBlog.xlsx", 0);
		String title=ExcelUtility.getCellData(0, 0, System.getProperty("user.dir")+"\\src\\main\\resources\\TechBlog.xlsx", 5);
		String url=ExcelUtility.getCellData(0, 1, System.getProperty("user.dir")+"\\src\\main\\resources\\TechBlog.xlsx", 5);
		String post=ExcelUtility.getCellData(0, 2, System.getProperty("user.dir")+"\\src\\main\\resources\\TechBlog.xlsx", 5);
		
		login.clickDropdown();
		login.clickLogin();		
		login.enteruserame(email);
		login.enterpassword(password);
		login.Login();
		
		newpost.clickNewPost();
		newpost.setTitle(title);		
		newpost.setUrl(url);
		newpost.selectCategory();
		newpost.setPost(post);
		newpost.scrollPageDown();
		newpost.clickSendForApproval();
		Alert alert = driver.switchTo().alert();
		String alertMessage = alert.getText();
		Assert.assertEquals(alertMessage, "Post send for approval from admin", "Not getting Alert Message");
		alert.accept();
		newpost.scrollPageUp();
		newpost.clickMyPost();
		newpost.scrollPageDown();
		newpost.scrollPageUp();	
	
	//invalid user
		
		newpost.clickNewPost();
		newpost.scrollPageDown();
		boolean expectedValue = false;
		boolean actualValue = newpost.isEnabledSendForApproval();
		Assert.assertEquals(actualValue, expectedValue);
		newpost.scrollPageUp();
		newpost.clickLogout();
		
	}
	
		// valid data for Trainer
	
	@Test(priority = 3)	
	public void trainerNewPostVerification() throws Exception
	{
		
		login=new LoginPage(driver);
		newpost=new AddNewPost(driver);
		
		String email=ExcelUtility.getCellData(4, 0, System.getProperty("user.dir")+"\\src\\main\\resources\\TechBlog.xlsx", 1);
		String password=ExcelUtility.getCellData(4,1, System.getProperty("user.dir")+"\\src\\main\\resources\\TechBlog.xlsx", 1);
		String title=ExcelUtility.getCellData(0, 0, System.getProperty("user.dir")+"\\src\\main\\resources\\TechBlog.xlsx", 4);
		String url=ExcelUtility.getCellData(0, 1, System.getProperty("user.dir")+"\\src\\main\\resources\\TechBlog.xlsx", 4);
		String post=ExcelUtility.getCellData(0, 2, System.getProperty("user.dir")+"\\src\\main\\resources\\TechBlog.xlsx", 4);
		
		login.clickDropdown();
		login.clickLogin();		
		login.enteruserame(email);
		login.enterpassword(password);
		login.Login();
		
		newpost.clickNewPost();
		newpost.setTitle(title);
		newpost.setUrl(url);
		newpost.selectCategory();
		newpost.setPost(post);
		newpost.scrollPageDown();
		newpost.clickSubmit();
		Alert alert=driver.switchTo().alert();
		String alertmessage=alert.getText();
		Assert.assertEquals(alertmessage, "New Post Added", "Actual alert message is not matching with expected");
		alert.accept();
		newpost.scrollPageUp();
		newpost.scrollPageDown();
		newpost.scrollPageUp();
		
	//invalid trainer
		
		newpost.clickNewPost();	
		newpost.scrollPageDown();
		boolean expectedValue = false;
		boolean actualValue = newpost.isEnabledSendForApproval();
		Assert.assertEquals(actualValue, expectedValue);
		newpost.scrollPageUp();
		newpost.clickLogout();		
		
	}
	
		
	
			
			// Links in admin page
			
			@Test(priority = 4)
			public void adminNewPostLinkVerification() throws Exception
			{
				login=new LoginPage(driver);
				newpost=new AddNewPost(driver);
				
				String email=ExcelUtility.getCellData(0, 0, System.getProperty("user.dir")+"\\src\\main\\resources\\TechBlog.xlsx", 2);
				String password=ExcelUtility.getAdminPassword(0,1, System.getProperty("user.dir")+"\\src\\main\\resources\\TechBlog.xlsx", 2);
						
				login.clickDropdown();
				login.clickLogin();		
				login.enteruserame(email);
				login.enterpassword(password);
				login.Login();
				
				newpost.clickActions();
				newpost.clickNewPost();
				newpost.scrollPageDown();
				newpost.clickHome();
				String actualTitleHome=newpost.getHomeTitle();
				String expectedTitleHome="WELCOME TO ICTAK TECH BLOG";
				Assert.assertEquals(actualTitleHome, expectedTitleHome);
				driver.navigate().back();
				newpost.scrollPageDown();
				newpost.clickContactUs();
				newpost.scrollPageUp();
				String actualTitleContactUs=newpost.getContactUsTitle();
				String expectedTitleContactUs="CONTACT US";
				Assert.assertEquals(actualTitleContactUs, expectedTitleContactUs);
				driver.navigate().back();
				newpost.scrollPageDown();
				newpost.clickAboutUs();
				login.scrollPageUp();
				String actualTitleAboutUs=newpost.getAboutUsTitle();
				String expectedTitleAboutUs="ABOUT US";
				Assert.assertEquals(actualTitleAboutUs, expectedTitleAboutUs);
				driver.navigate().back();
				login.scrollPageUp();
				newpost.clickLogout();
			}
		
			
			// Links in user page
			
			@Test(priority = 5)
			public void userNewPostLinkVerification() throws Exception
			{
							
				login=new LoginPage(driver);
				newpost=new AddNewPost(driver);
							
				String email=ExcelUtility.getCellData(4, 0, System.getProperty("user.dir")+"\\src\\main\\resources\\TechBlog.xlsx", 0);
				String password=ExcelUtility.getCellData(4,1, System.getProperty("user.dir")+"\\src\\main\\resources\\TechBlog.xlsx", 0);
										
				login.clickDropdown();
				login.clickLogin();		
				login.enteruserame(email);
				login.enterpassword(password);
				login.Login();
							
				newpost.clickNewPost();
				newpost.scrollPageDown();
				newpost.clickHome();
				String actualTitleHome=newpost.getHomeTitle();
				String expectedTitleHome="WELCOME TO ICTAK TECH BLOG";
				Assert.assertEquals(actualTitleHome, expectedTitleHome);
				driver.navigate().back();
				newpost.scrollPageDown();
				newpost.clickContactUs();
				newpost.scrollPageUp();
				String actualTitleContactUs=newpost.getContactUsTitle();
				String expectedTitleContactUs="CONTACT US";
				Assert.assertEquals(actualTitleContactUs, expectedTitleContactUs);
				driver.navigate().back();
				newpost.scrollPageDown();
				newpost.clickAboutUs();
				String actualTitleAboutUs=newpost.getAboutUsTitle();
				String expectedTitleAboutUs="ABOUT US";
				Assert.assertEquals(actualTitleAboutUs, expectedTitleAboutUs);
				login.scrollPageUp();
				newpost.clickLogout();
				
			}
					
			
			// Links in trainer page
			
			@Test(priority = 6)
			public void trainerNewPostLinkVerification() throws Exception
			{
				
				login=new LoginPage(driver);
				newpost=new AddNewPost(driver);
				
				String email=ExcelUtility.getCellData(4, 0, System.getProperty("user.dir")+"\\src\\main\\resources\\TechBlog.xlsx", 1);
				String password=ExcelUtility.getCellData(4,1, System.getProperty("user.dir")+"\\src\\main\\resources\\TechBlog.xlsx", 1);
								
				login.clickDropdown();
				login.clickLogin();		
				login.enteruserame(email);
				login.enterpassword(password);
				login.Login();
				
				newpost.clickNewPost();	
				newpost.scrollPageDown();
				newpost.clickHome();
				String actualTitleHome=newpost.getHomeTitle();
				String expectedTitleHome="WELCOME TO ICTAK TECH BLOG";
				Assert.assertEquals(actualTitleHome, expectedTitleHome);
				driver.navigate().back();
				newpost.scrollPageDown();;
				newpost.clickContactUs();
				newpost.scrollPageUp();
				String actualTitleContactUs=newpost.getContactUsTitle();
				String expectedTitleContactUs="CONTACT US";
				Assert.assertEquals(actualTitleContactUs, expectedTitleContactUs);
				driver.navigate().back();
				newpost.scrollPageDown();
				newpost.clickAboutUs();	
				String actualTitleAboutUs=newpost.getAboutUsTitle();
				String expectedTitleAboutUs="ABOUT US";
				Assert.assertEquals(actualTitleAboutUs, expectedTitleAboutUs);
				login.scrollPageUp();
				newpost.clickLogout();
			}
			
			
			
			@Test(priority = 7)
			public void copyRightFormatVerification() throws Exception
			{
				login=new LoginPage(driver);
				newpost=new AddNewPost(driver);
				
				
				String email=ExcelUtility.getCellData(0, 0, System.getProperty("user.dir")+"\\src\\main\\resources\\TechBlog.xlsx", 2);
				String password=ExcelUtility.getAdminPassword(0,1, System.getProperty("user.dir")+"\\src\\main\\resources\\TechBlog.xlsx", 2);

				login.clickDropdown();
				login.clickLogin();		
				login.enteruserame(email);
				login.enterpassword(password);
				login.Login();
				
				newpost.clickActions();
				newpost.clickNewPost();
				
				newpost.scrollPageDown();
				String actual=newpost.getTextOfCopyRight();
				String expected="Copyright©2021";		
				Assert.assertEquals(actual, expected, "The format is different");
				newpost.scrollPageUp();
				newpost.clickLogout();	
			}
			
			@Test(priority = 8)
			public void urlFormatVerification() throws Exception
			{
				login=new LoginPage(driver);
				newpost=new AddNewPost(driver);
				
				
				String email=ExcelUtility.getCellData(0, 0, System.getProperty("user.dir")+"\\src\\main\\resources\\TechBlog.xlsx", 2);
				String password=ExcelUtility.getAdminPassword(0,1, System.getProperty("user.dir")+"\\src\\main\\resources\\TechBlog.xlsx", 2);
				String title=ExcelUtility.getCellData(3, 0, System.getProperty("user.dir")+"\\src\\main\\resources\\TechBlog.xlsx", 3);
				String url=ExcelUtility.getCellData(3, 1, System.getProperty("user.dir")+"\\src\\main\\resources\\TechBlog.xlsx", 3);
				String post=ExcelUtility.getCellData(3, 2, System.getProperty("user.dir")+"\\src\\main\\resources\\TechBlog.xlsx", 3);
				
				login.clickDropdown();
				login.clickLogin();		
				login.enteruserame(email);
				login.enterpassword(password);
				login.Login();
				
				newpost.clickActions();
				newpost.clickNewPost();
				newpost.setTitle(title);
				newpost.setUrl(url);
				newpost.selectCategory();
				newpost.setPost(post);
				newpost.scrollPageDown();
				newpost.clickSubmit();
				driver.switchTo().alert().accept();
				newpost.scrollPageUp();
				newpost.clickMyPost();
				newpost.scrollPageDown();
				newpost.scrollPageUp();
				newpost.clickLogout();
				
			}
			
			
			
}
