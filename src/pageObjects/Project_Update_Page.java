package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Log;
 
public class Project_Update_Page extends BaseClass {
	private static WebElement element;
    public Project_Update_Page(WebDriver driver){
    	super(driver);
    	} 
     public static class Project_Details{
 
         
    	 public static WebElement start_Date(){
        	 element = null;
           	try{
           		element= driver.findElement(By.xpath("//input[@name='startDate']"));
           		Log.info("Start date field found in Project Details");
           	}catch (Exception e){
           		Log.error("Start date field not found in Project Details");
           		
           		throw(e);
           		}
           	return element;
            }
 
  
         public static WebElement target_Date(){
        	 element = null;
          	try{
          		element= driver.findElement(By.xpath("//input[@name='targetDate']"));
          		Log.info("Target date field found in Project Details");
          	}catch (Exception e){
          		Log.error("Target date field not found in Project Details");
          		throw(e);
          		}
          	return element;
            }
         
 
         public static WebElement description_txt() throws Exception{
            element = null;
         	try{
         		element= driver.findElement(By.xpath("//span[text()='Description DD']//ancestor::label//following::div[1]/div/div/div"));
         		Log.info("Description field found in Project Details");
         	}catch (Exception e){
         		Log.error("Description field not found in Project Details");
         		throw(e);
         		}
         	return element;
            }
 
 
         public static WebElement objective_txt(){
        	  element = null;
           	try{
           		element= driver.findElement(By.xpath("//span[text()='Objective']//ancestor::label//following::div[1]/div/div/div"));
           		Log.info("Objective field found in Project Details");
         	}catch (Exception e){
         		Log.error("Objective field not found in Project Details");
         		throw(e);
         		}
           	return element;
         	}
         public static WebElement priority_combo(){
       	  element = null;
          	try{
          		element= driver.findElement(By.xpath("//*[@name='LLPriorityId']"));
          		Log.info("Priority field found in Project Details");
        	}catch (Exception e){
        		Log.error("Priority field not found in Project Details");
        		throw(e);
        		}
          	return element;
        	}
         public static WebElement update_btn(){
          	  element = null;
             	try{
             		element= driver.findElement(By.xpath("//a[@data-qtip='Save (Ctrl + S)']"));
             		Log.info("Update/Save button found in Project Details");
           	}catch (Exception e){
           		Log.error("Update/Save button not found in Project Details");
           		throw(e);
           		}
             	return element;
           	}
         }
     
	public static class Project_Settings{
	 
	         
		 public static WebElement txt_Price(){
	    	 element = null;
	       	try{
	       		element= driver.findElement(By.xpath(".//*[@id='default_products_page_container']/div[4]/div[2]/form/div[1]/p[1]/span[2]"));
	       		Log.info("Product Price is found for Product 2");
	       	}catch (Exception e){
	       		Log.error("Product 2 Sales Price is not found");
	       		throw(e);
	       		}
	       	return element;
	        }
	
	
	     public static WebElement img_Product(){
	    	 element = null;
	      	try{
	      		element= driver.findElement(By.xpath(".//*[@id='default_products_page_container']/div[4]/div[1]/a"));
	      		Log.info("Product Image is found for Product 2");
	      	}catch (Exception e){
	      		Log.error("Product 2 Image is not found");
	      		throw(e);
	      		}
	      	return element;
	        }
	     
	
	     public static WebElement txt_Name() throws Exception{
	        element = null;
	     	try{
	     		element= driver.findElement(By.xpath(".//*[@id='default_products_page_container']/div[3]/div[2]/h2"));
	     		Log.info("Product Name is found for Product 2");
	     	}catch (Exception e){
	     		Log.error("Product 2 Name is not found");
	     		throw(e);
	     		}
	     	return element;
	        }
	
	
	     public static WebElement btn_AddToCart(){
	    	  element = null;
	       	try{
	       		element= driver.findElement(By.xpath(".//*[@id='default_products_page_container']/div[4]/div[2]/form/div[2]/div[1]/span/input"));
	       		Log.info("Add to Cart button is found for Product 2");
	       	}catch (Exception e){
	       		Log.error("Product 2 Add to Cart button is not found");
	       		throw(e);
	       		}
	       	return element;
	     	}
	 
	     }
	
	
	public static class PopUpAddToCart{
		 
	    
		 public static WebElement btn_GoToCart(){
	   	 element = null;
	      	try{
	      		element= driver.findElement(By.xpath(".//*[@id='fancy_notification_content']/a[1]"));
	      		Log.info("Go to Cart button is found on the Cart Pop Up window");
	      	}catch (Exception e){
	      		Log.info("Go to Cart button is not found on the Cart Pop Up window");
	      		throw(e);
	      		}
	      	return element;
	       }
		 
		 public static WebElement btn_ContShopping(){
		   	 element = null;
		      	try{
		      		element= driver.findElement(By.xpath(".//*[@id='fancy_notification_content']/a[2]"));
		      		Log.info("Continue Shopping button is found on Cart Pop Up window");
		      	}catch (Exception e){
		      		Log.info("Continue Shopping button is not found on Cart Pop Up window");
		      		throw(e);
		      		}
		      	return element;
		       }
		}
	 
}