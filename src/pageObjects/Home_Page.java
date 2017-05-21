package pageObjects;
        import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Log;
import utility.Utils;
    public class Home_Page extends BaseClass{
            private static WebElement element = null;
           
        public Home_Page(WebDriver driver){
            	super(driver);
        }    
        public static WebElement inn_Home() throws Exception{
            try{ 
	        	 element = driver.findElement(By.xpath(".//div[text()='My Timesheets']"));
	             Log.info("Timesheet Page Loaded after login");
            }catch (Exception e){
           		Log.error("Timesheet Page is not Loaded after login");
           		throw(e);
           		}
           	return element;
        }
        public static WebElement lnk_LogOut() throws Exception{
            try{
	        	element = driver.findElement(By.xpath(".//a[@aria-label='Innotas (c) Admin']//span[@class='x-btn-arrow-el']"));
	        
	            Log.info("Log Out link is found on the Home Page");
            }catch (Exception e){
            	Log.error("Log Out link is not found on the Home Page");
           		throw(e);
           		}
           	return element;
        }
        
        public static class TopNavigation{
        	
        	public static class Project_Main{
        		
        			static WebElement mainElement;
      		
        		public static void projectPage() throws Exception{
        			try{
	        			mainElement = driver.findElement(By.xpath("//a[@href='home.pa#%5BT5%5D']"));
	        			Log.info("Project Entity link is found under Top Navigation");
	        			Utils.mouseHoverAction(mainElement, "Project(dd)");
        			}catch (Exception e){
        				Log.error("Project Entity link is not found under Top Navigation bar");
        				throw(e);
        			}
                   }
        		
        		public static void iMacs() throws Exception{
        			try{
	        			mainElement = driver.findElement(By.linkText("Product Category"));
	        			Log.info("Product category link is found under Top Navigation");
	        			Utils.mouseHoverAction(mainElement, "iMacs");
        			}catch (Exception e){
        				Log.error("Accessories link is not found under Product Category");
        				throw(e);
        			}
                   }
        		
        		public static void iPads() throws Exception{
        			try{
	        			mainElement = driver.findElement(By.linkText("Product Category"));
	        			Log.info("Product category link is found under Top Navigation");
	        			Utils.mouseHoverAction(mainElement, "iPads");
        			}catch (Exception e){
        				Log.error("Accessories link is not found under Product Category");
        				throw(e);
        			}
                   }
        		
        		public static void iPhones() throws Exception{
        			try{
	        			mainElement = driver.findElement(By.linkText("Product Category"));
	        			Log.info("Product category link is found under Top Navigation");
	        			Utils.mouseHoverAction(mainElement, "iPhones");
        			}catch (Exception e){
        				Log.error("Accessories link is not found under Product Category");
        				throw(e);
        			}
                   }
        		
        	}
        	
        }
        

      
    }
