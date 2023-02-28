package com.qa.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.ictak_techblog.Base;

public class SignUp_Trainer extends Base{
	
	@FindBy(xpath = "(//a[@id='navbarDropdown'])[2]")
	private WebElement navDropdown;
	@FindBy(xpath="//a[text()='Signup']")
	private WebElement signUp;
	@FindBy(id="first")
	private WebElement name;
	@FindBy(xpath="//select[@formcontrolname='id']")
	private WebElement accountType;
	@FindBy(xpath="//select[@formcontrolname='qualification']")
	private WebElement qualification;
	@FindBy(id="em")
	private WebElement email;
	@FindBy(id="pw")
	private WebElement password;
	@FindBy(id="but")
	private WebElement submit;
	/*@FindBy(xpath="//u[text()='signup']")
	private WebElement signupback;*/
	public SignUp_Trainer(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickDropdown() throws Exception
	{
		navDropdown.click();
		Thread.sleep(3000);
	}
	public void clickSignup() throws Exception
	{
		signUp.click();
		Thread.sleep(3000);
	}
	public void enterName(String trainerName) throws Exception
	{
		name.sendKeys(trainerName);
		Thread.sleep(3000);
	}
	public void clickAccountType() throws Exception
	{
		accountType.click();
		Select select = new Select(accountType);
		select.selectByVisibleText("trainer");
		Thread.sleep(3000);
		
	}
	public void clickQualification(String qualification1)
	{
		qualification.click();
		Select select=new Select(qualification);
		select.selectByVisibleText(qualification1);
		
	}	
	
	public void enterEmail(String trainerEmail) throws Exception
	{
		email.sendKeys(trainerEmail);
		Thread.sleep(3000);
	}
	public void enterPassword(String trainerPassword) throws Exception
	{
		password.sendKeys(trainerPassword);
		Thread.sleep(3000);
	}
	public void clickSubmit() throws Exception
	{
		Actions actions = new Actions(driver);
		actions.moveToElement(submit).click().perform();
		Thread.sleep(3000);
//		submit.sendKeys(Keys.ENTER);
//		Thread.sleep(3000);
	}
	
	public void clearData()
	{
		name.clear();
		email.clear();
		password.clear();
	}
	public void clearData1() throws Exception
	{
		Thread.sleep(3000);
		//name.sendKeys(Keys.CLEAR);
		//email.sendKeys(Keys.CLEAR);
		password.sendKeys(Keys.CLEAR);
		
	}
	
	

}
