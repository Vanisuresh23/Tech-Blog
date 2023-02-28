package com.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.ictak_techblog.Base;

public class LoginPage1 extends Base{
	
	public LoginPage1(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//a[@id='navbarDropdown'])[2]")
	private WebElement dropDown;
	
	@FindBy(xpath = "//a[text()='Login']")
	private WebElement login;
	
	@FindBy(id = "user")
	private WebElement user;
	
	@FindBy(id = "pwd")
	private WebElement password;
	
	@FindBy(id = "logbut")
	private WebElement loginbutton;
	
	@FindBy(xpath = "//a[text()='logout']")
	private WebElement logout;
	
	public void clickDropDown() throws InterruptedException
	{
		dropDown.click();
		Thread.sleep(3000);
	}
	
	public void clickLogin() throws InterruptedException
	{
		login.click();
		Thread.sleep(3000);
	}
	
	public void enterUserName(String uName) throws InterruptedException
	{
		user.sendKeys(uName);
		Thread.sleep(3000);
	}
	
	public void enterPassword(String pswd) throws InterruptedException
	{
		password.sendKeys(pswd);
		Thread.sleep(3000);
	}
	
	public void clickLoginButton() throws InterruptedException
	{
		loginbutton.click();
		Thread.sleep(3000);
	}
	
	public void scrollPageDown() throws Exception
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(3000);
		
	}
	
	public void scrollPageUp() throws InterruptedException
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
	       js.executeScript("window.scrollTo(0, 0)");
	       Thread.sleep(3000);
	       
	}
	
	public void clickLogout() throws InterruptedException
	{
		Actions actions = new Actions(driver);
		actions.moveToElement(logout).click().perform();
		Thread.sleep(3000);
	}

}
