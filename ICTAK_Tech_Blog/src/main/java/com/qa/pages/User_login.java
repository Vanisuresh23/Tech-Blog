package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.ictak_techblog.Base;

public class User_login extends Base {
	@FindBy(xpath = "(//a[@id='navbarDropdown'])[2]")
	private WebElement navDropdown;
	@FindBy(xpath ="//a[(@href='/login')]")
	private WebElement login;
	@FindBy(id="user")
	private WebElement username;
	@FindBy(id="pwd")
	private WebElement password;
	@FindBy(id="logbut")
	private WebElement log1;
	@FindBy(xpath="//a[text()='logout']")
	private WebElement logout;
	
	
	public User_login (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void clickDropdown() throws Exception
	{
		navDropdown.click();
		Thread.sleep(3000);
	}
	public void clickLogin() throws Exception
	{
		login.click();
		Thread.sleep(3000);
	}
	public void enteruserame(String Name) throws Exception
	{
		username.sendKeys(Name);
		Thread.sleep(3000);
	}
	public void enterpassword(String pwd) throws Exception
{
        
		password.sendKeys(pwd);
		Thread.sleep(3000);
	}
	public void Login() throws Exception
	{
	log1.click();	
	Thread.sleep(3000);
	
	
}
	public void clickLogout() throws Exception
	{
		logout.click();
		Thread.sleep(3000);
	}
	
}
