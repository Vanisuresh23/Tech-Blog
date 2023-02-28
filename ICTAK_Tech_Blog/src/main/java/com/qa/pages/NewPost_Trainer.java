package com.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import com.qa.ictak_techblog.Base;

public class NewPost_Trainer extends Base{
	
 
	
	
	public NewPost_Trainer(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[text()='New post']")
	private WebElement newPost;
	
	@FindBy(name="P_title")
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
	
	@FindBy(xpath = "(//img[@class='mx-2'])[1]")
	private WebElement facebook;
	
	@FindBy(xpath = "//img[@src='../../assets/images/insta icon.png']")
	private WebElement instagram;
	
	@FindBy(xpath = "//img[@src='../../assets/images/linkicon.png']")
	private WebElement linkedin;
	
	@FindBy(xpath = "//img[@src='../../assets/images/twiticon.jpg']")
	private WebElement twitter;
	
	@FindBy(xpath = "//a[text()='My posts']")
	private WebElement myPost;
	
	@FindBy(xpath = "//p[text()='Terms and conditions']")
	private WebElement terms;
	
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
			select.selectByVisibleText("ELECTRONICS");
			Thread.sleep(3000);			
	}

	public void setPost(String blog) throws InterruptedException
	{
		post.sendKeys(blog);
		Thread.sleep(3000);
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
	
	public void clickFacebook() throws InterruptedException
	{
		Actions actions = new Actions(driver);
		actions.moveToElement(facebook).click().perform();
		Thread.sleep(3000);
		
	}
	
	public void clickInstagram() throws InterruptedException
	{
		instagram.click();
		Thread.sleep(3000);
	}
	
	public void clickLinkedin() throws InterruptedException
	{
		linkedin.click();
		Thread.sleep(3000);
	}
	
	public void clickTwitter() throws InterruptedException
	{
		twitter.click();
		Thread.sleep(3000);
	}
	
	public void clickMyPost() throws InterruptedException
	{
		myPost.click();
		Thread.sleep(3000);
	}
	
	public void clickAllFields() throws InterruptedException
	{
		title.click();
		Thread.sleep(3000);
		url.click();
		Thread.sleep(3000);
		category.click();
		Thread.sleep(3000);
		category.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(3000);
		Actions actions = new Actions(driver);
		actions.moveToElement(post).click().perform();		
		Thread.sleep(3000);
	}
	
	public void clickTermsAndConditions() throws InterruptedException
	{
		Actions actions = new Actions(driver);
		actions.moveToElement(terms).click().perform();
		Thread.sleep(3000);
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
	
}
