package com.qa.Testscripts;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;


import com.qa.ictak_techblog.Base;
import com.qa.pages.LoginPage;
import com.qa.utils.ExcelUtility;

public class TestClassLogin  extends Base {
	
    LoginPage login;
   
	
     
     @Test(priority=1)
 	public void Loginasadmin() throws Exception
 	{
    	 login=new LoginPage(driver);
 		
    	 
    	//valid data		
    			login.clickDropdown();
    			login.clickLogin();
    			String Uname=ExcelUtility.getCellData(0,0,System.getProperty("user.dir")+"\\src\\main\\resources\\TechBlog.xlsx",2);
    			String password=ExcelUtility.getAdminPassword(0,1,System.getProperty("user.dir")+"\\src\\main\\resources\\TechBlog.xlsx",2);
                 login.enteruserame(Uname);
    				login.enterpassword(password);
    			
                   login.Login();
                   login.clickLogout();
                  
                   
         //invalid password
                   
                   login.clickDropdown();
       			login.clickLogin();
       			
       			String Uname1=ExcelUtility.getCellData(1,0,System.getProperty("user.dir")+"\\src\\main\\resources\\TechBlog.xlsx",2);
       			String password1=ExcelUtility.getCellData(1,1,System.getProperty("user.dir")+"\\src\\main\\resources\\TechBlog.xlsx",2);

       			login.enteruserame(Uname1);
       				login.enterpassword(password1);
       			
                      login.Login();
                      
                     Alert alert= driver.switchTo().alert();
                     String alertmessage=alert.getText();
                     Assert.assertEquals(alertmessage, "User not found");
                     alert.accept();
                     
          //invalid username           
                     
          			String Uname2=ExcelUtility.getCellData(2,0,System.getProperty("user.dir")+"\\src\\main\\resources\\TechBlog.xlsx",2);
          			String password2=ExcelUtility.getAdminPassword(2,1,System.getProperty("user.dir")+"\\src\\main\\resources\\TechBlog.xlsx",2);

          			login.enteruserame(Uname2);
          				login.enterpassword(password2);
          			
                         login.Login();
                         
                         Alert alert1= driver.switchTo().alert();
                         String alertmessage1=alert1.getText();
                         Assert.assertEquals(alertmessage1, "User not found");
                         alert.accept();
                   
                         
           //invalid data             
                        
             			String Uname3=ExcelUtility.getCellData(3,0,System.getProperty("user.dir")+"\\src\\main\\resources\\TechBlog.xlsx",2);
             			String password3=ExcelUtility.getCellData(3,1,System.getProperty("user.dir")+"\\src\\main\\resources\\TechBlog.xlsx",2);

             			login.enteruserame(Uname3);
             				login.enterpassword(password3);
             			
                            login.Login();

                            Alert alert2= driver.switchTo().alert();
                            String alertmessage2=alert2.getText();
                            Assert.assertEquals(alertmessage2, "User not found");
                            alert2.accept();
                          
                               
                                
                              
         	
      	
   	
	
 	}
     @Test(priority=2)
  	public void LoginasUser() throws Exception
  	{
     	 
    	 login=new LoginPage(driver);
     	 
     	//valid data
    	 
     			login.clickDropdown();
     			login.clickLogin();
     			String Uname=ExcelUtility.getCellData(0,1,System.getProperty("user.dir")+"\\src\\main\\resources\\TechBlog.xlsx",0);
     			String password=ExcelUtility.getCellData(0,2,System.getProperty("user.dir")+"\\src\\main\\resources\\TechBlog.xlsx",0);
     			login.enteruserame(Uname);
     			login.enterpassword(password);
     			
     			login.Login();
     			login.clickLogout();
                   
     			
     	//invalid password
     			
     			login.clickDropdown();
     			login.clickLogin();
        			
        			String Uname1=ExcelUtility.getCellData(1,1,System.getProperty("user.dir")+"\\src\\main\\resources\\TechBlog.xlsx",0);
        			String password1=ExcelUtility.getCellData(1,2,System.getProperty("user.dir")+"\\src\\main\\resources\\TechBlog.xlsx",0);

        			login.enteruserame(Uname1);
        			login.enterpassword(password1);
        			
        			login.Login();

                    Alert alert3= driver.switchTo().alert();
                    String alertmessage3=alert3.getText();
                    Assert.assertEquals(alertmessage3, "User not found");
                    alert3.accept();
        	  
        //invalid data
        			
           			String Uname2=ExcelUtility.getCellData(2,1,System.getProperty("user.dir")+"\\src\\main\\resources\\TechBlog.xlsx",0);
           			String password2=ExcelUtility.getAdminPassword(2,2,System.getProperty("user.dir")+"\\src\\main\\resources\\TechBlog.xlsx",0);

           			login.enteruserame(Uname2);
           			login.enterpassword(password2);
           			
           			login.Login();
           			Alert alert4= driver.switchTo().alert();
                    String alertmessage4=alert4.getText();
                    Assert.assertEquals(alertmessage4, "User not found");
                    alert4.accept();
           		       
        //invalid username                 
                         
              			String Uname3=ExcelUtility.getCellData(3,1,System.getProperty("user.dir")+"\\src\\main\\resources\\TechBlog.xlsx",0);
              			String password3=ExcelUtility.getCellData(3,2,System.getProperty("user.dir")+"\\src\\main\\resources\\TechBlog.xlsx",0);

              			login.enteruserame(Uname3);
              			login.enterpassword(password3);
              			
              			login.Login();
              			Alert alert5= driver.switchTo().alert();
                        String alertmessage5=alert3.getText();
                        Assert.assertEquals(alertmessage5, "User not found");
                        alert5.accept();
                           
                             
                              
	
 	} 	
     @Test(priority=3)
   	public void LoginasTrainer() throws Exception
   	{
      	login=new LoginPage(driver);
      	 
      //valid data
      	
      	login.clickDropdown();
      	login.clickLogin();
      			String Uname=ExcelUtility.getCellData(0,1,System.getProperty("user.dir")+"\\src\\main\\resources\\TechBlog.xlsx",1);
      			String password=ExcelUtility.getCellData(0,2,System.getProperty("user.dir")+"\\src\\main\\resources\\TechBlog.xlsx",1);
      			login.enteruserame(Uname);
      			login.enterpassword(password);
      			
      			login.Login();
      			login.clickLogout();
                    
      //invalid password
      			
      			login.clickDropdown();
      			login.clickLogin();
         			
         			String Uname1=ExcelUtility.getCellData(1,1,System.getProperty("user.dir")+"\\src\\main\\resources\\TechBlog.xlsx",1);
         			String password1=ExcelUtility.getCellData(1,2,System.getProperty("user.dir")+"\\src\\main\\resources\\TechBlog.xlsx",1);

         			login.enteruserame(Uname1);
         			login.enterpassword(password1);
         			
         			login.Login();
         			Alert alert6= driver.switchTo().alert();
                    String alertmessage6=alert6.getText();
                    Assert.assertEquals(alertmessage6, "User not found");
                    alert6.accept();
         			
       //invalid data                
            			String Uname2=ExcelUtility.getCellData(2,1,System.getProperty("user.dir")+"\\src\\main\\resources\\TechBlog.xlsx",1);
            			String password2=ExcelUtility.getCellData(2,2,System.getProperty("user.dir")+"\\src\\main\\resources\\TechBlog.xlsx",1);

            			login.enteruserame(Uname2);
            			login.enterpassword(password2);
            			
            			login.Login();
            			Alert alert7= driver.switchTo().alert();
                        String alertmessage7=alert7.getText();
                        Assert.assertEquals(alertmessage7, "User not found");
                        alert7.accept();
            			
                           
        //invalid username                  
                          
               			String Uname3=ExcelUtility.getCellData(3,1,System.getProperty("user.dir")+"\\src\\main\\resources\\TechBlog.xlsx",1);
               			String password3=ExcelUtility.getCellData(3,2,System.getProperty("user.dir")+"\\src\\main\\resources\\TechBlog.xlsx",1);

               			login.enteruserame(Uname3);
               			login.enterpassword(password3);
               			
               			login.Login();
               			Alert alert8= driver.switchTo().alert();
                        String alertmessage8=alert8.getText();
                        Assert.assertEquals(alertmessage8, "User not found");
                        alert8.accept();
                            
                              
                               
 	
  	} 	}
     

