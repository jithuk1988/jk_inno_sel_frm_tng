package appModules;

import pageObjects.Home_Page;
import pageObjects.LogIn_Page;
import pageObjects.ProductListing_Page;
import pageObjects.Project_Page;
import utility.Constant;
import utility.ExcelUtils;
import utility.Log;

// This is called Modularization, when we club series of actions in to one Module
// For Modular Driven Framework, please see http://www.toolsqa.com/modular-driven/ 
public class ProjectCreation {
	// iTestcaseRow is the row number of our Testcase name in the Test Data sheet
	// iTestcaseRow is passed as an Argument to this method, so that it can used inside this method
	// For use of Functions & Parameters, please see http://www.toolsqa.com/function-parameters/
	public static void proNavigation(int iTestCaseRow) throws Exception{
		try{
			
        	// iTestcaseRow is the row number of our Testcase name in the Test Data sheet
        	// Constant.Col_ProductType is the column number for Product Type column in the Test Data sheet
        	// Please see the Constant class in the Utility Package
        	// For Use of Constant Variables, please see http://www.toolsqa.com/constant-variables/
			// If condition will check that if the Excel value for the Product Type is Accessories, then do this
			
				// Selecting the link Accessories from Home Page under Top Navigation
				// This is call Page Object Model (POM)
	        	// For use of POM, please see http://www.toolsqa.com/page-object-model/
				Home_Page.TopNavigation.Project_Main.projectPage();
	            // Printing the logs
				Log.info("Project Entity page is opened");
				Thread.sleep(8000);
		
		// Every exception thrown from any class or method, will be catch here and will be taken care off
		// For Exception handling please see http://www.toolsqa.com/selenium-webdriver/exception-handling-selenium-webdriver/
	    }catch(Exception e){
			// Here I have used this as just for the sake of an example
			// I am just catching the Exception and again throwing it back to the Main testcase, without handling it
	    	// You may like to print some information here, in case of exception
	    	throw(e);
			}
		}
	
	
	// iTestcaseRow is the row number of our Testcase name in the Test Data sheet
	// iTestcaseRow is passed as an Argument to this method, so that it can used inside this method
	// For use of Functions & Parameters, please see http://www.toolsqa.com/function-parameters/
	public static void proCreation(int iTestCaseRow) throws Exception{
		try{
			
			// iTestcaseRow is the row number of our Testcase name in the Test Data sheet
        	// Constant.Col_ProductNumber is the column number for Product Number column in the Test Data sheet
        	// Please see the Constant class in the Utility Package
        	// For Use of Constant Variables, please see http://www.toolsqa.com/constant-variables/
			 String ProjectName=Constant.proname;
			 Project_Page.pro_NewButton().click();
			 Log.info("New Button Clicked" );
			 Thread.sleep(3000);
			 Project_Page.pro_CatCombo().click();
			 
			 Log.info("Project category combo Clicked" );
			 Thread.sleep(3000);
			 Project_Page.pro_CatSelection().click();
			 Log.info("Project Auto category Selected" );
			 Project_Page.pro_depCombo().click();
			 Log.info("Project Program combo Clicked" );
			 Thread.sleep(3000);
			 Project_Page.pro_depSelection().click();
			 Log.info("Project Program- Program 01 Selected" );
			 Project_Page.pro_nextButton().click();
			 Log.info("Project New Dialog Next button Clicked" );
			 Project_Page.pro_titleText().clear();
			 Log.info("Project Title field cleared" );
			 Project_Page.pro_titleText().sendKeys(ProjectName);
			 Log.info(ProjectName+" is entered in Project Title text box" );
			 Project_Page.pro_statusCombo().click();
			 Log.info("Project Status combo Clicked" );
			 Project_Page.pro_statusList().click();
			 Log.info("Project Status- Hold Selected" );
			 Project_Page.pro_saveButton().click();
			 Log.info("Project Save button clicked" );
			 Thread.sleep(20000);
	            // Printing the logs for what we have just performed
	           // Log.info(sUserName+" is entered in UserName text box" );
		 // Every exception thrown from any class or method, will be catch here and will be taken care off
		 // For Exception handling please see http://www.toolsqa.com/selenium-webdriver/exception-handling-selenium-webdriver/
		 }catch(Exception e){
			
			// Here I have used this as just for the sake of an example
			// I am just catching the Exception and again throwing it back to the Main testcase, without handling it
		    // You may like to print some information here, in case of exception
			throw(e);
			}
		}

	}
