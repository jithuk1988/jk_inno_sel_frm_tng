package pageObjects;
import org.openqa.selenium.*;
import org.testng.Reporter;

import utility.Log;
public class Project_Page extends BaseClass {
	 private static WebElement element = null;
	public Project_Page(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public static WebElement pro_NewButton() throws Exception{
    	try{
            element = driver.findElement(By.xpath("//span[text()='New' and starts-with(@id,'button')]"));
            Log.info("New Button found on the page");
    	}catch (Exception e){
       		Log.error("New Button is not identified in the page");
       		throw(e);
       		}
       	return element;
        }
	public static WebElement pro_CatCombo() throws Exception{
    	try{
            element = driver.findElement(By.xpath("//input[starts-with(@id,'richcombo') and @name='categoryId']"));
            Log.info("Category Combobox found on the New Dialog");
    	}catch (Exception e){
       		Log.error("Category Combobox not found on the New Dialog");
       		throw(e);
       		}
       	return element;
        }
	public static WebElement pro_CatSelection() throws Exception{
    	try{
            element = driver.findElement(By.xpath("//*[@class='x-list-plain']/li[contains(text(),'Auto Category')]"));
            Log.info("Category List found on the New Dialog");
    	}catch (Exception e){
       		Log.error("Category List not found on the New Dialog");
       		throw(e);
       		}
       	return element;
        }
	public static WebElement pro_depCombo() throws Exception{
    	try{
            element = driver.findElement(By.xpath(".//input[starts-with(@id,'richcombo') and @name='parentId']"));
            Log.info("Program Combobox found on the New Dialog");
    	}catch (Exception e){
       		Log.error("Program Combobox not found on the New Dialog");
       		throw(e);
       		}
       	return element;
        }
	public static WebElement pro_depSelection() throws Exception{
    	try{
            element = driver.findElement(By.xpath("//*[@class='x-list-plain']/li[contains(text(),'Program 01')]"));
            Log.info("Program List found on the New Dialog");
    	}catch (Exception e){
       		Log.error("Program List not found on the New Dialog");
       		throw(e);
       		}
       	return element;
        }
	public static WebElement pro_nextButton() throws Exception{
    	try{
            element = driver.findElement(By.xpath("//span[text()='Next']"));
            Log.info("Next Button found on the New Dialog");
    	}catch (Exception e){
       		Log.error("Next Button not found on the New Dialog");
       		throw(e);
       		}
       	return element;
        }
	public static WebElement pro_titleText() throws Exception{
    	try{
            element = driver.findElement(By.xpath("//textarea[@name='title']"));
            Log.info("Title field found on the New Dialog");
    	}catch (Exception e){
       		Log.error("Title field  not found on the New Dialog");
       		throw(e);
       		}
       	return element;
        }
	public static WebElement pro_statusCombo() throws Exception{
    	try{
            element = driver.findElement(By.xpath("//*[@name='LLStatusId']"));
            Log.info("Status Combobox found on the New Dialog");
    	}catch (Exception e){
       		Log.error("Status Combobox not found on the New Dialog");
       		throw(e);
       		}
       	return element;
        }
	public static WebElement pro_statusList() throws Exception{
    	try{
            element = driver.findElement(By.xpath("//div[contains(text(),'Hold')]"));
            Log.info("Status List found on the New Dialog");
    	}catch (Exception e){
       		Log.error("Status List not found on the New Dialog");
       		throw(e);
       		}
       	return element;
        }
		public static WebElement pro_saveButton() throws Exception{
    	try{
            element = driver.findElement(By.xpath("//span[text()='Save']"));
            Log.info("Save Button found on the New Dialog");
    	}catch (Exception e){
       		Log.error("Save Button not found on the New Dialog");
       		throw(e);
       		}
       	return element;
        }
/*

  WebElement projectcat=driver.findElement(By.xpath("//input[starts-with(@id,'richcombo') and @name='categoryId']"));
              projectcat.click();
              WebElement projectcatsel=driver.findElement(By.xpath("//*[@class='x-list-plain']/li[contains(text(),'Auto Category')]"));
              projectcatsel.click();
            //  Thread.sleep(3000); 
              WebElement projectdep=driver.findElement(By.xpath(".//input[starts-with(@id,'richcombo') and @name='parentId']"));
              projectdep.sendKeys("Program 01"); 
      		  //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='x-list-plain']/li[contains(text(),'Program 01')]")));
        
      		 // WebElement projectdepsel=driver.findElement(By.xpath("//*[@class='x-list-plain']/li[contains(text(),'Program 01')]"));
      		//WebElement element = driver.findElement(By.xpath("//*[@class='x-list-plain']/li[contains(text(),'Program 01')]"));
      		//Actions actions = new Actions(driver);
      		//actions.moveToElement(element).click().perform();
      		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='x-list-plain']/li[contains(text(),'Program 01')]")));
      		  //projectdepsel.click();
              WebElement projectdate=driver.findElement(By.xpath("//input[starts-with(@id,'datefield')]"));
              projectdate.click();
              WebElement projectnext=driver.findElement(By.xpath("//span[text()='Next']"));
              projectnext.click();
              Thread.sleep(3000); 
              WebElement projecttitle=driver.findElement(By.xpath("//textarea[@name='title']"));
              projecttitle.sendKeys(proname);
              //Thread.sleep(3000); 
              WebElement projectstatus=driver.findElement(By.xpath("//*[@name='LLStatusId']"));
              projectstatus.click();
              WebElement projectstatussel=driver.findElement(By.xpath("//div[contains(text(),'Hold')]"));
              projectstatussel.click();
              WebElement projectsave=driver.findElement(By.xpath("//span[text()='Save']"));


*/

}   
