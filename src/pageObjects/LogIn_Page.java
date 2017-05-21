package pageObjects;
        import org.openqa.selenium.*;
import org.testng.Reporter;

import utility.Log;
    public class LogIn_Page extends BaseClass {
           private static WebElement element = null;
        
        public LogIn_Page(WebDriver driver){
            	super(driver);
        }     
        public static WebElement txtbx_UserName() throws Exception{
        	try{
	            element = driver.findElement(By.id("login"));
	            Log.info("Username text box is found on the Login Page");
        	}catch (Exception e){
           		Log.error("UserName text box is not found on the Login Page");
           		throw(e);
           		}
           	return element;
            }
        
        public static WebElement txtbx_Password() throws Exception{
        	try{
	        	element = driver.findElement(By.id("password"));
	            Log.info("Password text box is found on the Login page");
        	}catch (Exception e){
        		Log.error("Password text box is not found on the Login Page");
           		throw(e);
           		}
           	return element;
        }
        
        public static WebElement btn_LogIn() throws Exception{
        	try{
	        	element = driver.findElement(By.xpath("//*[@id='UserPassForm']/form/button"));
	            Log.info("Submit button is found on the Login page");
        	}catch (Exception e){
        		Log.error("Submit button is not found on the Login Page");
           		throw(e);
          
           		}
           	return element;
        }
        public static WebElement login_Home() throws Exception{
        	try{ 
	        	 element = driver.findElement(By.xpath(".//div[text()='My Timesheets']"));
	             Log.info("Timesheet Page Loaded after login");
	             Log.info("SignIn Action Completed");
           }catch (Exception e){
          		Log.error("Timesheet Page is not Loaded after login");
          		throw(e);
          		}
          	return element;
        }
    }
