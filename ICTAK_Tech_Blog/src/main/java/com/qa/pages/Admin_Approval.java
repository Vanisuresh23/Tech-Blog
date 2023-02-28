package com.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.ictak_techblog.Base;

public class Admin_Approval extends Base {
	
	@FindBy(xpath = "//p[text()=' Actions']")
	private WebElement actions;
	@FindBy(xpath ="//a[text()='Pending Approvals']")
	private WebElement pendingapproval;
	@FindBy(xpath ="(//button[text()='Approve'])[1]")
	private WebElement approve;
	@FindBy(name="p_post")
	private WebElement message;
	@FindBy (xpath="//button[text()='send']")
	private WebElement send;
	@FindBy(xpath="//button[text()='Reject']")
	private WebElement reject;
//	@FindBy(name="p_post")			
//	private WebElement message;
	@FindBy(xpath="//a[text()='logout']")
	private WebElement logout;
	
	
	public Admin_Approval(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickAction() throws Exception
	{
		actions.click();
		Thread.sleep(3000);
	}
	public void clickPendingApproval() throws Exception
	{
		pendingapproval.click();
		Thread.sleep(3000);
	}
	public void clickApprove() throws Exception
	{
		approve.click();
		Thread.sleep (3000);
	}
	public void post(String post) throws Exception
	{
		message.sendKeys(post);
		Thread.sleep(3000);
	}
	public void send() throws Exception
	{
		send.click();
		Thread.sleep(3000);
	}
	public void reject() throws Exception
	{
		reject.click();
		Thread.sleep(3000);
	}
	public void message_Reject(String rejectedMessage) throws InterruptedException
	{
		message.sendKeys(rejectedMessage);
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
