package utility;

import java.util.Date;

public class Constant {
	    public static final String URL = "https:/q3.innotas.io";
	    public static final String Username = "v5new6auto";
	    public static final String Password ="innotas";
		public static final String Path_TestData = "F://WorkSpace//OnlineStore//src//testData//";
		public static final String File_TestData = "TestData.xlsx";
		public static final Date date = new Date();
		 public static final String dte = String.format("%tc", date );
		 public static final String proname= "Auto Project "+dte;
		
		//Test Data Sheet Columns
		public static final int Col_TestCaseName = 0;	
		public static final int Col_UserName =1 ;
		public static final int Col_Password = 2;
		public static final int Col_Browser = 3;
		public static final int Col_ProductType = 4;
		public static final int Col_ProductNumber = 5;
		public static final int Col_FirstName = 6;
		public static final int Col_LastName = 7;
		public static final int Col_Address = 8;
		public static final int Col_City = 9;
		public static final int Col_Country = 10;
		public static final int Col_Phone = 11;
		public static final int Col_Email = 12;
		public static final int Col_Result = 13;
		public static final String Path_ScreenShot = "F://WorkSpace//OnlineStore//src//Screenshots//";
	}
