package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.qa.ictak_techblog.Base;

public class SortCategory extends Base{
	
	@FindBy(xpath = "//p[text()='Categories']")
	private WebElement category;
	
	@FindBy(xpath = "//a[text()='DB']")
	private WebElement dropDown;
	

	@FindBy(xpath = "//h2[text()='DB']")
	private WebElement heading;
	
	public SortCategory(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);		
	}
	
	public void clickCategory() throws InterruptedException 
	{
		category.click();
		Thread.sleep(3000);
	}
	
	public void clickDropDown() throws InterruptedException 
	{
		dropDown.click();
		Thread.sleep(3000);
	}
	
	public String getTextofPost()
	{	
		String actualtext=heading.getText();	
		return actualtext;
	}

}
