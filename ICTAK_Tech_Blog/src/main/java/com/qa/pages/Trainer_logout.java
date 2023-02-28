package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.ictak_techblog.Base;

public class Trainer_logout extends Base {
	
	@FindBy(xpath="(//a[@id='navbarDropdown'])[2]")
	private WebElement navDropdown;
	@FindBy(xpath = "//a[text()='Login']")
	private WebElement login;
	@FindBy(id="user")
	private WebElement username;
	@FindBy(id="pwd")
	private WebElement password;
	@FindBy(id = "logbut")
	private WebElement loginbutton;
	@FindBy(xpath="//a[text()='logout']")
	private WebElement logout;
	
	public Trainer_logout(WebDriver driver) {
		this.driver=driver;
	PageFactory.initElements(driver, this);
	}
	public void clickDropdown()throws Exception {
		navDropdown.click();
	Thread.sleep(3000);
	}
	public void clicklogin()throws Exception {
		login.click();
	Thread.sleep(3000);
	}
	public void enterUsername(String name) throws Exception {
	username.sendKeys(name);
	Thread.sleep(3000);
    }
    public void enterpassword(String pwd)throws Exception {
    	password.sendKeys(pwd);
    Thread.sleep(3000);
    }
    public void clickLoginButton() throws InterruptedException
	{
		loginbutton.click();
		Thread.sleep(3000);
	}
    public void clickLogout()throws Exception {
    	logout.click();
    Thread.sleep(3000);
    }

}
