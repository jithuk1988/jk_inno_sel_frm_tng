package appModules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

import pageObjects.BaseClass;
import pageObjects.CheckOut_Page;
import pageObjects.Project_Update_Page;
import pageObjects.Project_Update_Page.Project_Details;
import utility.Log;

// This is called Modularization, when we club series of actions in to one Module
// For Modular Driven Framework, please see http://www.toolsqa.com/modular-driven/ 
public class ProjectUpdate_Action {
	 // I could have created a Function for it but I keep calculations in Functions and test steps in Module Actions
	 // It could have been avoided and simply put these steps in Test Case, it depends totally on you, everybody has their own choice
	 public static void projectDetailsUpdate(int iTestCaseRow) throws Exception{
				try{
					Project_Details.start_Date().sendKeys("1/8/2016");
					Log.info("Start date Added" );
					Project_Details.target_Date().sendKeys("30/9/2016");
					Log.info("Target date Added" );
					Project_Details.description_txt().sendKeys("Following-sibling-Select the following siblings of the context node. Siblings are at the same level of the current node as shown in the below screen. It will find the element after the current node.");
					Log.info("Description Added" );
					Project_Details.objective_txt().sendKeys("Parent-Selects the parent of the current node as shown in the below screen.");
					Log.info("Objective Added" );
					Project_Details.priority_combo().sendKeys("1:Immediate");
					Log.info("Priority Added" );
					Project_Details.update_btn().click();
					Log.info("Project Updated" );
					Thread.sleep(3000);
				}
				
		 catch(Exception e){
				
				// Here I have used this as just for the sake of an example
				// I am just catching the Exception and again throwing it back to the Main testcase, without handling it
			    // You may like to print some information here, in case of exception
				throw(e);
				}
		 }
	 


}