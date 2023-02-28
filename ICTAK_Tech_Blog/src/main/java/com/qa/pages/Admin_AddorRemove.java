package com.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.qa.ictak_techblog.Base;

public class Admin_AddorRemove extends Base {
	
	
	@FindBy(xpath="//p[text()=' Actions']")
	private WebElement clickaction;
	@FindBy(xpath="//a[text()='Add/Remove category']")
	private WebElement  addorremove;
	@FindBy (name="category")
	private WebElement enternewcategory;
	@FindBy (xpath="//button[text()='Add']")
	private WebElement add;
	@FindBy(xpath="//li[text()='TESTING ']")
	private WebElement newcategory;
	@FindBy(xpath="(//button[text()='Remove'])[12]")
	private WebElement remove;
	@FindBy(xpath="//a[text()='logout']")
	private WebElement logout;
	
	
	
	public Admin_AddorRemove (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void clickactions() throws Exception
	{
		clickaction.click();
		Thread.sleep(3000);
	}
	
	public void addorremovecategory() throws Exception
	{
		addorremove.click();
		Thread.sleep(3000);
	}
	
	public void setCategory(String name) throws Exception
	{
		//enternewcategory.click();
		enternewcategory.sendKeys(name);
		Thread.sleep(3000);
	}
	
	public void clickAdd() throws Exception
	{
		add.click();
		Thread.sleep(3000);
	}
	public void clickRemove() throws Exception
	{
		remove.click();
		Thread.sleep(3000);
	}
	public void clickLogout() throws Exception
	{
		logout.click();
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
	
	
}



