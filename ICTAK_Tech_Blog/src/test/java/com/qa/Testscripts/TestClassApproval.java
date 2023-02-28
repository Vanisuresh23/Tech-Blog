package com.qa.Testscripts;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.ictak_techblog.Base;
import com.qa.pages.Admin_Approval;
import com.qa.pages.LoginPage;
import com.qa.utils.ExcelUtility;

public class TestClassApproval extends Base {
	Admin_Approval approval;
	LoginPage login;
   
   
	
     
     @Test(priority=1)
 	public void Loginasadmin() throws Exception
 	{
    	 approval=new Admin_Approval(driver);
    	 login=new LoginPage(driver);
 		
    	 
    			
    			login.clickDropdown();
    			login.clickLogin();
    			String Uname=ExcelUtility.getCellData(0,0,System.getProperty("user.dir")+"\\src/main/resources/TechBlog.xlsx",2);
    			String password=ExcelUtility.getAdminPassword(0,1,System.getProperty("user.dir")+"\\src/main/resources/TechBlog.xlsx",2);
    			String message=ExcelUtility.getCellData(0,0,System.getProperty("user.dir")+"\\src/main/resources/TechBlog.xlsx",7);
    			String message1=ExcelUtility.getCellData(0,1,System.getProperty("user.dir")+"\\src/main/resources/TechBlog.xlsx",7);
                 login.enteruserame(Uname);
    				login.enterpassword(password);
    			
                   login.Login();
                   approval.clickAction();
                   approval.clickPendingApproval();
                   approval.clickApprove();
                   Alert alert= driver.switchTo().alert();
                   String alertmessage=alert.getText();
                   Assert.assertEquals(alertmessage, "Post approved");
                   alert.accept();
                   approval.post(message);
                   approval.send();
                   Alert alert1= driver.switchTo().alert();
                   String alertmessage1=alert1.getText();
                   Assert.assertEquals(alertmessage1, "message send to user");
                   alert1.accept();
                   approval.clickAction();
                   approval.clickPendingApproval();
                   approval.reject();
                   Alert alert2= driver.switchTo().alert();
                   String alertmessage2=alert2.getText();
                   Assert.assertEquals(alertmessage2, "post rejected");
                   alert2.accept();
                   approval.scrollPageDown();
                   approval.message_Reject(message1);
                   approval.send();
                   Alert alert3= driver.switchTo().alert();
                   String alertmessage3=alert3.getText();
                   Assert.assertEquals(alertmessage3, "message send to user");
                   alert3.accept();
                   
                   approval.scrollPageUp();
                   
                   login.clickLogout();

}
}
