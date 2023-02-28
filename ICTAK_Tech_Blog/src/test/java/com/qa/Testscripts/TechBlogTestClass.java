package com.qa.Testscripts;

import org.testng.annotations.Test;

import com.qa.ictak_techblog.Base;
import com.qa.pages.LoginPage;
import com.qa.pages.AddNewPost;
import com.qa.pages.NewPost_Trainer;
import com.qa.pages.NewPost_User;
import com.qa.pages.SignUp_Trainer;
import com.qa.pages.SignUp;
import com.qa.pages.SortCategory;
import com.qa.pages.Trainer_login;
import com.qa.pages.User_login;
import com.qa.utils.ExcelUtility;

public class TechBlogTestClass extends Base{
	
		SignUp signup;
		SignUp_Trainer signuptrainer;
		LoginPage admin;
	    User_login  user;
	    Trainer_login trainer;
	    AddNewPost adminnewpost;
		NewPost_User usernewpost;
		NewPost_Trainer trainernewpost;
		SortCategory sort;

	@Test(priority=1)
	public void userVerification() throws Exception
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
		signup.clickSubmit();
		driver.switchTo().alert().accept();
		signup.clickDropdown();
		signup.clickSignup();
		signup.clearData();
		

    	 user=new User_login (driver);
    			user.clickDropdown();
    			user.clickLogin();
    			user.enteruserame(Uemail);
    			user.enterpassword(Upassword);
    			
    			user.Login();
    			
    			usernewpost=new NewPost_User(driver);
    			String title=ExcelUtility.getCellData(0, 0, System.getProperty("user.dir")+"\\src\\main\\resources\\TechBlog.xlsx", 5);
    			String url=ExcelUtility.getCellData(0, 1, System.getProperty("user.dir")+"\\src\\main\\resources\\TechBlog.xlsx", 5);
    			String post=ExcelUtility.getCellData(0, 2, System.getProperty("user.dir")+"\\src\\main\\resources\\TechBlog.xlsx", 5);
    			
    			   			
    			usernewpost.clickNewPost();
    			usernewpost.setTitle(title);		
    			usernewpost.setUrl(url);
    			usernewpost.selectCategory();
    			usernewpost.setPost(post);
    			usernewpost.scrollPageDown();
    			usernewpost.clickSendForApproval();
    			driver.switchTo().alert().accept();	
    			usernewpost.scrollPageUp();
    			usernewpost.clickMyPost();
    			usernewpost.scrollPageDown();
    			usernewpost.scrollPageUp();		
    			
    			sort=new SortCategory(driver);
 
    			sort.clickCategory();
    			sort.clickDropDown();
    			usernewpost.scrollPageDown();
    			usernewpost.scrollPageUp();
    			
    			user.clickLogout();
	}
	
	
	@Test(priority=2)
	public void trainerVerification() throws Exception
	{
		//valid data
		signuptrainer=new SignUp_Trainer(driver);
		signuptrainer.clickDropdown();
		signuptrainer.clickSignup();
		String Tname=ExcelUtility.getCellData(0,0,System.getProperty("user.dir")+"\\src/main/resources/TechBlog.xlsx",1);
		signuptrainer.enterName(Tname);
		signuptrainer.clickAccountType();
		String data="UNDER GRADUATE";
		signuptrainer.clickQualification(data);
		String Temail=ExcelUtility.getCellData(0,1,System.getProperty("user.dir")+"\\src/main/resources/TechBlog.xlsx",1);
		signuptrainer.enterEmail(Temail);
		String Tpassword=ExcelUtility.getCellData(0,2,System.getProperty("user.dir")+"\\src/main/resources/TechBlog.xlsx",1);
		signuptrainer.enterPassword(Tpassword);
		signuptrainer.clickSubmit();
		driver.switchTo().alert().accept();
		signuptrainer.clickDropdown();
		signuptrainer.clickSignup();
		signuptrainer.clearData();
}
}

