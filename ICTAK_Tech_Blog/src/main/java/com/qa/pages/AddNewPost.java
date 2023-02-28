package com.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import com.qa.ictak_techblog.Base;

public class AddNewPost extends Base{
	
	public AddNewPost(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = " //p[text()=' Actions']")
	private WebElement actions;
	
	@FindBy(xpath = "//a[text()='New post']")
	private WebElement newPost;
	
	@FindBy(id="exampleInputEmail1")
	private WebElement title;
	
	@FindBy(name="P_image")
	private WebElement url;
	
	@FindBy(name="p_cat")
	private WebElement category;
	
	@FindBy(name="p_post")
	private WebElement post;
	
	@FindBy(xpath = "//button[text()='Submit']")
	private WebElement submit;
	
	@FindBy(xpath = "//a[text()='logout']")
	private WebElement logout;
	
	@FindBy(xpath = "(//a[text()='Home'])[2]")
	private WebElement home;
	
	@FindBy(xpath = "//a[text()='contact us']")
	private WebElement contactUs;
	
	@FindBy(xpath = "//a[text()='about us']")
	private WebElement aboutUs;
	
	@FindBy(xpath = "//a[text()='My posts']")
	private WebElement myPost;
	
	@FindBy(xpath = "//p[text()='Terms and conditions']")
	private WebElement terms;
	
	@FindBy(xpath = " //p[text()=' copy right@2021']")
	private WebElement copyright;
	
	@FindBy(xpath = "//button[text()='Send for approval']")
	private WebElement send;
	
	@FindBy(xpath = "//h5[text()='Cyber Security']")
	private WebElement myBlog;
	
	@FindBy(xpath = "//h2[text()='WELCOME TO ICTAK TECH BLOG']")
	private WebElement homeTitle;
	
	@FindBy(xpath = "//h1[text()='Contact us']")
	private WebElement contactUsTitle;
	
	@FindBy(xpath = "//h2[text()='ABOUT ']")
	private WebElement aboutUsTitle;
	
	public void clickActions() throws InterruptedException
	{
		actions.click();
		Thread.sleep(3000);
	}
	
	public void clickNewPost() throws InterruptedException
	{
		newPost.click();
		Thread.sleep(3000);
	}
	
	public void setTitle(String titleOfPost) throws InterruptedException
	{
		title.sendKeys(titleOfPost);
		Thread.sleep(3000);
	}
	
	public void setUrl(String pictureUrl) throws InterruptedException
	{
		url.sendKeys(pictureUrl);
		Thread.sleep(3000);
	}	
	
	public void selectCategory() throws InterruptedException
	{
			Select select=new Select(category);
			select.selectByVisibleText("COMPUTER");
			Thread.sleep(3000);			
	}
	
	public void setPost(String blog) throws InterruptedException
	{
		post.sendKeys(blog);
		Thread.sleep(3000);
	}
	
	public boolean isEnabledSubmitButton() throws InterruptedException
	{
		boolean isEnabled=submit.isEnabled();
		return isEnabled;	
	}	
	
	public boolean isEnabledSendForApproval() throws InterruptedException
	{
		Boolean isEnabled=send.isEnabled();
		return isEnabled;
		
	}
	
	public void clickSubmit() throws InterruptedException
	{
		Actions actions = new Actions(driver);
		actions.moveToElement(submit).click().perform();
		Thread.sleep(3000);
		
	}	
	
	public void clickLogout() throws InterruptedException
	{		
		Actions actions = new Actions(driver);
		actions.moveToElement(logout).click().perform();
		Thread.sleep(3000);
	}
		
	public void clickHome() throws InterruptedException
	{
		Actions actions = new Actions(driver);
		actions.moveToElement(home).click().perform();
		Thread.sleep(3000);
	}
	
	public void clickContactUs() throws InterruptedException
	{
		Actions actions = new Actions(driver);
		actions.moveToElement(contactUs).click().perform();
		Thread.sleep(3000);
	}
	
	public void clickAboutUs() throws InterruptedException
	{
		Actions actions = new Actions(driver);
		actions.moveToElement(aboutUs).click().perform();
		Thread.sleep(3000);
	}
	
	
	public void clickMyPost() throws InterruptedException
	{
		myPost.click();
		Thread.sleep(3000);
	}
	
	public void clickSendForApproval() throws InterruptedException
	{
		Actions actions = new Actions(driver);
		actions.moveToElement(send).click().perform();
		Thread.sleep(3000);		
       
	}
	
	
	public String getTextOfCopyRight() throws InterruptedException
	{
		String copy=copyright.getText();
		return copy;
	}
	
	public String getHomeTitle()
	{
		String homeHeading=homeTitle.getText();
		return homeHeading;
	}
	
	public String getContactUsTitle()
	{
		String homeHeading=contactUsTitle.getText();
		return homeHeading;
	}
	
	public String getAboutUsTitle()
	{
		String homeHeading=aboutUsTitle.getText();
		return homeHeading;
	}
	
	public void scrollPageUp() throws InterruptedException
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
	       js.executeScript("window.scrollTo(0, 0)");
	       Thread.sleep(3000);
	       
	}
	public void scrollPageDown() throws Exception
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(3000);
		
	}
	
	public String getTextOfMyPost() throws InterruptedException
	{
		String blog=myBlog.getText();
		return blog;
	}
	
}
