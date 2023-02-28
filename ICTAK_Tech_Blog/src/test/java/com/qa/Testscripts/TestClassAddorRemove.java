package com.qa.Testscripts;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.ictak_techblog.Base;
import com.qa.pages.Admin_AddorRemove;
import com.qa.pages.LoginPage;
import com.qa.utils.ExcelUtility;

public class TestClassAddorRemove extends Base {
	
	LoginPage  login;
	Admin_AddorRemove addorremove;
    
   
	
     
     @Test(priority=1)
 	public void Loginasadmin() throws Exception
 	{
    	 login=new LoginPage (driver);
    	 addorremove=new Admin_AddorRemove(driver);
 		
    	 
    			
    			login.clickDropdown();
    			login.clickLogin();
    			String Uname=ExcelUtility.getCellData(0,0,System.getProperty("user.dir")+"\\src\\main\\resources\\TechBlog.xlsx",2);
    			String password=ExcelUtility.getAdminPassword(0,1,System.getProperty("user.dir")+"\\src\\main\\resources\\TechBlog.xlsx",2);
    			String category=ExcelUtility.getCellData(1, 0,System.getProperty("user.dir")+"\\src\\main\\resources\\TechBlog.xlsx",6); 
    			
                 login.enteruserame(Uname);
    				login.enterpassword(password);
    			
                   login.Login();
                   addorremove.clickactions();
                   addorremove.addorremovecategory();
                   
                   
                   addorremove.setCategory(category);
                   addorremove.clickAdd();
                   Alert alert = driver.switchTo().alert();
           		   String alertMessage = alert.getText();
           		   Assert.assertEquals(alertMessage, "category added successfully");
           		   alert.accept();
                   
           		   addorremove.clickactions();
                   addorremove.addorremovecategory();
                
                   addorremove.scrollPageDown();
                   addorremove.clickRemove();
                   Alert alert1 = driver.switchTo().alert();
           		   String alertMessage1 = alert1.getText();
           		   Assert.assertEquals(alertMessage1, "category deleted successfully");
           		   alert1.accept();   
                   addorremove.scrollPageUp();
                   login.clickLogout();
                      
 	}       		

}
