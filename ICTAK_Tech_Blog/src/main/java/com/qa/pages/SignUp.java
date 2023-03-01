package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.ictak_techblog.Base;

public class SignUp extends Base {
	
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
	@FindBy(xpath="//b[text()='Password must contain 8 characters ']")
	private WebElement passwordalert;
	@FindBy(xpath="//b[text()='Enter Valid Email']")
	private WebElement emailalert;
	@FindBy(xpath="//select[@formcontrolname='id']")
	private WebElement account;
	
	public SignUp(WebDriver driver)
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
	public void enterName(String userName) throws Exception
	{
		name.sendKeys(userName);
		Thread.sleep(3000);
	}
	public void clickAccountType() throws Exception
	{
		accountType.click();
		Select select = new Select(accountType);
		select.selectByVisibleText("trainer");
		Thread.sleep(3000);
		
	}
	public void clickAccount() throws Exception
	{
		account.click();
		Select select = new Select(account);
		select.selectByVisibleText("user");
		Thread.sleep(3000);
		
	}
	public void clickQualification(String qualification1)
	{
		qualification.click();
		Select select=new Select(qualification);
		select.selectByVisibleText(qualification1);
		
	}	
	public void enterEmail(String userEmail) throws Exception
	{
		email.sendKeys(userEmail);
		Thread.sleep(3000);
	}
	public void enterPassword(String userPassword) throws Exception
	{
		password.sendKeys(userPassword);
		Thread.sleep(3000);
	}
	public String getTextofpassword()
	{
		String alert=passwordalert.getText();
		return alert;
	}
	public String getTextofemail()
	{
		String alert=emailalert.getText();
		return alert;
	}
	public boolean isEnabledSubmit() throws Exception
	{
		
//		submit.click();
//		Thread.sleep(3000);
		boolean isEnabled=submit.isEnabled();
		return isEnabled;
		
	}
	public void clickSubmit() throws Exception
	{
		Actions actions = new Actions(driver);
		actions.moveToElement(submit).click().perform();
		//submit.click();
		Thread.sleep(3000);
	}
	public void clearData()
	{
		name.clear();
		email.clear();
		password.clear();
	}
	/*public void clickSignupback() throws Exception
	{
		signupback.click();
		Thread.sleep(3000);
	}*/
	

}
